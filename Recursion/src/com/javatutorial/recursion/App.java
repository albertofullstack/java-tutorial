package com.javatutorial.recursion;

// TODO: Try to implement Towers of Hanoi
public class App {

  public static void main(String[] args) {

    // E.g 4! = 4 * 3 * 2 * 1
    System.out.println("Factorial: " + factorial(10));
  }

  private static int factorial(int value) {

    System.out.println(value);

    if (value == 1)
      return 1;

    return value * factorial(value - 1);
  }
}