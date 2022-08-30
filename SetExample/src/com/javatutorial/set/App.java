package com.javatutorial.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {

  public static void main(String[] args) {

    // A set only stores unique elements
    // HashSet does not retain order
    // output: [mouse, cat, snake, kangaroo, bear, dog]
    //Set<String> set1 = new HashSet<>();

    // LinkedHashSet retain order
    // output: [dog, cat, snake, bear, kangaroo, mouse]
    //Set<String> set1 = new LinkedHashSet<>();

    // TreeSet sorts in natural order
    // output: [bear, cat, dog, kangaroo, mouse, snake]
    Set<String> set1 = new TreeSet<>();

    if (set1.isEmpty()) {
      System.out.println("Set is empty");
    }

    set1.add("dog");
    set1.add("cat");
    set1.add("snake");
    set1.add("bear");
    set1.add("kangaroo");

    if (set1.isEmpty()) {
      System.out.println("Set is empty after adding elements");
    }

    // Adding duplicated items
    set1.add("mouse");

    System.out.println(set1);

    // Iteration
    for (String element: set1) {
      System.out.println(element);
    }

    // Does set contains contains a given item?
    if (set1.contains("asdf")) {
      System.out.println("Contains asdf");
    }

    if (set1.contains("cat")) {
      System.out.println("Contains cat");
    }

    // Intersection
    Set<String> set2 = new TreeSet<>();
    set2.add("ant");
    set2.add("cat");
    set2.add("komodo dragon");
    set2.add("monkey");
    set2.add("kangaroo");

    Set<String> intersection = new HashSet<>(set1);
    intersection.retainAll(set2);

    System.out.println(intersection);

    // Difference
    Set<String> difference = new HashSet<>(set1);
    difference.removeAll(set2);
    System.out.println(difference);
  }
}