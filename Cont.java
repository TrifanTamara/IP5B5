// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Cont.java

import java.util.Vector;

public abstract class Cont
{

    public Cont()
    {
    }

    public String getName()
    {
        return null;
    }

    public void setName()
    {
    }

    public int ID;
    public Vector myManager;
}
=======
package com.company;

import java.util.ArrayList;

/**
 * Created by Vasile Catana on 3/20/2017.

 */

public abstract class Cont {

    private int ID;
    private String name;
    private Manager manager;

    private ArrayList<Eveniment> eveniments;

    Cont(String name, Manager manager)
    {
        this.name = name;
        this.manager = manager;
    }
//    Cont(String name, Manager manager)
//    {
//        this.name = name;
//        this.manager = manager;
//    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString()
    {
        return "Nume Cont: "+ name;

    }

    public  void buyTicket(Eveniment event)
    {
        if (!manager.existEvent(event))
        {
            System.out.println("Nu exista asa eveniment");
            return ;
        }

        eveniments.add(manager.buyTicket("colinde"));
    }

    public  void buyTicket(String event)
    {
        if (!manager.existEvent(event))
        {
            System.out.println("Nu exista asa eveniment");
            return;
        }
        System.out.println(manager.existEvent(event));
        System.out.println("S a cumparat un ticket la "+event);
        if (manager.buyTicket("colinde")!=null) {
            eveniments.add(manager.buyTicket(event));
        }
    }

}