package com.company;
import java.util.Scanner;
public class PeterNew {
    public static Scanner Computer = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Say Something!");
        String phrase = sc.nextLine();
        int indexOf = phrase.indexOf(" ");
        String firstWord = phrase.substring(0, indexOf);
        char letter = ' ';
        int count = 0;
        for (int all = 0; all < firstWord.length(); all++){
            letter = firstWord.charAt(all);
            System.out.println(letter + " " + count);
            count++;
        }
            }
        }
