// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Manager.java

import java.util.Vector;

public class Manager
{

    public Manager()
    {
    }

    public Manager getInstance()
    {
        return null;
    }

    public boolean getTicket()
    {
        return false;
    }

    public Manager manager;
    public Eveniment evenimente;
    public Cont conturi;
    public Vector myEveniment;
}
=======
package com.company;

import java.util.ArrayList;

/**
 * Created by Vasile Catana on 3/20/2017.
 */
public class Manager {

    private Manager(){};


    private static Manager manager=null;

    private static  ArrayList<Cont> conts;

    static public ArrayList<Eveniment>  evenimentDisp;

    static public int k =0;

    static public Manager getInstance() {
        evenimentDisp = new ArrayList<Eveniment>(100);
        conts = new ArrayList<Cont>(100);
       // for (int i=0; i<10; ++i) evenimentDisp.add(
        if(manager==null)
        {
            manager = new Manager();
            ++k;
            System.out.println(k+"dovada ca am instantiat din nou");
        }
        return manager;
    }

    public boolean getTicket(Eveniment e) {
        if (e.getNrTickets()>0) {
            e.setAvailable(e.getNrTickets() - 1);
            return true;
        } else {
            return false;
        }


    }




    public String toString()
    {
        return "Eu sint mamanger";
    }

    public Eveniment buyTicket(String nameEvent) {
        for (int i=0; i<evenimentDisp.size(); ++i)
        {
            if (evenimentDisp.get(i).getAvailable()) {
                return evenimentDisp.get(i);
            }
        }
        return  null;
    }


    public boolean existEvent(Eveniment event) {
        for (int i=0; i<evenimentDisp.size(); ++i)
        {
            if (evenimentDisp.get(i).getName() == event.getName()) {
                return true;
            }
        }
        return  false;
    }

    public boolean existEvent(String event) {
        for (int i=0; i<evenimentDisp.size(); ++i)
        {
            if (evenimentDisp.get(i).getName() == event) {
                return true;
            }
        }
        return  false;
    }

    public void addEvent(Eveniment eveniment)
    {
        for (int i=0; i<evenimentDisp.size(); ++i)
        {
            if (evenimentDisp.get(i).getName()==eveniment.getName())
            {
                return;
            }
        }
        evenimentDisp.add(eveniment);
    }

    public void addUser(Cont user)
    {
        if (user.equals("")) return ;
        for (int i=0; i<conts.size(); ++i)
        {
            if (conts.get(i).getName().equals(user.getName()))
            {
                return;
            }
        }
        conts.add(user);
    }
