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
    private int rrn;

    public int getRrn() {
        return rrn;
    }

    public void setRrn(int rrn) {
        this.rrn = rrn;
    }

    public Indice(int Id, int rrn) {
        this.Id = Id;
        this.rrn = rrn;
    }

    public Indice() {

    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

}
