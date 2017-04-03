package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Manager manager=Manager.getInstance();
        Manager manager1=Manager.getInstance();
        System.out.println(manager);
        User cont1 = new User("Vasile",manager);
        User cont2 = new User("Vladimir",manager);
        User cont3 = new User("Cristina",manager);
        User cont4 = new User("Tamara",manager);



    }
}
