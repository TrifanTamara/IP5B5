package com.company;

/**
 * Created by Vasile Catana on 3/20/2017.
 */
public class Eveniment {

    private int nrTickets;
    private String name;

    Eveniment(int nr){
        nrTickets=nr;
    }
    Eveniment(int nr, String name){
        nrTickets=nr;
        this.name = name;
    }
    public boolean getAvailable()
    {
        return nrTickets>0;
    }

    public void setAvailable(int n){
        nrTickets=n;
    }
    public  String getName()
    {
        return  this.name;
    }

    public int getNrTickets()
    {
        return  nrTickets;
    }
}
