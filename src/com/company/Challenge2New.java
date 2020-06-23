package com.company;

public class Challenge2New {
    public static int Size = 8;
    public static void main(String[] args) { //main method
       line();
        Top();
        bottom();
        line();
        Top();
        bottom();
        Top();
        line();
    }
    public static void line(){
        System.out.print("+");
        for (int i=0; i<Size*2+1; i++){
            System.out.print("-");
        }
        System.out.println("+");
    }
        public static void Top() {
            for (int line = 1; line < Size; line++) {
                System.out.print("|");
                for (int spaces = 1; spaces < -1 * line + Size + 2; spaces++) {
                    System.out.print(" ");
                }
                for (int dots = 1; dots <= 1 * line - 1; dots++) {
                    System.out.print("/");
                }
                System.out.print("*");
                for (int dots = 1; dots <= 1 * line - 1; dots++) {
                    System.out.print("\\");
                }
                for (int spaces = 1; spaces < -1 * line + Size + 2; spaces++) {
                    System.out.print(" ");
                }
                System.out.println("|");


            }
        }
            public static void bottom(){


                for (int line = 1; line <Size; line++){
                    System.out.print("|");
                    for (int spaces = 1; spaces <=1 *line; spaces++){
                        System.out.print(" ");
                    }
                    for (int dots = 1; dots <=-1 *line +Size; dots++){
                        System.out.print("\\");
                    }
                    System.out.print("*");
                    for (int dots = 1; dots <=-1 *line +Size; dots++){
                        System.out.print("/");
                    }
                    for (int spaces = 1; spaces <=1 *line ; spaces++){
                        System.out.print(" ");
                    }
                    System.out.println("|");



                }
    }
}



