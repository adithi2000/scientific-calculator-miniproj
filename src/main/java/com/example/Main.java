package com.example;


import java.util.Scanner;
 import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {


private static final Logger logger = LogManager.getLogger(Main.class);
public static void main(String[] args) {


Scanner sc = new Scanner(System.in);

Calculator calc = new Calculator();

if (args.length > 0) {


try {

switch (args[0].toLowerCase()) {


case "sqrt":
logger.info("User calculating square root");
double num = Double.parseDouble(args[1]);
logger.info("User calculating square root for " + num);
System.out.println("Result: " + calc.squareRoot(num));
break;


case "factorial":
logger.info("User calculating factorial");
int fact = Integer.parseInt(args[1]);
logger.info("User calculating factorial of " + fact);
System.out.println("Result: " + calc.factorial(fact));
break;


case "log":
logger.info("User calcuating natural logarithm");
double log = Double.parseDouble(args[1]);
logger.info("User calculating natural Log for number "+ log);
System.out.println("Result: " + calc.naturalLog(log));
break;


case "power":
logger.info("User calculating power of number");
double base = Double.parseDouble(args[1]);
logger.info("User calculating for base "+base);
double exp = Double.parseDouble(args[2]);
logger.info("User calculating for exp "+exp);
System.out.println("Result: " + calc.power(base, exp));

break;


default:

System.out.println("Exiting...");
logger.info("Application closed by user");
sc.close();
System.exit(0);

}

}catch (Exception e) {
                logger.error("Error in argument mode: " + e.getMessage());
            }

}

}

}
