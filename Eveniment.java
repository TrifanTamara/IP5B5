// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Eveniment.java

import java.util.Vector;

public class Eveniment
{

    public Eveniment()
    {
    }

    public Vector myManager;
}
=======
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
