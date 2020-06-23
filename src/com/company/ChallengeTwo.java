package com.company;

public class ChallengeTwo {
    public static int size = 6;
    public static void main(String[] args){
        line();
        top();

    }
    public static void line(){
        String line = "+";
        for(int i= 0; i<1*size*2+1; i++){
            line+= "-";
        }
        line+= "+";
        System.out.println(line);
    }
    /*
    loop for the line
       print |
       loop for spaces (-1 every line, start w 4 spaces)
           print space
       loop for / (+1 every line, start w 0 /)
           print /
       print *
       loop for \ (+1 every line, start w 0 /)
           print \
       loop for spaces (-1 every line, start w 4 spaces)
           print space
       println |
     */
    public static void top(){
        for (int line = 1; line<=4; line++){
            System.out.print("|");
            for (int space=1; space<=-1*line+5; space++){
                System.out.print(" ");
            }
            for (int fslash = 1; fslash<=line-1; fslash++){
                System.out.print("/");
                }
            System.out.print("*");{
                }
                for (int bslash = 1; bslash<=-1*line+5; bslash++);
                System.out.print("\\");{
                }
                for (int space=1; space<=-1*line+5; space++){
                    System.out.print(" ");{
                    }
                    System.out.println("|");
            }


            }

        }

    }


