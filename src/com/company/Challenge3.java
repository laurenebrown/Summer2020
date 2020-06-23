package com.company;

public class Challenge3 {

    public static void main(String[] args) {
        double num1 = 9.7;
        int numb2 = 5;
        double total;
        int total2;
        //       total = numb1 + num2;
        //       System.out.println(total);
        //       total2 = (int)num1 + num2;  //typecasted num1 from double to int
        //       System.out.println(total2);
        char letter = 65;
        for (int i = 5; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (letter + j) + " ");


            }

        }
        for (int i = -1; i <= 26; i++) {
            for (int j = 25; i <= j; j--) {
                System.out.print((char) (letter + j) + " ");

            }
            System.out.println();

        }
    }
}














