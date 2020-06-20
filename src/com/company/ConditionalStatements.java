package com.company;
import java.util.*;

public class ConditionalStatements {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        Random ran = new Random();
        String answer = " ";
        do {
            int n = ran.nextInt(137) + 1;
            System.out.println(n);
            solve(n);
            System.out.println("Do you wish to continue?");
            answer = input.nextLine();
        } while (answer.contains("y"));
    }
        public static void solve (int n){


            if (n % 2 != 0) {
                System.out.println("Weird");
            } else if (n % 2 == 0 && n >= 2 && n <= 5) {
                System.out.println("Not Weird");
            } else if (n % 2 == 0 && n >= 6 && n <= 20) {
                System.out.println("Weird");
            } else if (n % 2 == 0 && n >= 20) {
                System.out.println("Not Weird");
            }
    }
}
