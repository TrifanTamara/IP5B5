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
        System.out.println(this.name+" a cumparat un bilet la "+event);
        if (manager.buyTicket(event)!=null ) {
            eveniments.add(manager.buyTicket(event));
        }
    }

}
