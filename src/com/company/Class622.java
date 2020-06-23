package com.company;
import java.util.*;
public class Class622 {
    public static void main (String [] args){
        Scanner console = new Scanner(System.in);
        Random randy = new Random();
        int days;
        do{
            System.out.println("How many days");
            days = console.nextInt();
        }while(days>2 || days<=100);

        int[] temp = new int[days];
        int sum=0;
        for (int index = 0; index<temp.length; index++){
            temp[index]= randy.nextInt(85)+25;
            sum=sum+temp[index];
        }
        double average=sum/days;
        System.out.println(average);
        int counter = 0;
        for (counter = 0; counter<temp.length; counter++){
 //           if temp==
        }
    }
}
