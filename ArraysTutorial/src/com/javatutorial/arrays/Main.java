package com.javatutorial.arrays;

public class Main {

  public static void main(String[] args) {

    int value = 7;

    int[] values;
    values = new int[3];

    System.out.println(values[0]);

    values[0] = 10;
    values[1] = 20;
    values[2] = 30;

    System.out.println(values[0]);
    System.out.println(values[1]);
    System.out.println(values[2]);

    // Version 1 - for
    for (int i = 0; i < values.length; i++) {
      System.out.println(values[i]);
    }

    // Version 2 - foreach
    for (int i : values) {
      System.out.println(i);
    }

    int[] numbers = {5, 6, 7};
    for (int number: numbers) {
      System.out.println(number);
    }
  }
}