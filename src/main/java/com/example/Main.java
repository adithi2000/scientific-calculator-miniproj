package com.example;


import java.util.Scanner;


public class Main {


public static void main(String[] args) {


Scanner sc = new Scanner(System.in);

Calculator calc = new Calculator();


while (true) {


System.out.println("\nScientific Calculator");

System.out.println("1. Square Root");

System.out.println("2. Factorial");

System.out.println("3. Natural Logarithm");

System.out.println("4. Power");

System.out.println("5. Exit");


System.out.print("Choose option: ");

int choice = sc.nextInt();


switch (choice) {


case 1:

System.out.print("Enter number: ");

double num = sc.nextDouble();

System.out.println("Result: " + calc.squareRoot(num));

break;


case 2:

System.out.print("Enter integer: ");

int fact = sc.nextInt();

System.out.println("Result: " + calc.factorial(fact));

break;


case 3:

System.out.print("Enter number: ");

double log = sc.nextDouble();

System.out.println("Result: " + calc.naturalLog(log));

break;


case 4:

System.out.print("Enter base: ");

double base = sc.nextDouble();

System.out.print("Enter exponent: ");

double exp = sc.nextDouble();

System.out.println("Result: " + calc.power(base, exp));

break;


case 5:

System.out.println("Exiting...");

sc.close();

System.exit(0);


default:

System.out.println("Invalid choice");

}

}

}

}
