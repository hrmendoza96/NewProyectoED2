/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal_ed2_haroldmendoza_josefernandez;

import java.io.Serializable;

/**
 *
 * @author Jose
 */
public class Indice implements Serializable {

    private static final long SerialVersionUID = 666L;
    private int Id;
    private int Key;

    public Indice(int Id, int Key) {
        this.Id = Id;
        this.Key = Key;
    }

    public Indice() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getKey() {
        return Key;
    }

    public void setKey(int Key) {
        this.Key = Key;
    }
    
    

    

}
