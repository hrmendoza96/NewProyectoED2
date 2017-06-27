package proyectofinal_ed2_haroldmendoza_josefernandez;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.JOptionPane;



public class TDA_ARLF {
    
    private File archivo;
    private RandomAccessFile flujo;
    private final int sizeOfRecord = (Character.BYTES+1)+Integer.BYTES+(Character.BYTES+40)+(Character.BYTES+10)+Float.BYTES;
    private final int sizeOfHeader = Integer.BYTES;
    private LinkedList AvailList = new LinkedList();
    ArrayList<Person> listPersonas = new ArrayList();
    int rrnDelete;

    public TDA_ARLF(File archivo) {
        this.archivo = archivo;
        try {
            flujo = new RandomAccessFile(archivo, "rw");
            llenarAvailList();
            
        } catch (Exception e) {
            System.out.println("Archivo no existe");
        }
        
    }
    

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public RandomAccessFile getFlujo() {
        return flujo;
    }

    public void setFlujo(RandomAccessFile flujo) {
        this.flujo = flujo;
    }

    public LinkedList getAvailList() {
        return AvailList;
    }

    public void setAvailList(LinkedList AvailList) {
        this.AvailList = AvailList;
    }

    public ArrayList<Person> getListPersonas() {
        
        return listPersonas;
    }

    public void setListPersonas(ArrayList listPersonas) {
        this.listPersonas = listPersonas;
    }
    
    public void open(){
        try {
            flujo = new RandomAccessFile(archivo, "rw");
        } catch (Exception e) {
            System.out.println("Archivo no existe");
        }
    }
    
    public void close(){
        try {
            flujo.close();
        } catch (Exception e) {
        }
    }
    
    public boolean insert(Person persona) throws IOException{
        open();
        int rrn=0;
        try {
            while(true){
                rrn++;
                if(AvailList.isEmpty()){
                    
                    flujo.seek(archivo.length());
                    flujo.writeChar(persona.getEstadoRecord());
                    flujo.writeInt(persona.getId());
                    flujo.writeUTF(persona.getName());
                    flujo.writeUTF(persona.getBirthDate());
                    flujo.writeFloat(persona.getSalary());
                    close();
                    return true;
                }else{
                    flujo.seek(0);
                    AvailList.remove(0);
                    flujo.seek(sizeOfRecord*(rrn-1));
                    flujo.writeChar(persona.getEstadoRecord());
                    flujo.writeInt(persona.getId());
                    flujo.writeUTF(persona.getName());
                    flujo.writeUTF(persona.getBirthDate());
                    flujo.writeFloat(persona.getSalary());
                    close();
                    return true;
                    
                }
                
            }
        } catch (EOFException e) {
            
        }  
        return false;
    }//fin insert
    
    public void listar() throws IOException{
        open();
        Person persona;
        listPersonas = new ArrayList(); 
        try {
            while(true){
                persona = new Person();
                persona.setEstadoRecord(flujo.readChar());
                persona.setId(flujo.readInt());
                persona.setName(flujo.readUTF());
                persona.setBirthDate(flujo.readUTF());
                persona.setSalary(flujo.readFloat());
                if(persona.getEstadoRecord()=='-'){ ///verificar que el record no este marccado como borrado
                    listPersonas.add(persona);
                    System.out.println(listPersonas.get(listPersonas.size()-1).toString());
                }
                
            }
        } catch (EOFException e) {
        }
        
        close();
    }
    
    public int listarArbol() throws IOException{
        open();
        Person persona;
        int rrn = 0;
        listPersonas = new ArrayList(); 
        try {
            while(true){
                persona = new Person();
                persona.setEstadoRecord(flujo.readChar());
                persona.setId(flujo.readInt());
                persona.setName(flujo.readUTF());
                persona.setBirthDate(flujo.readUTF());
                persona.setSalary(flujo.readFloat());
                if(persona.getEstadoRecord()=='-'){ ///verificar que el record no este marccado como borrado
                    listPersonas.add(persona);
                }
                rrn++;
                
            }
        } catch (EOFException e) {
        }
        
        close();
        return rrn;
    }
    
    public Person search(String aux){
        open();
        Person persona = null;
        try {
            do {
                persona = new Person();
                persona.setEstadoRecord(flujo.readChar());
                persona.setId(flujo.readInt());
                persona.setName(flujo.readUTF());
                persona.setBirthDate(flujo.readUTF());
                persona.setSalary(flujo.readFloat());
                
            } while (!persona.getName().equals(aux));
            
        } catch (Exception e) {
        }
        close();
        
        return persona;
        
    }//fin search
    
    public boolean modify(Person p){
        boolean modifico = false;
        Person person = search(p.getName());
        
        
        
        
        
        return modifico;
    } //Fin modify
    
    public boolean delete(Person p){
        
        boolean seBorro=false;
        Person recordBorrar;
        try {
            recordBorrar = searchForDelete(p.getName());
               if(recordBorrar.getEstadoRecord()=='*'){
                   JOptionPane.showMessageDialog(null, "Record was already deleted");
                   return false;
               }else{
                   if((recordBorrar.getName()).equals(p.getName())){
                   open();
                   recordBorrar.setEstadoRecord('*'); //se declara borrado
                   System.out.println("El RRN es:"+rrnDelete);    
                   //se rescribe el record
                   flujo.seek(0);
                   flujo.seek((rrnDelete-1)*sizeOfRecord); 
                   flujo.writeChar(recordBorrar.getEstadoRecord());
                   flujo.writeInt(recordBorrar.getId());
                   flujo.writeUTF(recordBorrar.getName());
                   flujo.writeUTF(recordBorrar.getBirthDate());
                   flujo.writeFloat(recordBorrar.getSalary());
                   //Se agrega al AvailList el registro borrado
                   AvailList.add(0, rrnDelete);
                       System.out.println("Probando Availist");
                       
                       for (Object object : AvailList) {
                           String x = object.toString();
                           System.out.println("Hola");
                           System.out.println(x);
                       }
                    
                    close();
                    return true;
                    }
               }
        } catch (Exception e) {
        }
         
        return seBorro;
    }//Fin delete
    
    
    public Person searchForDelete(String aux){ //busqueda especial para el metodo delete
        open();
        Person persona = null;
        rrnDelete=0;
        try {
            do {
                persona = new Person();
                persona.setEstadoRecord(flujo.readChar());
                persona.setId(flujo.readInt());
                persona.setName(flujo.readUTF());
                persona.setBirthDate(flujo.readUTF());
                persona.setSalary(flujo.readFloat());
                rrnDelete++;
                
            } while (!persona.getName().equals(aux));
            
        } catch (Exception e) {
        }
        close();
        
        return persona;
        
    }//fin search
    
    public void llenarAvailList() throws IOException{
        
        Person persona;
        listPersonas = new ArrayList(); 
        try {
            while(true){
                persona = new Person();
                persona.setEstadoRecord(flujo.readChar());
                persona.setId(flujo.readInt());
                persona.setName(flujo.readUTF());
                persona.setBirthDate(flujo.readUTF());
                persona.setSalary(flujo.readFloat());
                if(persona.getEstadoRecord()=='*'){ ///verificar que el record este borrado
                    AvailList.add(persona);
                    System.out.println("Personas en el Availist");
                }
                
            }
        } catch (EOFException e) {
        }
        
        for (Object object : AvailList) {
            System.out.println(object.toString());
        }
        
    }

    
}
