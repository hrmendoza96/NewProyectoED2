/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal_ed2_haroldmendoza_josefernandez;

import java.util.ArrayList;

/**
 *
 * @author Harold Mendoza
 */
public class Node {
    
    Node Father;
    ArrayList<Node> Leftchildren = new ArrayList();
    ArrayList<Node> Rightchildren = new ArrayList();
    boolean hasFather;
    boolean hasLeftSon;
    boolean hasRightSon;
    int key; //el rrn del archivo
    int id; //el que ingresa el usuario
    
    //El rrn lo usamos en el search y encontramos el archivo

    

    public Node() {
    }

    public Node(int id, int key) {
        this.key = key;
        this.id = id;
    }

    public Node getFather() {
        return Father;
    }

    public void setFather(Node Father) {
        hasFather=true;
        this.Father = Father;
    }

    public ArrayList<Node> getLeftchildren() {
        return Leftchildren;
    }

    public void setLeftchildren(Node Leftchildren) {
        hasLeftSon=true;
        this.Leftchildren.add(Leftchildren);
    }

    public ArrayList<Node> getRightchildren() {
        return Rightchildren;
    }

    public void setRightchildren(Node Rightchildren) {
        hasRightSon=true;
        this.Rightchildren.add(Rightchildren);
    }

    public boolean HasLeftSon() {
        return hasLeftSon;
    }

    public void setHasLeftSon(boolean hasLeftSon) {
        this.hasLeftSon = hasLeftSon;
    }

    public boolean HasRightSon() {
        return hasRightSon;
    }

    public void setHasRightSon(boolean hasRightSon) {
        this.hasRightSon = hasRightSon;
    }
    

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Node{" + "key=" + key + ", id=" + id + '}';
    }

   

  

    
    
    
    
    
    
}
