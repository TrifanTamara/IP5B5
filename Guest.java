// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Guest.java


public class Guest extends Cont
{

    public Guest()
    {
    }

    public String name;
}
=======
package com.company;

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
