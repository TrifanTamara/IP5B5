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