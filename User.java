public class User extends Cont {

  public String name;

  public String Adresa;

  public int cont;

  public boolean requireTicket() {
  return false;
  }

}
=======
// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   User.java


public class User extends Cont
{

    public User()
    {
    }

    public boolean requireTicket()
    {
        return false;
    }

    public String name;
    public String Adresa;
    public int cont;
}
=======
package com.company;

/**
 * Created by Vasile Catana on 3/20/2017.
 */
public class User extends Cont {

    private String name;
    private String address;
    private int    accountNumber;

    private String mailAddress;



    User(String name, Manager manager)
    {
        super(name, manager);
    }

    public String getAdresa() {
        return address;
    }

    public void setAdresa(String adresa) {
        this.address = adresa;
    }

    private int cont;

    public boolean requireTicket(String concert) {
        return false;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    public String getMailAddress() {
        return mailAddress;
    }
}
