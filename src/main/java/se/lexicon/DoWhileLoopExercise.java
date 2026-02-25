package se.lexicon;

import java.util.Scanner;

/**
 * Exercise: Do-While Loop
 * <p>
 * Objective: Create a simple menu-driven program that asks the user to choose an option.
 * The program should continue running until the user chooses to 'Exit'.
 * <p>
 * Explanation:
 * A 'do-while' loop is used when you want the code block to execute AT LEAST once.
 * The condition is checked AFTER the code inside the 'do' block has run.
 * <p>
 * Structure:
 * do {
 * // Code to execute
 * } while (condition);
 */
public class DoWhileLoopExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        // The 'do-while' loop is perfect for menus because we want to show the menu 
        // at least once before checking if the user wants to quit.
        do {
            System.out.println("--- Simple Menu ---");
            System.out.println("1. Say Hello");
            System.out.println("2. Show current time (simulated)");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");

            // Read user input
            choice = scanner.nextInt();

            // Handle the user's choice
            switch (choice) {
                case 1:
                    System.out.println("Hello there! Hope you are having a great day.\n");
                    break;
                case 2:
                    System.out.println("The current time is... logic not implemented, but you chose option 2!\n");
                    break;
                case 3:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.\n");
            }

        } while (choice != 3); // The loop continues as long as the choice is NOT 3 (Exit)

        scanner.close();
    }
}
