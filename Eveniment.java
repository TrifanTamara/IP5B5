package com.company;

/**
 * Created by Vasile Catana on 3/20/2017.
 */
public class Eveniment {

    private int nrTickets;

    Eveniment(int nr){
        nrTickets=nr;
    }
    public int getAvailable()
    {
        return nrTickets;
    }

    public void setAvailable(int n){
        nrTickets=n;
    }
}