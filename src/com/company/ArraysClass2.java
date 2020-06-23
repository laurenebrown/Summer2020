package com.company;
import java.util.*;

public class ArraysClass2 {
    public static void main(String[] args){
        Random rand=new Random();
        int [] numbers={2,5,8,34,14,79,32};//array defined by user
        int [] num2= new int[numbers.length];//new array depending on previous one
        for(int i=0; i<numbers.length; i++){
            num2[i]= rand.nextInt(95)+5;//numbers 5-100 use the range as bound + min
        }
        System.out.println(Arrays.toString(numbers));
        numbers= reverse(numbers);
        System.out.println(Arrays.toString(numbers));
        num2=reverse(num2);
        System.out.println(Arrays.toString(num2));
    }
public static int[] reverse(int []rev){
        for (int i=0; i< rev.length/2; i++){
            int temp= rev[i];
            rev[i] = rev[rev.length-1-1];
            rev[rev.length-1-i]=temp;
        }

        return rev;
    }
}
