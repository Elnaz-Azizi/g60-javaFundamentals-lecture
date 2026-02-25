package se.lexicon;

import java.util.Scanner;

public class LoopExample2 {
    public static void main(String[] args) {
        // While Loop
        /*
        while (condition) {
            // code to repeat
        }
         */

        // Checking a Person’s Age
        /*
        Ask user for their age.
        If they’re 18 or older, tell them they’re an adult and ask again.
        If they’re younger than 18, tell them they’re a child and stop the loop.
        To make this logic works we will use:
        A Scanner to read user input
        A boolean variable called it isAdult that controls whether the loop should continue or not.
        The loop will run while isAdult is true.
        Once we receive a number under 18, we will stop the loop and print a message, isAdult=false and then end the loop.


         */

        Scanner scanner = new Scanner(System.in);
       /* boolean isAdult = true;

        while (isAdult) {
            System.out.println("How old are you?");
            int age = scanner.nextInt();

            if (age >= 18) {
                System.out.println("You are an adult");
            } else {
                System.out.println("You are a child");
                isAdult = false; // Exit the loop when the condition is met
            }
        }*/

        // scanner.nextLine() → ‘Listen for a sentence.’
        // scanner.next() → ‘Listen for one word.’

        // Do-While Loop

        /*
         do {
            // code to repeat
        } while (condition);
         */

        // We want the user to enter a password.
        String password;
        String correctPassword = "ABC123";

        do {
            System.out.print("Enter password: ");
            password = scanner.nextLine();

            if (!password.equals(correctPassword)) {
                System.out.println("Incorrect password. Try again.\n");
            }
        } while (!password.equals(correctPassword));

        System.out.println("Access granted! Welcome back.");

    }
}
