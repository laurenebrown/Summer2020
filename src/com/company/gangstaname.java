package com.company;
import java.util.*;

public class gangstaname {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Please enter your full name");
        String player = sc.nextLine();
        int indexOf= player.indexOf(" ");
        String firstName = player.substring(0,indexOf);
        String lastName = player.substring(indexOf+1);
        lastName= lastName.toUpperCase();
        char l= firstName.charAt(0);

        System.out.println(l + ". Diddy " + lastName +" " + firstName+ "-izzle");
    }
}

