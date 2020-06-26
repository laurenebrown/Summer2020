package com.company;
import java.util.*;
import java.io.*; //for file
public class FinalProject {
    public static int times = 0;
    public static int wins = 0;

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = input.next();
        String message = returning(name);
        System.out.println(message);
        int n;
        String words;
        String answer = " ";
        do {
            System.out.println("Type start to begin");
            answer = input.next();
        } while (!answer.contains("start"));

        do {
            File file = new File("/Users/lauren2/IdeaProjects/Summer2020/src/com/company/FinalProject.java");
            Scanner fileinput = new Scanner(file);
            System.out.println("Would you like to play the WORD, INTEGER or DOUBLE game or QUIT to stop?");
            answer = input.next();
            answer = answer.toUpperCase();
            // } while (!answer.contains("QUI"));

            if (answer.contains("DOU")) {
                doublem(input, fileinput);
                //add to the number of games
            }
            if (answer.contains("INT")) {
                integers(input, fileinput);
            }
            if (answer.contains("WOR")) {
                words(input, fileinput);
                //add to number of games
            }

        } while (answer.contains("DOU") || answer.contains("INT") || answer.contains("WOR"));
        System.out.println("Thanks for playing! Your total number of games played was " + times + ". Your final score was " + wins);
    }

    public static void words(Scanner input, Scanner fileinput) {
        times++;
        System.out.println("Guess what Disney Princess I'm thinking of!");
        String solution = input.next();
        String other = " ";
        while (fileinput.hasNextLine()) {
            other = fileinput.next();
            if (other.equals(solution)) {
                wins++;
                System.out.println("Congrats! That was the correct answer!!");
                break;

            }
        }

    }

    public static void integers(Scanner input, Scanner fileinput) { //method for the integers game
        times++; //add to number of tries each time played
        System.out.println("Guess what whole numbers I'm thinking of between 1 and 100!");
        int answer = input.nextInt(); //defines int variable
        String problem = " "; //defines new string variable
        while (fileinput.hasNextLine()) { //brings in values and answers from file
            if (fileinput.hasNextInt()) {
                if (fileinput.nextInt() == answer) {
                }//only does the following if answer is correct
                wins++; //if this is true, add to wins
                System.out.println("Congrats! That was the correct answer!!");
                break;//resumes at the next statement following the loop
            } else {
                problem = fileinput.next(); //brings in file scanner
                System.out.println(problem); //prints file scanner
            }
        }
    }

        public static void doublem (Scanner input, Scanner fileinput){
            times++;
            System.out.println("Guess what decimals I'm thinking of between 0.0 and 3.0!");
            double working = input.nextDouble();
            String outcome = " ";
            while (fileinput.hasNextDouble()) {
                if (fileinput.hasNextDouble()) {

                    if (fileinput.nextDouble() == working) {
                        wins++;
                        System.out.println("Congrats! That was the correct answer!!");
                        break;
                    }
                }else {
                   outcome= fileinput.next();

                    }
                }
            }

        public static String returning (String name){
            String message = ("Hello " + name);
            return message;
        }
    }

