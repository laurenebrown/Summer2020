package com.company;
import java.util.Scanner;
public class IfChallenge {

    public static void main (String [] args){

        double pounds;

        Scanner sc = new Scanner(System.in);
        System.out.println("Put in your height in inches: ");
        double h = sc.nextDouble();

        sc = new Scanner(System.in);
        System.out.println("Put in your height in inches: ");
        double w = sc.nextDouble();

 //       Scanner sc = new Scanner(System.in);
        System.out.println("Put in your height in inches: ");
        double h2 = sc.nextDouble();

        sc = new Scanner(System.in);
        System.out.println("Put in your height in inches: ");
        double w2 = sc.nextDouble();

        double BMI = w/(h*h) * 703;
        double BMI2 = w2/(h2*h2);
        double difference = BMI - BMI2;

        if (BMI >=30.0) {

            System.out.println("BMI1 OBESE");
        }

            else if (BMI < 18.5){

                System.out.println("BMI2 UNDERWEIGHT");

        }

    }

}
