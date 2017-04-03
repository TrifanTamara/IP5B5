package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Manager manager=Manager.getInstance();
        Manager manager1=Manager.getInstance();
        System.out.println(manager);
        User user1 = new User("Vasile",manager);
        User user2 = new User("Vladimir",manager);
        User user3 = new User("Cristina",manager);
        User user4 = new User("Tamara",manager);

        //Cont cont1 = new Cont("Vasile",manager);
        //Cont cont2 = new Cont("Vladimir",manager);
        //Cont cont3 = new Cont("Cristina",manager);
        //Cont cont3 = new Cont("Tamara",manager);
        //
        Guest guest1 = new Guest("Vasile",manager);
        Guest guest2 = new Guest("Vladimir",manager);
        Guest guest3 = new Guest("Cristina",manager);
        Guest guest = new Guest("Tamara",manager);



        manager.addEvent(new Eveniment(4,"Untold"));
        manager.addEvent(new Eveniment(3,"Festivalul Codarii"));
        manager.addEvent(new Eveniment(400,"Ziua Iasilui"));

        manager.addUser(guest1);
        manager.addUser(guest2);
        manager.addUser(guest3);
        manager.addUser(user2);
        manager.addUser(user1);
        manager.addUser(user3);
        try {
            guest.buyTicket("Untold");
        }
        catch (NullPointerException e) {
            System.out.println("");
        }


    }
}
