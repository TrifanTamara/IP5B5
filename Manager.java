package com.company;

import java.util.ArrayList;

/**
 * Created by Vasile Catana on 3/20/2017.
 */
public class Manager {

    private Manager(){};


    private static Manager manager=null;

    public Cont[] conturi;

    static public ArrayList<Eveniment>  evenimentDisp;

    static public int k =0;

    static public Manager getInstance() {
        evenimentDisp = new ArrayList<Eveniment>(10);
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
}
