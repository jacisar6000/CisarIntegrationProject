import java.util.ArrayList;
import java.text.DecimalFormat;
import java.util.*;

public class Main {

	public static void main(String[] args) { // String[] is a parameter and public static void
												// main(String[] args) is a header

		// I'm Joseph Cisar and welcome to my integration project! This project is a
		// combination of my programming exercises and code demonstrated in module
		// resources.
		// The main set-up is a main menu. By entering the number of your choice, the
		// option will
		// appear.
		// Use ctrl + shift + f to auto-format jjjjj
		System.out.println("Welome to my Integration Project!");
		int x = 8;
		int y = 8;
		int weeks = x + y;
		System.out.println("This project will show you " + weeks + " weeks of what Java I have learned so far.");
		System.out.println("In the box below, select any of the following to learn or to use a program made with Java.");
		// List of Data Types:
		// Integer (int) is used for whole numbers and will return a whole number during
		// division.
		// Double (double) is used for decimal values and will return a decimal in
		// division.
		// Boolean The boolean data type has only two possible values: true and false.
		// Use this data type for simple flags that track true/false conditions.
		// String (str) represents character strings. Strings are constant and cannot be
		// changed after
		// being created.

		try {
			System.out.println("------------------------------------------------------------");
			System.out.println("| 1. Basic Calculator                                      |");
			System.out.println("| 2. Use relational and conditional operators              |");
			System.out.println("| 3. Increment and decrement operators                     |");
			System.out.println("| 4. compareTo() and equalTo() strings                     |");
			System.out.println("| 5. Math/Random class example                             |");
			System.out.println("| 6. Switch statements                                     |");
			System.out.println("| 7. Casting example                                       |");
			System.out.println("| 8. Final example                                         |");
			System.out.println("| 9. Escape equences                                       |");
			System.out.println("| 10. View code: Create a method with arguments and return |");
			System.out.println("| 11. View code: 3 string methods                          |");
			System.out.println("| 12. For Loop                                             |");
			System.out.println("| 13. Do/While Loop                                        |");
			System.out.println("| 14. Break and continue                                   |");
			System.out.println("| 15. String ArrayList                                     |");
			System.out.println("| 16. Searching an Array                                   |");
			System.out.println("| 17. Smallest integer of an array                         |");
			System.out.println("| 18. Sum of array values                                  |");
			System.out.println("| 19. Polymorphism code                                    |");
			System.out.println("| 20. Overloading a method                                 |");
			System.out.println("| 21. Inheritance and its benefits                         |");
			System.out.println("| 22. Enchanced for loop                                   |");
			System.out.println("| 23. Super to access obj/constructor                      |");
			System.out.println("| 24. Multidimensional array                               |");
			System.out.println("| 25. Searching a 2-D array                                |");
			System.out.println("------------------------------------------------------------");

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter choice here: ");
			int mainMenuChoice = sc.nextInt();

			while (mainMenuChoice > 0) {

				if (mainMenuChoice == 1) {

					try {
						System.out.println("Enter a number in the box below to chose what arthimic operation you want.");
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
							// In Java, operator precedence is when two operators share an operand the
							// operator with
							// the higher precedence goes first
							// For example, multiplication and division have a higher precedence than
							// addition and
							// subtraction -- another example is PEMDAS
							// Precedence rules can be overridden by parentheses and arrays
							System.out.println("Enter two decimal numbers to find the sum.");
							System.out.println("Number 1: ");
							double input1 = sc.nextDouble();
							System.out.println("Number 2: ");
							double input2 = sc.nextDouble();
							System.out.println(input1 + input2); // (input1 + input2) is an argument
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
						}
					} catch (Exception e) {
						System.out.println("Incorrect input");
						break;
					}
				}

				if (mainMenuChoice == 2) {

					try {
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
					} catch (Exception e) {
						System.out.println("Incorrect input");
						break;
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

					try {
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

							int variable1 = str1.compareTo(str2); // Compares str1 and str2
							System.out.println("str1 and str2 comparison: " + variable1);

							int variable2 = str1.compareTo(str3); // Compares str1 and str3
							System.out.println("str1 and str3 comparison: " + variable2);

							int variable3 = str2.compareTo("compareTo example"); // Compares str2 and the argument
							System.out.println("str2 and string argument comparison: " + variable3);
						}
						if (value == 2) {

							System.out.println("You chose to see if the strings are equal to one another.");
							// Could not get this test to work
							// str1.equals(str2);
							// str1 = String("true1").equals("true1"); // this test is true, both strings
							// have the
							// same value
							// System.out.println(str1);

							boolean str5 = String("false1") == "false1"; // this test is false, they are not the same
																			// object "==" compares the two object
																			// references and determines
																			// whether they refer to the same
																			// instance
							System.out.println(str5);

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
					} catch (Exception e) {
						System.out.println("Incorrect input");
						break;
					}
				}

				if (mainMenuChoice == 5) {

					try {
						System.out.println(
								"Chose 1 to raise a random integer to a random integer or 2 to find the sine, cosine, and tangent of a random degree.");
						int mathChoice = sc.nextInt();
						System.out.println("------------------------------------------------------");
						System.out.println("| 1. Raising a number to a power                     |");
						System.out.println("| 2. Find the sine, cosine and tangent of a degree   |");
						System.out.println("------------------------------------------------------");

						if (mathChoice == 1) {
							Random rand = new Random(); // Generates a random number
							int value = rand.nextInt(4);
							int value2 = rand.nextInt(4);
							System.out.println(value + " to the " + value2 + "th power is " + Math.pow(value, value2));
						}
						if (mathChoice == 2) {
							Random rand = new Random();
							int degree = rand.nextInt(360); // 360 is the limit
							System.out.println("The sine of " + degree + "° is " + Math.sin(degree));
							System.out.println("The cosine of " + degree + "° is " + Math.cos(degree));
							System.out.println("The tangent of " + degree + "° is " + Math.tan(degree));
						}
					} catch (Exception e) {
						System.out.println("Incorrect input");
						break;
					}
				}
				if (mainMenuChoice == 6) {

					try {
						System.out.println("Enter a number 1-7 to find the corresponding day of the week.");
						int day = sc.nextInt();
						// A switch statement allows a variable to be tested for equality against a list
						// of values,
						// the values are called "case"
						switch (day) {
						case 1:
							System.out.println("It's Sunday");
							break;
						case 2:
							System.out.println("It's Monday");
							break;
						case 3:
							System.out.println("It's Tuesday");
							break;
						case 4:
							System.out.println("It's Wednesday");
							break;
						case 5:
							System.out.println("It's Thursday");
							break;
						case 6:
							System.out.println("It's Friday");
							break;
						case 7:
							System.out.println("It's Saturday");
							break;
						default: // default output is what's printed when the incorrect input is entered
							System.out.println("Incorrect input.");
						}
					} catch (Exception e) {
						System.out.println("Incorrect input");
						break;
					}
				}
				if (mainMenuChoice == 7) {
					// Casting is used to convert an object or variable of one type into another
					double calculatedMark = 86.6;
					int finalGrade = (int) calculatedMark; // In this example, 86.6 is converted into 87 by
															// widening
					System.out.println("The casted number is " + finalGrade);
					break;
				}
				if (mainMenuChoice == 8) {
					// When final is used, the final value of the variable cannot be changed once it
					// has been
					// assigned
					final double PI = 3.14;
					DecimalFormat df = new DecimalFormat("##.##"); // Decimal format allows you to control how
																	// many decimals you want in your answer
																	// The # sign holds the places
					System.out.println("Enter an integer to multiply it by PI: ");
					double choice8 = sc.nextDouble();
					double product = choice8 * PI;
					System.out.println(choice8 + " * " + PI + " is " + (df.format(product))); // Decimal format
																								// is assigned
				}
				if (mainMenuChoice == 9) {
					System.out.println("My Integration Project...\t is almost finshed!"); // Insert a tab in the
																							// text at this point
					System.out.println("My Integration Project... is almost finshed!\b"); // Insert a backspace
																							// in the text at this
																							// point
					System.out.println("My Integration Project...\n is almost finshed!"); // Insert a newline in
																							// the text at this
																							// point
					System.out.println("My\r Integration Project... is almost finshed!"); // Insert a carriage
																							// return in the text
																							// at this point.
					System.out.println("My Integration\f Project... is almost finshed!"); // Insert a formfeed
																							// in the text at this
																							// point.
					System.out.println("My \'Integration Project\'... is almost finshed!"); // Insert a single
																							// quote character
																							// in the text at
																							// this point.
					System.out.println("My \"Integration Project\"... is almost finshed!"); // Insert a double
																							// quote character
																							// in the text at
																							// this point.
					System.out.println("My \\Integration Project\\... is almost finshed!"); // Insert a
																							// backslash
																							// character in the
																							// text at this
																							// point.
					break;
				}

				if (mainMenuChoice == 10) {

					class CreateMethod {
						{
							double length = 17.0;
							double width = 9.7;
							System.out.println(calculateArea(length, width));
						}

						public double calculateArea(double side1, double side2) {
							double area;
							area = side1 * side2;
							return area;
						}
					}

					if (mainMenuChoice == 11) {
						System.out.println("The code is there but they are not printing.");

						String Str1 = new String("How long is this string?");
						System.out.print("The string is " + Str1.length() + "characters long.");
						System.out.println(Str1.length()); // The length() method gives the length of how many
															// characters long the string is

						String Str2 = "What number character is \"c\" in this string?";
						char charNum = Str2.charAt(11);
						System.out.println(charNum); // The charAt() method returns the character located at the
														// number given

						String Str3 = new String("is finally done!");
						System.out.print("My Integration Project");
						System.out.println(Str3.toString()); // The toString() method returns itself as a string
					}

					if (mainMenuChoice == 12) {

						{
							for (int i = 10; i > 1; i--) {
								System.out.println("The value of i is: " + i); // The output of the program is "The
																				// value of
																				// the program is 10... and goes down to
																				// 2.
																				// i-- has the loop go in a descending
																				// order
							}
						}
					}

					if (mainMenuChoice == 13) {
						// do/while loop
						int i = 5;
						do {
							System.out.println(i);
							i++;
						} while (i <= 10);
					}

					if (mainMenuChoice == 14) {
						// Break and Continue
						for (int i = 1; i <= 3; i++) {
							if (i == 2) {
								System.out.print("This is a continue statement.");
								continue;
							}
							System.out.print("[i:" + i + "]"); // This block of code prints:
																// continue when i is 2:
																// [i:1][continue][i:3]
						}
						for (int i = 1; i <= 3; i++) {
							if (i == 2) {
								System.out.print("This is a break statement.");
								break;
							}
							System.out.print("[i:" + i + "]"); // This block of code prints:
																// break when i is 2:
																// [i:1][break]
						}
					}

					if (mainMenuChoice == 15) {
						// The ArrayList while using "add" adds the string to the output
						ArrayList<String> cities = new ArrayList<String>() {
							{
								add("Fort Myers");
								add("Estero");
								add("Bonita Springs");
								add("Naples");
								add("Immokalee");
							}
						};
						System.out.println("The closest cities near FGCU are:" + cities);
					}
					if (mainMenuChoice == 16) {

						// Declaring an array to hold grades
						int[] scores = { 87, 75, 98, 100, 82, 72, 88, 92, 60, 78 };

						// Declare a boolean variable for a flag
						boolean found;

						// Declare a variable for a loop counter
						int index;

						// The flag must be False when it is started
						found = false;

						// Set counter variable to 0
						index = 0;

						// Have the array be searched for a score equal to 100
						while (found == false && index < scores.length) {
							if (scores[index] == 100)
								found = true;
							else
								index = index + 1;
						}

						// Print output
						if (found)
							System.out.println("You got a 100 on test number " + (index + 1));
						else
							System.out.println("You did not get a 100 on any test.");
						// The output is "You got a 100 on test number 4"

					}
					if (mainMenuChoice == 17) {

						try {
							// Find the smallest integer in an array
							int[] tenIntArray = new int[10];
							int i, userIn;

							Scanner KyBdIn = new Scanner(System.in);
							System.out.println("Please enter 10 integer numbers ");

							for (i = 0; i < tenIntArray.length; i++) {
								System.out.println("Please enter integer " + i);
								userIn = KyBdIn.nextInt();
								tenIntArray[i] = userIn;
							}
						} catch (Exception e) {
							System.out.println("Incorrect input");
							break;
						}

						if (mainMenuChoice == 18) {

							// Get the sum of the values in an array using an accumulator
							int sumofarray[] = { 1, 2, 3, 4, 5 };
							int sum = 0;

							for (int counter = 0; counter < sumofarray.length; counter++) {
								sum += sumofarray[counter];
							}
							System.out.println("The sum of these numbers is " + sum);
						}

						if (mainMenuChoice == 19) {

							{
								// Polymorphism is subclasses of a class being defined by their own unique
								// behaviors and share some of the same functionality of the parent class
								// In this case, Animal is the parent class and the species and sound of the
								// species are the subclasses
								new Lion();
								Animal Lion = null;
								Animal[] Safari = { Lion };
								for (Animal anAnimal : Safari) {

								}
							}
						}

						class Animal {

							public String showSpecies() {
								return "Animal";
							}

							public void makeSound() {
								System.out.println("Roar");
							}
						}

						class Lion extends Animal {

							public Lion() {
							}

							public String showSpecies() {
								return "Lion";
							}

							public void makeSound() {
								System.out.println("Roar");
							}
						}
					}
					if (mainMenuChoice == 20) {
						// Overloading a method
						// Classes can have two different arguments for this
						class Start {
							public void main(String[] args) {

								Start mStart = new Start();

								System.out.println(mStart.TenYears(21, "Joey"));
							}

							public int TenYears(int Age) {
								return Age + 10;
							}

							public int TenYears(int Age, String Name) {
								System.out.println(Name);
								return TenYears(Age);
							}
						}
					}
					if (mainMenuChoice == 21) {

						// Inheritance and its benefits
						steak steakObject = new steak();
						salad saladObject = new salad();
					}
					class food {

						public void eat() {
							System.out.println("New example of something edible");
						}
					}
					// What both salad and steak have in common is that they are both food and
					// edible.
					// When the program is ran, if "steak" had no text, then both classes would
					// print "New example of something edible"
					// Both classes inherit what the food class contains sicnd they extend from the
					// food class
					// With what is in the code right now, only the salad class will inherit from
					// the food class because the steak class has its own text

					class salad extends food {

					}
					class steak extends food {

						public void eat() {
							System.out.println("This is the the steak method");
						}
					}
				}
				if (mainMenuChoice == 22) {
					// Enhanced for loops are used to make loops more compact and easy to read
					// They are designed for collections and arrays
					int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
					for (int item : numbers) {
						System.out.println("This statement will print 10 times. See?" + item);
					}
				}
				if (mainMenuChoice == 23) {
					// Super to access objects and constructors
					// Access objects
					// Objects have return types
					class Person1 { // Base class
						void message() {
							System.out.println("Person is the base class");
						}
					}

					class Student extends Person1 { // Subclass
						void message() {
							System.out.println("Student is the subclass");
						}

						void display() {
							// will reject or call current class message() method
							message();

							// Using super will call the parent class method
							super.message();
						}
					}
					Student s = new Student();

					// calling display() of Student
					s.display();

					// Acess constructors
					// Constructors have no return types
					class Person // Person is the superclass
					{
						Person() {
							System.out.println("Person class is the constructor");
						}
					}

					class Student2 extends Person // Student2 is a subclass inheriting from the superclass Person
					{
						Student2() {
							// This is reject or call the constructor
							super();

							System.out.println("Student class Constructor");
						}
					}
					Student2 stu = new Student2();
				}
				if (mainMenuChoice == 24) {
					// Multidimenisonal array: declaring, instantiate, and initlizing
					int firstarray[][] = { { 8, 9, 10, 11 }, { 12, 13, 14, 15 }, { 1, 2, 3, 4 } };
					int secondarray[][] = { { 30, 31, 32, 33 }, { 43, 1, 2, 5 }, { 4, 9, 5, 6 } };

					System.out.println("First array");
					display(firstarray); // "display" will display the arrays when initiated

					System.out.println("Second array");
					display(secondarray);

					// Searching the array to find the lengths of the each array
					for (int i = 0; i < firstarray.length; i++) {
						// This loop searches each row
						for (int j = 0; j < secondarray.length; j++) {
							// This loop searches each column in a row
						}
					}
				}
				if (mainMenuChoice == 25) {
					// 2-D array
					class TwoDArray {

					}
					Scanner keyboard = new Scanner(System.in);
					// Creating the array
					int rows = 3;
					int columns = 4;
					int[][] values = new int[rows][columns];

					// Counter variable for rows and columns
					int column = 0, row;

					// Get the values to store them in an array
					for (row = 0; row <= rows - 1; row++) {
						for (column = 0; column <= columns - 1; column++) {
							System.out.println("Enter a number: ");
							values[row][column] = keyboard.nextInt();
						}
					}
					try {
						// Array output
						System.out.println("Here is the value that was entered. ");
						for (row = 0; column <= columns - 1; row++) {
							for (column = 0; column <= columns - 1; column++) {
								System.out.println(values[row][column]);
							}
						}
					} catch (Exception e) {
						System.out.println("Incorrect input");
						break;
					}
				}

			}
		}

		catch (Exception e) {
			System.out.println("Incorrect input");
		}
	}

	private static void display(int[][] firstarray) {

	}

	private static String String(String string) {

		return null;
	}

}
