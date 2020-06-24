package com.company;
import java.util.*;
//Psuedocode
//Import java.util.*
//Create a public static void main
//


import java.util.Arrays;

public class Class623 {
    public static void main(String[] args) {
        Random rand= new Random();
        int Size= rand.nextInt(5)+5;
        int[] num2 = new int[Size];//new array depending on previous one
        for (int i = 0; i < num2.length; i++) {
            num2[i] = rand.nextInt(95) + 5;//numbers 5-100 use the range as bound + min
        }
        int index1;
        int index2;
        do {
            index1 = rand.nextInt(Size);//the size makes sure that the number stays in range
            index2 = rand.nextInt(Size);
        }while (index1 == index2);//this makes sure that the indexes aren't equal to each other

        System.out.println(Arrays.toString(num2));
        swap(num2,index1,index2);
        System.out.println(Arrays.toString(num2));
    }
    public static int []swap(int []num2, int i, int j){
        int temp= num2[i];
        num2[i]=num2[j];
        num2[j]=temp;
        return num2;
    }

}
