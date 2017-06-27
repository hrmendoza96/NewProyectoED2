package proyectofinal_ed2_haroldmendoza_josefernandez;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import javax.swing.JOptionPane;



public class TDA_ARLF {
    
    private File archivo;
    private File IndexArchivo=new File("./IndexFile.bin");
    private RandomAccessFile flujoIndice;
    private RandomAccessFile flujo;
    private final int sizeOfRecord = (Character.BYTES+1)+Integer.BYTES+(Character.BYTES+40)+(Character.BYTES+10)+Float.BYTES;
    private LinkedList AvailList = new LinkedList();
    ArrayList<Person> listPersonas = new ArrayList();
    ArrayList<Indice> IndexFile = new ArrayList();
    int rrnDelete;
    int rrnModificar;

    public TDA_ARLF(File archivo) {
        this.archivo = archivo;
        try {
            flujo = new RandomAccessFile(archivo, "rw");
            llenarAvailList();
            //readIndexFile();
            
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
    
    public void openIndex(){
        try {
            flujoIndice = new RandomAccessFile(IndexArchivo, "rw");
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
    public void closeIndice(){
        try {
            flujoIndice.close();
        } catch (Exception e) {
        }
    }
    
    public boolean insert(Person persona) throws IOException{
        open();
        int rrn=0;
        try {
            while(true){
                if(AvailList.isEmpty()){
                    
                    flujo.seek(archivo.length());
                    flujo.writeChar(persona.getEstadoRecord());
                    flujo.writeInt(persona.getId());
                    flujo.writeUTF(persona.getName());
                    flujo.writeUTF(persona.getBirthDate());
                    flujo.writeFloat(persona.getSalary());
                    //IndexFile.add(new Indice(persona.getId(), rrn));
                    /*
                    for (Indice object : IndexFile) {
                        writeIndexFile(object);
                    }
                    */
                    rrn++;
                    close();
                    return true;
                }else{
                    int posicion = (int) AvailList.remove(0); //inserta en la primera posicion
                    flujo.seek(0);
                    AvailList.remove(0);
                    flujo.seek(sizeOfRecord*posicion);
                    flujo.writeChar(persona.getEstadoRecord());
                    flujo.writeInt(persona.getId());
                    flujo.writeUTF(persona.getName());
                    flujo.writeUTF(persona.getBirthDate());
                    flujo.writeFloat(persona.getSalary());
                    //IndexFile.add(new Indice(persona.getId(), rrn));
                    /*
                    for (Indice object : IndexFile) {
                        writeIndexFile(object);
                    }
                    */
                    rrn++;
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
                    //System.out.println(listPersonas.get(listPersonas.size()-1).toString());
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
    
    public boolean modify(Person p) throws IOException{
        open();
        boolean modifico = false;
        Person persona = p;
        System.out.println("RRNModificar: "+rrnModificar);
        try { 
            flujo.seek(0);
            flujo.seek(sizeOfRecord*(rrnModificar));
            flujo.writeChar(persona.getEstadoRecord());
            flujo.writeInt(persona.getId());
            flujo.writeUTF(persona.getName());
            flujo.writeUTF(persona.getBirthDate());
            flujo.writeFloat(persona.getSalary());
            modifico=true;
        } catch (Exception e) {
            System.out.println("Fallo 2");
        }
        
        close();
        
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
                       System.out.println("======================");
                       System.out.println("Registros en Availist");
                       for (Object object : AvailList) {
                           String x = object.toString();
                           System.out.println(x);
                       }
                       System.out.println("======================");
                    
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
    
    public Person searchModificar(String aux){ //busqueda especial para el metodo delete
        open();
        Person persona = null;
        rrnModificar=0;
        try {
            do {
                persona = new Person();
                persona.setEstadoRecord(flujo.readChar());
                persona.setId(flujo.readInt());
                persona.setName(flujo.readUTF());
                persona.setBirthDate(flujo.readUTF());
                persona.setSalary(flujo.readFloat());
                rrnModificar++;
                
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
    
    public void llenarIndexFile() throws IOException{
        open();
        Person persona;
        IndexFile = new ArrayList();
        int rrn=0;
        try {
            while(true){
                
                persona = new Person();
                persona.setEstadoRecord(flujo.readChar());
                persona.setId(flujo.readInt());
                persona.setName(flujo.readUTF());
                persona.setBirthDate(flujo.readUTF());
                persona.setSalary(flujo.readFloat());
                IndexFile.add(new Indice(persona.getId(), rrn));
                rrn++;
            }
        } catch (EOFException e) {
        }
        close();
        for (Indice object : IndexFile) {
            System.out.println(object.toString());
            writeIndexFile(object);
        }

        
        
    }
    
    public void readIndexFile() throws IOException{
        openIndex();
        Indice indice;
        try {
            while(true){
                indice = new Indice();
                indice.setId(flujo.readInt());
                indice.setKey(flujo.readInt());
                IndexFile.add(indice);
            }
        } catch (EOFException e) {
        }
        
        sortIndexArrays(IndexFile);
        System.out.println("Cargado el IndexFile");
        
        
        closeIndice();
    }
    
    
    public boolean writeIndexFile(Indice ind) throws IOException{
        openIndex();
        try {
            while(true){
            flujoIndice.seek(IndexArchivo.length());
            flujoIndice.writeInt(ind.getId());
            flujoIndice.writeInt(ind.getKey());
            return true;
            }
        } catch (EOFException e) {
        }
        closeIndice();
        return false;
      
    }//Fin de cargar archivo
    
    public ArrayList<Indice> sortIndexArrays(ArrayList temp) { //se realiza el sort del arrayList para el split
        Collections.sort(temp, new Comparator<Indice>() {
            @Override
            public int compare(Indice o1, Indice o2) {
                String id1 = o1.getId() + "";
                String id2 = o2.getId() + "";
                return id1.compareTo(id2);
            }
        });
        return temp;
    }

}
