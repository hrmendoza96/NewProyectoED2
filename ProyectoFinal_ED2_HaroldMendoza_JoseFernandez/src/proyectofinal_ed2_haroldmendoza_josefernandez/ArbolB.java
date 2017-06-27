/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal_ed2_haroldmendoza_josefernandez;

/**
 *
 * Codigo en el que nos basamos para hacer el arbol http://www.geeksforgeeks.org/b-tree-set-1-insert-2/
 */
public class ArbolB {
    Node root;
    int MinGrado;

    public ArbolB(int t) {
        root = null;
        this.MinGrado = t;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public int getMinGrado() {
        return MinGrado;
    }

    public void setMinGrado(int t) {
        this.MinGrado = t;
    }
    
    public void insert(Indice key){ //Key is RRN
        if(root==null){ //si el arbol esta vacio
            root = new Node(MinGrado,true);
            root.keys[0] = key;
            root.NumKeys = 1; //Solo hay una key en el root
        }else{ //si el arbol no esta vacio
            if(root.NumKeys == 2*MinGrado-1){ //si el arbol esta lleno
                Node nodo = new Node(MinGrado, false);
                nodo.children[0] = root;
                nodo.splitChild(0, root);
                
                
                
                int cont =0;
                if(nodo.keys[0].getId() < key.getId()){
                    cont++;
                }
                nodo.children[cont].insertarVacio(key);
                
                root = nodo;
            }else{ //la raiz no esta llena
                root.insertarVacio(key);
            }
        }
    }
    
    
    
    public void searchSubTrees(){ //Buscar sub arboles dentro del arbol actual
        if(root!=null){
            root.SearchSubNodes();//Buscae nodos internos
        }
    }
    
    public Node search(Indice key){
        if(root==null){
            return null;
        }else{
            return root.search(key);
        }
    }
    
    public void printTree(Node root){
        System.out.println("============");
        for (int i = 0; i < root.getNumKeys(); i++) {
            System.out.println(root.keys[i].toString());
            System.out.println("Hijos:");
            for (int j = 0; j < root.children.length; j++) {
                printTree(root.children[i]);
            }
        }
    }


}
    

