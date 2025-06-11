import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // ============================
        // OUTPUT TO CONSOLE
        // ============================
        System.out.println("I like pizza!"); // Prints with a new line
        System.out.print("It's really good\n"); // \n adds a new line manually
        System.out.print("Buy me pizza"); // Prihnts without a new line

        // ============================
        // PRIMITIVE DATA TYPES & VARIABLES
        // ============================
        int age = 30;               // Integer variable
        double price = 19.99;       // Floating-point number
        char grade = 'A';           // Character
        char currency = '$';        // Character used as symbol
        boolean isStudent = true;   // Boolean (true/false)

        // ============================
        // CONDITIONAL STATEMENT
        // ============================
        if (isStudent) {
            System.out.println("You are a student");
        } else {
            System.out.println("You are not a student");
        }

        // ============================
        // STRINGS AND CONCATENATION
        // ============================
        String name = "Gidayi";
        System.out.println(name + " is my name");

        // Displaying other variables
        System.out.println(age);
        System.out.println("I am " + age + " years old");
        System.out.println(price);
        System.out.println(grade + "" + currency); // Concatenating chars
        System.out.println(isStudent);

        // ============================
        // USER INPUT (TEXT, INTEGER, DOUBLE, BOOLEAN)
        // ============================
        Scanner scanner = new Scanner(System.in);

        // Getting string input
        System.out.println("Enter your name: ");
        name = scanner.nextLine();

        // Getting integer input
        System.out.println("Enter your age: ");
        age = scanner.nextInt();

        // Getting double input
        System.out.println("What is your GPA: ");
        double gpa = scanner.nextDouble();

        // Getting boolean input
        System.out.println("Are you a student? (true/false): ");
        isStudent = scanner.nextBoolean();

        // Conditional logic using boolean input
        if (isStudent) {
            System.out.println("You are enrolled as a student");
        } else {
            System.out.println("You are NOT enrolled");
        }

        // Display user input
        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("Your GPA is " + gpa);

        // ============================
        // MULTIPLE INPUT TYPES IN SEQUENCE (Handling Scanner.nextLine())
        // ============================
        scanner.nextLine(); // Consume newline left by nextBoolean()

        System.out.print("Enter your favorite color: ");
        String color = scanner.nextLine();

        System.out.println("You are " + age + " years old");
        System.out.println("You like the color " + color);

        // ============================
        // BASIC MATH OPERATION
        // ============================
        System.out.println("What is the width: ");
        int width = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.println("What is the length: ");
        int length = scanner.nextInt();

        int area = width * length;
        System.out.println("The area is: " + area);

        scanner.nextLine(); // consume newline

        // ============================
        // STORY GAME (MAD LIBS STYLE)
        // ============================
        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.println("Enter an adjective (description): ");
        adjective1 = scanner.nextLine();

        System.out.println("Enter a noun (animal or person): ");
        noun1 = scanner.nextLine();

        System.out.println("Enter an adjective (description): ");
        adjective2 = scanner.nextLine();

        System.out.println("Enter a verb ending with 'ing': ");
        verb1 = scanner.nextLine();

        System.out.println("Enter an adjective (description): ");
        adjective3 = scanner.nextLine();

        // Display the story
        System.out.println("Today I went to a " + adjective1 + " zoo.");
        System.out.println("In an exhibit, I saw a " + noun1 + ".");
        System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
        System.out.println("I was " + adjective3 + "!");

        // ============================
        // CLOSE THE SCANNER
        // ============================
        scanner.close();
        // Arithmetic Operations

        int x = 10;
        int y = 2;
        int z;

        z = x + y;
        z = x - y;
        z = x * y;
        z = x % y;
        z = x / y;

        System.out.println(z);

        // Augmented Assignment Operators
        int a = 10;
        int b = 3;

        a += b;
        a -= b;
        a *= b;
        a /= b;
        a %= b;
        // Increment and Decrement Operators
        a++;
        a--;


        System.out.println(a);

        // Order of Operations [P-E-M-D-A-S]

        double result = 3 + 4 * (7 - 5) / 2.0;

        System.out.println(result);

        // SHOPPING CART PROGRAM
        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.println("What item would you like to buy?: ");
        item = scanner.nextLine();

        System.out.println("What is the price for each?: ");
        price = scanner.nextDouble();

        System.out.println("How many would you like?: ");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.println("\nYou have bought " + quantity + " " + item + "/s");
        System.out.println("Your total is " + currency + total);

        scanner.close();

    }
}
