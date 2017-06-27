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
public class Indice {
    int id;
    int key;

    public Indice() {
    }

    public Indice(int id, int key) {
        this.id = id;
        this.key = key;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "Indice{" + "id=" + id + ", key=" + key + '}';
    }
    
    
    
}
