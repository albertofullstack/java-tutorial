package com.javatutorial.arraylists;

import java.util.ArrayList;
import java.util.List;

public class App {

  public static void main(String[] args) {

    List<Integer> numbers = new ArrayList<>();

    // Adding
    numbers.add(10);
    numbers.add(100);
    numbers.add(4);

    // Retrieving
    System.out.println(numbers.get(2));

    System.out.println("\nIteration #1: ");
    // Indexed for loop iteration
    for (int i = 0; i < numbers.size(); i++) {
      System.out.println(numbers.get(i));
    }

    // Removing items (careful!)
    numbers.remove(numbers.size() - 1);

    // This is VERY slow
    numbers.remove(0);

    System.out.println("\nIteration #2: ");
    for (Integer number : numbers) {
      System.out.println(number);
    }
  }
}