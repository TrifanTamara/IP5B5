/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipb5;

/**
 *
 * @author Tamara
 */
public class Concert extends Eveniment{
    private String nume;
    private int nrLocuri;

    public Concert(int nr) {
        super(nr);
    }

    public void setNrLocuri(int nrLocuri) {
        this.nrLocuri = nrLocuri;
    }

    public int getNrLocuri() {
        return nrLocuri;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }
    
    
}
