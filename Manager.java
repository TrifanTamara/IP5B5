package com.company;

/**
 * Created by Vasile Catana on 3/20/2017.
 */
public class Manager {

    private Manager(){};


    private static Manager manager=null;

    public Cont[] conturi;

    public Eveniment[]  myEveniment;

    static public int k =0;

    static public Manager getInstance() {

        if(manager==null)
        {
            manager = new Manager();
            ++k;
            System.out.println(k+"dovada ca am instantiat din nou");
        }
        return manager;
    }

    public boolean getTicket(Eveniment e) {
        if (e.getAvailable() > 0) {
            e.setAvailable(e.getAvailable() - 1);
            return true;
        } else {
            return false;
        }


    }
    public String toString()
    {
        return "Eu sint mamanger";
    }

        }