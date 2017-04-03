package com.company;

import java.util.ArrayList;

/**
 * Created by Vasile Catana on 3/20/2017.

 */

public abstract class Cont {

    private int ID;
    private String name;
    private Manager manager;


    Cont(String name, Manager manager)
    {
        this.name = name;
        this.manager = manager;
    }


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



}