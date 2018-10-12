import java.util.Scanner;

public class Main {

  private static boolean str1;

  @SuppressWarnings("null")
  public static void main(String[] args) {
    // TODO Auto-generated method stub

    // I'm Joseph Cisar and welcome to my integration project! This project is a
    // combination of my programming exercises and code demonstrated in module resources.
    // The main set-up is a main menu. By entering the number of your choice, the option will
    // appear.
    // Use ctrl + shift + f to auto-format
    System.out.println("Welome to my Integration Project!");
    int x = 4;
    int y = 4;
    int weeks = x + y;
    System.out.println(
        "This project will show you " + weeks + " weeks of what Java I have learned so far.");
    System.out.println(
        "In the box below, select any of the following to learn or to use a program made with Java.");
    // List of Data Types:
    // Integer (int) is used for whole numbers and will return a whole number during division.
    // Double (double) is used for decimal values and will return a decimal in division.
    // Boolean The boolean data type has only two possible values: true and false.
    // Use this data type for simple flags that track true/false conditions.
    // String (str) represents character strings. Strings are constant and cannot be changed after
    // being created.

    System.out.println("-------------------------------------------------");
    System.out.println("| 1. Basic Calculator                           |");
    System.out.println("| 2. Use relational and conditional operators   |");
    System.out.println("| 3. Increment and decrement operators          |");
    System.out.println("| 4. compareTo() && equalTo() strings           |"); // && is a logical
                                                                             // operation for "and"
    System.out.println("|                                               |");
    System.out.println("|                                               |");
    System.out.println("|                                               |");
    System.out.println("|                                               |");
    System.out.println("-------------------------------------------------");

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter choice here: ");
    int mainMenuChoice = sc.nextInt();

    while (mainMenuChoice > 0) {

      if (mainMenuChoice == 1) {

        System.out
            .println("Enter a number in the box below to chose what arthimic operation you want.");
        System.out.println("----------------------");
        System.out.println("| 1. Addition        |");
        System.out.println("| 2. Subtraction     |");
        System.out.println("| 3. Multiplication  |");
        System.out.println("| 4. Division        |");
        System.out.println("| 5. Module          |");
        System.out.println("----------------------");

        int num = sc.nextInt();

        if (num == 1) {

          // Operator Precedence:
          // In Java, operator precedence is when two operators share an operand the operator with
          // the higher precedence goes first
          // For example, multiplication and division have a higher precedence than addition and
          // subtraction -- another example is PEMDAS
          // Precedence rules can be overridden by parentheses and arrays
          System.out.println("Enter two decimal numbers to find the sum.");
          System.out.println("Number 1: ");
          double input1 = sc.nextDouble();
          System.out.println("Number 2: ");
          double input2 = sc.nextDouble();
          System.out.println(input1 + input2);
        } else if (num == 2) {
          System.out.println("Enter two decimal numbers to find the difference.");
          System.out.println("Number 1: ");
          double input1 = sc.nextDouble();
          System.out.println("Number 2: ");
          double input2 = sc.nextDouble();
          System.out.println(input1 - input2);
        } else if (num == 3) {
          System.out.println("Enter two decimal numbers to find the product.");
          System.out.println("Number 1: ");
          double input1 = sc.nextDouble();
          System.out.println("Number 2: ");
          double input2 = sc.nextDouble();
          System.out.println(input1 * input2);
        } else if (num == 4) {
          System.out.println("Enter two decimal numbers to find the quotient.");
          System.out.println("Number 1: ");
          double input1 = sc.nextDouble();
          System.out.println("Number 2: ");
          double input2 = sc.nextDouble();
          System.out.println(input1 / input2);
        } else if (num == 5) {
          System.out.println("Enter two decimal numbers to find the difference.");
          System.out.println("Number 1: ");
          double input1 = sc.nextDouble();
          System.out.println("Number 2: ");
          double input2 = sc.nextDouble();
          System.out.println(input1 % input2);
        } else {
          System.out.println("Incorrect input. Please try again.");
        }
      }

      if (mainMenuChoice == 2) {

        System.out.println("In the box below are relational and conditional statements.");
        // Relational and conditional statements are: <, >, ==, >=, <=, !=
        System.out.println("Enter two numbers and see if the first number you entered is: ");
        System.out.println(
            "greater than (>), less than (<), equal to (=), greater than or equal to (>=), less than or equal to (<=), or not equal (!=)");
        // >, <, <=,>= are relational
        // != and == are equality
        System.out.println("Enter two integers: ");
        System.out.println("Number 1: ");
        int input1 = sc.nextInt();
        System.out.println("Number 2: ");
        int input2 = sc.nextInt();
        if (input1 > input2) {
          System.out.println(input1 + " is greater than " + input2);
        }
        if (input1 < input2) {
          System.out.println(input1 + " is less than " + input2);
        }
        if (input1 == input2) {
          System.out.println(input1 + " is equal than " + input2);
        }
        if (input1 <= input2) {
          System.out.println(input1 + " is less than or equal to " + input2);
        }
        if (input1 >= input2) {
          System.out.println(input1 + " is greater than or equal to " + input2);
        }
        if (input1 != input2) {
          System.out.println(input1 + " is not equal to " + input2);
        } else {
          System.out.println("Incorrect input. Please try again.");
        }
      }
      if (mainMenuChoice == 3) {

        System.out.println("Increment Operator example:");
        System.out.println("View code for explanation.");
        int a = 5, b = 5;

        System.out.println(++a); // outputs 6, ++ increments the value of a and then returns a
        System.out.println(a); // outputs 6

        System.out.println(b++); // outputs 5, ++ returns the value of b and then increments
        System.out.println(b); // outputs 6

        System.out.println("Compound Assignment Operator example");
        System.out.println("View code for explanation.");
        int c = 2;
        // c += 3 is the equivalent to c = c + 3
        c += 3; // c now equals 5
        System.out.println(c);

        System.out.println("Decrement Operator example");
        System.out.println("View code for explanation.");
        int d = 8;

        System.out.println(d--); // outputs 8, -- decrements the value of d and then returns d
        System.out.println(d); // outputs 7
        break;
      }
      if (mainMenuChoice == 4) {

        System.out.println("Enter 1 or 2 to compare strings or to see if the strings are equal.");
        int value = sc.nextInt();
        System.out.println("----------------------------");
        System.out.println("| 1. compareTo() strings   |");
        System.out.println("| 2. equalTo() strings     |");
        System.out.println("----------------------------");

        if (value == 1) {

          System.out.println("You chose to compare three strings!");
          String str1 = "You chose to compare three strings!";
          String str2 = "compareTo example";
          String str3 = "You chose to compare three strings!";

          int variable1 = str1.compareTo(str2);
          System.out.println("str1 and str2 comparison: " + variable1);

          int variable2 = str1.compareTo(str3);
          System.out.println("str1 and str3 comparison: " + variable2);

          int variable3 = str2.compareTo("compareTo example");
          System.out.println("str2 and string argument comparison: " + variable3);
        }
        if (value == 2) {

          System.out.println("You chose to see if the strings are equal to one another.");
          System.out.println("View code to see error.");
          Object obj1 = null;
          java.lang.String str1 = obj1.toString();
          String("true1").equals("true1"); // this test is true, both strings have the
                                           // same value
          System.out.println(str1);

          boolean str2 = String("false1") == "false1"; // this test is false, they are not the same
                                                       // object
          // "==" compares the two object references and determines whether they refer to the same
          // instance
          System.out.println(str2);

          boolean str3 = String("false2") == new String("false2"); // this test is false, a new
                                                                   // string will not
          System.out.println(str3); // be equal

          boolean str = "true2" == "true2"; // this test is true, both strings have the same value
                                            // and are assigned to the same object
          System.out.println(str); // assigned to the same object

          boolean str4 = "true3" == "tr" + "ue" + "3"; // this test is true, the string literals are
                                                       // concatenated which will print them
                                                       // together
          System.out.println(str4);
        }
      }
    }
  }

  private static String String(String string) {
    // TODO Auto-generated method stub
    return null;
  }
}


