package com.javatutorial.userinput;


import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    // Create scanner object
    Scanner input = new Scanner(System.in);

    // Output the prompt
    System.out.println("Enter a line of text: ");

    // Wait for the user to enter a line of text
    String line = input.nextLine();

    System.out.println("You entered: " + line);

    System.out.println("Enter an integer: ");
    int value = input.nextInt();
    System.out.println("You entered: " + value);

    System.out.println("Enter an double: ");
    double myDouble = input.nextDouble();
    System.out.println("You entered: " + myDouble);
  }
}