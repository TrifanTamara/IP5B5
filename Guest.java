package com.company;

/**
 * Created by Vasile Catana on 3/20/2017.
 */


/**
 * Created by Vasile Catana on 3/20/2017.
 */
public class Guest extends Cont {

    public String name;

    Manager manager;

    Guest(String name, Manager manager)
    {
        super(name,manager);
    }

    public boolean requireTicket() {
        return false;
    }


}