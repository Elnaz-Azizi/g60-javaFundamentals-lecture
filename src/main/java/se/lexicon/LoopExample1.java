package se.lexicon;

public class LoopExample1 {
    public static void main(String[] args) {

        System.out.println("Hello");
        System.out.println("Welcome");
        System.out.println("Goodbye");

        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");

        // Loops
        // for loop

       /* for (initialization; condition; increment) {
            // code to repeat
        }*/

        System.out.println("Basic Iteration:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration " + i);
        }

        // print all even numbers between 1 and 10.
        System.out.println("Even Numbers:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("Number: " + i);
            }
        }

        // The continue Statement — Skipping a Turn
        System.out.println("Using continue to Skip an Iteration");
        for (int i = 1; i <= 10; i++) {
            if (i == 8) {
                System.out.println("Skipping 8...");
                continue;
            }
            System.out.println("Number: " + i);
        }

        // The break Statement — Stopping Completely
        System.out.println("Using break to Stop the Loop");
        for (int i = 1; i <= 10; i++) {
            if (i == 8) {
                System.out.println("Stopping at number 8...");
                break;
            }
            System.out.println("Number: " + i);
        }

    }
}
