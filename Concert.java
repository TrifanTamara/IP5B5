
public class Concert extends Eveniment {
}
=======
// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Concert.java


public class Concert extends Eveniment
{

    public Concert()
    {
    }
}
=======
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
