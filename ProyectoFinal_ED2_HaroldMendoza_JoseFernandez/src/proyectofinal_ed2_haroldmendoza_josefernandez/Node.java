/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal_ed2_haroldmendoza_josefernandez;

/**
 *
 * @author Harold Mendoza
 */
public class Node {
    public Indice keys[];
    public Node children[];
    int MinGradoNodo;
    int NumKeys; //actual numero de llaves
    public boolean isLeaf;

    public Node() {
    }

    public Node(int t, boolean isLeaf) {
        this.MinGradoNodo = t;
        this.isLeaf = isLeaf;
        keys = new Indice[2*t-1];//Numero maximo de llaves
        children = new Node [2*t];//numero maximo de hijos
        NumKeys=0;
    }

    public int getMinGradoNodo() {
        return MinGradoNodo;
    }

    public int getNumKeys() {
        return NumKeys;
    }

    public void setMinGradoNodo(int t) {
        this.MinGradoNodo = t;
    }

    public void setNumKeys(int n) {
        this.NumKeys = n;
    }

    public void setIsLeaf(boolean isLeaf) {
        this.isLeaf = isLeaf;
    }
    
    public boolean isIsLeaf() {
        return isLeaf;
    }
    
    
    
    
    public Node search(Indice key){
         
        int cont = 0;
        while(cont<NumKeys && key.getId()> keys[cont].getId()){//encontrar llave mayor o igual a k
            cont++;
        }
        if(keys[cont].getId()==key.getId()){ //si encuentra que la key es igual a k, entonces este es el nodo
            return this;
        }
        
        if(isLeaf==true){ //retorna nada si no lo encuentra y este es una leaf
            return null;
        }
        //continua buscando el hijo
        return children[cont].search(key);
    }
    
    public void splitChild(int i, Node nodo){
        Node NewNodo = new Node(nodo.getMinGradoNodo(), nodo.isIsLeaf());
        NewNodo.setNumKeys(MinGradoNodo-1);
        
        for (int j = 0; j < (MinGradoNodo-1); j++) {
            NewNodo.children[j] = nodo.children[j+MinGradoNodo];
        }
        
        if(nodo.isIsLeaf()==false){
            for (int j = 0; j < MinGradoNodo; j++) {
                NewNodo.children[j] = nodo.children[j+MinGradoNodo];
            }
        }
            
        nodo.setNumKeys(MinGradoNodo-1);
        for (int j = NumKeys; j >= i+1; j--) {
            children[j+1]=children[j];
        }

        children[i+1]=NewNodo;
        
        for (int j = (NumKeys-1); j >= i; j--) {
            keys[j+1]=keys[j];
        }
        
        keys[i]= nodo.keys[MinGradoNodo-1];
        
        NumKeys++;
        
        
    }
    
    public void insertarVacio(Indice key){
        int i = NumKeys-1;
        if(isLeaf==true){
            while(i>= 0 && keys[i].getId()>key.getId()){
                keys[i+1] = keys[i];
                i--;
            }//fin while
            
            keys[i+1] = key;
            NumKeys = NumKeys+1;
            
        }else{
            while(i>=0 && keys[i].getId()> key.getId()){ //Busca el child
                i--;
                if(children[i+1].NumKeys == 2*MinGradoNodo-1){ //verifica si esta lleno
                    splitChild(i+1, children[i+1]);//Al estar lleno entonces se hace split
                    
                    if(keys[i+1].getId()<key.getId()){
                        i++;
                    }
                    
                }
                children[i+1].insertarVacio(key); 
            }
        }
    }
    
    public void SearchSubNodes(){
        int i;
        for (i = 0; i < NumKeys; i++) {
            if(isLeaf==false){
                children[i].SearchSubNodes();
                System.out.println(" "+keys[i]);
            }//fin if
        }//fin for
        if(isLeaf==false){
            children[i].SearchSubNodes();
        }
    }//fin searchSubNodes
    
    
    
   
    
    
    
    
}
