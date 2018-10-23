package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner kbInput = new Scanner(System.in);
        String names[] = {"Santo", "Daisey", "Ashley", "Joycelyn", "Mellissa", "Lashunda", "Olive", "Hedwig", "Bethann", "Glenna", "Perry", "Augustina", "Sharri", "Britany", "Clemente", "Collette", "Starla", "Scotty", "Vicky", "Vernice", "Portia", "Logan", "Drew", "Elliott", "Eve", "Eloise", "Neomi", "Rosalyn", "Shenita", "Kenyetta", "Shona", "Chase", "Sean", "Vannesa", "Marc", "Alec", "Jule", "Malena", "Khalilah", "Shawnda", "Madelene", "Rosie", "Lena", "Del", "Neil", "Hai", "Sheila", "Elisabeth", "Loyce", "Jude"};
        int m = 0;
        int n;
        int o;
        int min = 0;
        int max = names.length - 1;
        String choice;
        String which;

        System.out.println("Mentally pick one of these fifty names, and I will try to guess who you picked.\nType anything to continue.");
        String wait = kbInput.nextLine();

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i - 0]);
        }
        Arrays.sort(names);

        System.out.println("If you have your name, type anything to continue.");
        wait = kbInput.nextLine();

        while (m == 0) {
            System.out.println("Is your name " + names[((max - min) / 2) + min] + "? (y/n)");
            n = 0;
            o = 0;

            while (n == 0) {
                choice = kbInput.nextLine();
                if (choice.equals("y")) {
                    System.out.println("I win! Good game!");
                    m = 1;
                    n = 1;
                } else if (choice.equals("n")) {
                    System.out.println("Is it the first letter of the name closer to the letter 'A' or 'Z' compared to " + names[((max - min) / 2) + min] +"?");

                    while (o == 0) {
                        which = kbInput.nextLine().toUpperCase();
                        if (which.equals("A")) {
                            System.out.println("Okay!");
                            max = ((max - min) / 2) + min;
                            o = 1;
                        } else if (which.equals("Z")) {
                            System.out.println("Okay!");
                            min = ((max - min) / 2) + min;
                            o = 1;
                        } else {
                            System.out.println("That was not an 'A' or 'Z'. Type 'A' or 'Z' to proceed.");
                            o = 0;
                        }
                    }

                    m = 0;
                    n = 1;
                } else {
                    System.out.println("That was not a 'y' or 'n'. Type 'y' or 'n' to proceed.");
                    m = 0;
                    n = 0;
                }
            }
        }
    }
}
