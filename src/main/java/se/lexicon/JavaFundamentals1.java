package se.lexicon;

public class JavaFundamentals1 {
    public static void main(String[] args) {

        //Variable Declaration
        //Syntax: [Data Type][Variable Name] = [Value];
        int speed;
        speed = 100;
        System.out.println("Speed: " + speed + " km/h");

        double salary = 5000.75;

        char grade = 'A'; // unicode '\u0041'
        char specialChar = '\u2764'; // '❤'

        boolean isAdult = true;
        boolean isStudent = false; // defualt value for boolean is false.

        long balance = 5000000000000000000L;

        byte temperature = 27;

        int width, height;

        //Naming conventions
       // int SeatNumber; //Incorrect (Avoid starting with capital letter)
        int seatNumber; //Correct
       // int 1var = 10; //Incorrect
       // int &var = 10; //Incorrect

        int _temp= 5;// Allowed, but not recommended

        //int class= 5; // incorrect
        int studentClass;

        //Assignment operators

        int number1 = 10;
        int number2 = 20;
        number1 = number2; // not mathematical equality

        System.out.println(number1);
        System.out.println(number2);

        // compound assignment operators

        int n = 10;
        n += 5;  // n = n + 5 → 15
        n -= 3;  // n = n - 3 → 12
        n *= 2;  // n = n * 2 → 24
        n /= 4;  // n = n / 4 → 6
        n %= 3;  // n = n % 3 → 0

        // Arithmetic Operators(+  -  * /) is a regular math
        int numberOne = 10;
        int numberTwo = 5;

        //Increment (++) and Decrement (--) operators

        int number = 0;
        int counter = 0;

        // Post-Increment/Post-Decrement:
        System.out.println(counter++);


        //Pre-Increment/Decrement:
        System.out.println(++number);

        // Comparison Operators: (==, !=, <, >, <=, >=)

        int a = 10, b = 20;
        // Equal to
        System.out.println("a == b: " + (a == b));
        // Not equal to
        System.out.println("a != b: " + (a != b));
        // Greater than
        System.out.println("a > b: " + (a > b));
        // Less than
        System.out.println("a < b: " + (a < b));
        // Greater than or equal to
        System.out.println("a >= b: " + (a >= b));
        // Less than or equal to
        System.out.println("a <= b: " + (a <= b));


        // Selections or control flow statements
        // Types of Selection Statements in Java:

        // if Statement

        /* int age = 18;
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        }*/


        // if-else Statement
        int age = 16;
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        // if-else-if Ladder
        int marks = 85;
        if (marks >= 90) {
            System.out.println("Grade: A");// if this condition meets, perform A
        } else if (marks >= 80) {
            System.out.println("Grade: B");// if this condition meets, perform B
        } else if (marks >= 70) {
            System.out.println("Grade: C"); // if this condition meets, perform C
        } else if (marks >= 55 && marks <= 60) {
            System.out.println("Grade: FX"); // if this condition meets, perform FX
        } else {
            System.out.println("Grade: F"); // if all the conditions fail, perform F
        }
        // switch Statement

        int day = 3;
        switch (day) {

            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3: // If a match is found, the code block under the matching case is executed.
                System.out.println("Wednesday");
                break; // The break statement is used to exit the switch block after a matching case has been executed.
            // Without break, execution will continue to the subsequent cases (known as "fall-through").
            default:
                System.out.println("Invalid day");
        }

        //String

        String firstName = "Mehrdad";
        String lastName = "Javan";
        String fullName = firstName.concat(" ") + lastName;
        System.out.println("Full name: " + fullName);

        String greeting = "Hello";
        greeting.concat(" World!");
        System.out.println(greeting);

        greeting= greeting.concat("World");
        System.out.println(greeting);

      /* String firstName = "Erik";
        String lastName = "Svensson";
        int age = 42;
        String hobby = "Programming";*/

        Person erik = new Person();
        erik.firstName = "Erik";
        erik.lastName = "Svensson";
        erik.age = 42;
        erik.hobby = "Programming";
        System.out.println(erik.getInformation());

        // Creating the second object
        Person anna = new Person();
        anna.firstName = "Anna";
        anna.lastName = "Andersson";
        anna.age = 54;
        anna.hobby = "Sports Cars";

        // Creating the third object
        Person nils = new Person();
        nils.firstName = "Nils";
        nils.lastName = "Björk";
        nils.age = 27;
        nils.hobby = "Gaming";

        System.out.println(erik.getInformation());
        System.out.println(anna.getInformation());
        System.out.println(nils.getInformation());

    // Methods
        System.out.println("1. Addition");
        System.out.println("2.Multiplication");


    displayMenu();


        int sum = addition(10, 20);
        System.out.println("Result= " + sum);

        double result = celsiusToFahrenheit(25);
        System.out.println("Result= " + result);





    }
    // There are different types of methods we use:
    // Method without parameters and return type

    public static void displayMenu(){
        System.out.println("1. Addition");
        System.out.println("2.Multiplication");
    }

    // Methods with parameters and return type
    public static int addition(int num1, int num2) {
        return num1 + num2;
    }

    // Methods That Perform a Specific Task
    public static double celsiusToFahrenheit(double celsius) {
        // Formula(Business logic): (C × 9/5) + 32
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        // Formula: (F - 32) × 5/9
        return (fahrenheit - 32) * 5 / 9;
    }

}
