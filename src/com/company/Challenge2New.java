package com.company;

public class Challenge2New {
    public static void main(String[] args) { //main method
        //Call all my functions
        line();
        top();
        bottom();
        line();
        top();
        bottom();
        top();
        line();


    }

    public static void top() {
	// write your co
        for (int line =1; line <SIZE+1; line ++){
            System.out.print("l");
            for (int spaces=1; spaces <-2*line+2*SIZE; spaces++){
                System.out.print(" ");
            }
            System.out.print("<>");
            for (int dots =1; dots<= 4*line-4; dots++){
                System.out.print(".");
            }
        }
}



}


