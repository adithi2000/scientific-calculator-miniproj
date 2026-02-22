package com.example;


import java.util.Scanner;
 import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {


private static final Logger logger = LogManager.getLogger(Main.class);
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
logger.info("User selected option: " + choice);


switch (choice) {


case 1:
logger.info("User calculating square root");
System.out.print("Enter number: ");
double num = sc.nextDouble();
logger.info("User calculating square root for " + num);
System.out.println("Result: " + calc.squareRoot(num));
break;


case 2:
System.out.print("Enter integer: ");
logger.info("User calculating factorial");
int fact = sc.nextInt();
logger.info("User calculating factorial of " + fact);
System.out.println("Result: " + calc.factorial(fact));
break;


case 3:
System.out.print("Enter number: ");
logger.info("User calcuating natural logarithm");
double log = sc.nextDouble();
logger.info("User calculating natural Log for number "+ log);
System.out.println("Result: " + calc.naturalLog(log));
break;


case 4:
System.out.print("Enter base: ");
logger.info("User calculating power of number");
double base = sc.nextDouble();
System.out.print("Enter exponent: ");
logger.info("User calculating for base "+base);
double exp = sc.nextDouble();
logger.info("User calculating for exp "+exp);
System.out.println("Result: " + calc.power(base, exp));

break;


case 5:

System.out.println("Exiting...");
logger.info("Application closed by user");
sc.close();
System.exit(0);


default:
logger.warn("Invalid choice");
System.out.println("Invalid choice");

}

}

}

}
