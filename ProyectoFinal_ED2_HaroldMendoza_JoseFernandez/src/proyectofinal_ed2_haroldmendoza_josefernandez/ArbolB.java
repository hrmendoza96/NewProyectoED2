/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal_ed2_haroldmendoza_josefernandez;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Harold Mendoza
 */
public class ArbolB {

    ArrayList<Node> root = new ArrayList();
    ArrayList<Object> branches = new ArrayList();
    int orden;
    int keySize; //cuantos nodos pueden haber en un slot, que es el orden -1

    public ArbolB(int orden) {
        this.orden = orden;
        this.keySize = orden - 1;
    }

    public ArbolB() {
    }

    public ArrayList<Node> getRoot() {
        return root;
    }

    public void setRoot(ArrayList<Node> root) {
        this.root = root;
    }

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }

    public int getKeySize() {
        return keySize;
    }

    public void setKeySize(int keys) {
        this.keySize = keys;
    }

    //======================================ADD NODE AL ARBOLB========================
    public boolean addNodeTree(int id, int key) {
        boolean seInserto = false;

        //======================Vericar si el root tiene hijos==================//
        Node nuevo = new Node(id, key); //creamos el nuevo nodo
        boolean NodeGoesLeftSon = false;
        boolean NodeGoesRightSon = false;
        Node hasLeftAuxNode = null;
        Node hasRightAuxNode = null;
        for (Node node : root) {
            if (node.getId() > nuevo.getId()) { //si el nuevo nodo es menor que el nodo evaluandose
                if (node.hasLeftSon) {
                    NodeGoesLeftSon = true;
                    hasLeftAuxNode = node; //guarda el valor del nodo para utilizarlo despues
                    break;
                }
            } else if (node.getId() < nuevo.getId()) { //si el nuevo nodo es mayor que el nodo evaluandose
                if (node.hasRightSon) {
                    NodeGoesRightSon = true;
                    hasRightAuxNode = node; //guarda el valor del nodo para utilizarlo despues
                    break;
                }
            }//fin else if
        }//fin for e

        //=========Verificar si insertar en el left son, right son, o hacer split=====//
        if (NodeGoesLeftSon) {
            for (Node node : root) {
                if (hasLeftAuxNode.equals(node)) {
                    ArbolB tree = new ArbolB(orden);
                    tree.setRoot(node.getLeftchildren());
                    tree.addNodeTree(nuevo.getId(), nuevo.getKey());
                    if (node.getLeftchildren().size() == 1) { //Si se ha quedado solo con un hijo, este hijo debe subir a formar parte del padre
                        for (Node temp : node.getLeftchildren().get(0).getRightchildren()) {
                            node.Leftchildren = new ArrayList();
                            node.setLeftchildren(temp);
                        }
                        InsertarAfterUnderSplit(node);

                    }
                    actualizarBranches();
                    seInserto = true;
                    break;
                }
            }
        } else if (NodeGoesRightSon) {
            for (Node node : root) {
                if (hasRightAuxNode.equals(node)) {
                    ArbolB tree = new ArbolB(orden);
                    tree.setRoot(node.getRightchildren());
                    tree.addNodeTree(nuevo.getId(), nuevo.getKey());
                    if (node.getRightchildren().size() == 1) { //Si se ha quedado solo con un hijo, este hijo debe subir a formar parte del padre
                        for (Node temp : node.getRightchildren().get(0).getLeftchildren()) {
                            node.Rightchildren = new ArrayList();
                            node.setRightchildren(temp);
                        }
                        InsertarAfterUnderSplit(node);
                    }
                    actualizarBranches();
                    seInserto = true;
                    break;
                }
            }
        } else if (root.size() == keySize) {//verifica si la root esta llena
            //System.out.println(root.size());
            nuevo = new Node(id, key); //creamos el nuevo nodo
            splitAndInsert(nuevo);
            actualizarBranches();
            seInserto = true;
        } else { //si el arrayList aun no se ha llenado
            //System.out.println("Llenando la root normal");
            root.add(new Node(id, key));
            sort();
            actualizarBranches();
            seInserto = true;
        }

        return seInserto;
    }

    public void InsertarAfterUnderSplit(Node nodo) {
        if (root.size() == keySize) {
            splitAndInsert(nodo);
            actualizarBranches();
        } else {
            root.add(nodo);
            sort();
            actualizarBranches();
        }
    }

    public void actualizarBranches() {
        branches = new ArrayList();
        for (Node node : root) {
            if (node.HasLeftSon()) {
                if (!branches.contains(node.Leftchildren)) {
                    branches.add(node.Leftchildren);
                }

            }
            if (node.HasRightSon()) {
                if (!branches.contains(node.Rightchildren)) {
                    branches.add(node.Rightchildren);
                }
            }
        }
    }

    //================================SPLIT AND INSERT=============================
    public void splitAndInsert(Node nuevo) {
        //System.out.println("va haber split");
        ArrayList<Node> temp = root;
        temp.add(nuevo);
        ArrayList<Node> temp2 = new ArrayList();
        temp2 = sortOtherArrays(temp);
        int pos = (temp2.size() / 2); //La media se obtiene de manera automatica para numeros impares al dividir entre 2. Ya que la posicion en el arraylsit es la mitad-1
        if(pos%2==0){
            pos--; //cuando es par se le resta 1 ya que en el arraylist la posicion es la mitad -1
        }
        //System.out.println("Pos="+pos);
        //System.out.println("temp2.get(pos)="+temp2.get(pos).toString());

        Node newFather = temp2.get(pos); //se establece quien sera el nuevo padre de todos
        //Se declaran los hijos del nodo padre
        //System.out.println("Temp2 size="+temp2.size());
       
        for (int i = 0; i < temp2.size(); i++) {
            if (i < pos) {//hijo menor
                //System.out.println("menor"+i);
                temp2.get(i).setFather(newFather);
                newFather.setLeftchildren(temp2.get(i));
            } else if (i > pos) {//hijo mayor
                //System.out.println("mayor"+i);
                temp2.get(i).setFather(newFather);
                newFather.setRightchildren(temp2.get(i));
            }
        }
        root = new ArrayList(); //se resetea el arraylist de root
        root.add(newFather); //se setea el neo father al root como 

    }

    //============================SORT OTHER ARRAYS========================================
    public ArrayList<Node> sortOtherArrays(ArrayList temp) { //se realiza el sort del arrayList para el split
        Collections.sort(temp, new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                String id1 = o1.getId() + "";
                String id2 = o2.getId() + "";
                return id1.compareTo(id2);
            }
        });
        return temp;
    }

    //==========================================SORT PRINCIPAL (HACE SORT SOLAMENTE AL ROOT)===============================
    public void sort() {  //ordena los nodos en el root de menor a mayor
        // Sorting
        Collections.sort(root, new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                String id1 = o1.getId() + "";
                String id2 = o2.getId() + "";
                return id1.compareTo(id2);
            }
        });
    }

    //================================DELETE A NODE DEL ARBOL B=============================
    public boolean deleteNodeTree() {
        boolean seBorro = false;

        return seBorro;

    }

    public void printArbol(ArrayList<Node> root) {
        System.out.println("Root");
        for (Node node : root) {
            System.out.println(node.toString());
        }
        System.out.println("Branches: ");
        for (Object x : branches) {  
            System.out.println(x.toString());
        }

    }

    public int searchNode(int llaveBuscar, Node nodo, int orden) {
        int s = 0;
        
        while (s < orden - 1) {
            if (llaveBuscar == nodo.getKey()/*[s]*/) {
                return nodo.getKey();
            } else if (llaveBuscar < nodo.getKey()/*[s]*/) {
                break;
            } else {
                s++;
            }//Fin del if
        }//Fin del while
        /*
        if (node.subtree[s]() != null) {
            return searchNode(llaveBuscar, node.subtree[s], orden)
        } else {
            return -1;
        }
        */
        return 0;
    }//Fin del searchNode
    
    //=========================To String=======================================
    

}//Fin de la clase
