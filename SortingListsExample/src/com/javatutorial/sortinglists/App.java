package com.javatutorial.sortinglists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {

  private int id;
  private String name;

  public Person(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return id + ": " + name;
  }
}

//class StringLenghtComparator implements Comparator<String> {
//
//  @Override
//  public int compare(String o1, String o2) {
//    return o1.length() - o2.length();
//  }
//}


class ReverseAlphabeticalComparator implements Comparator<String> {

  @Override
  public int compare(String o1, String o2) {
    return -o1.compareTo(o2);
  }
}

public class App {

  public static void main(String[] args) {

    ////////////////////// Sorting Strings /////////////////////////
    List<String> animals = new ArrayList<>();

    animals.add("ox");
    animals.add("cat");
    animals.add("elephant");
    animals.add("tiger");
    animals.add("lion");
    animals.add("snake");
    animals.add("mongoose");

    Collections.sort(animals, new ReverseAlphabeticalComparator());

    System.out.println(animals);

    ////////////////////// Sorting Numbers /////////////////////////
    List<Integer> numbers = new ArrayList<>();
    numbers.add(55);
    numbers.add(3);
    numbers.add(34);
    numbers.add(51);
    numbers.add(48);
    numbers.add(123);

    Collections.sort(numbers, new Comparator<Integer>() {
      @Override
      public int compare(Integer o1, Integer o2) {
        return o2 - o1;
      }
    });

    System.out.println(numbers);

    ////////////////////// Sorting Arbitrary Classes /////////////////////////
    List<Person> people = new ArrayList<>();
    people.add(new Person(21, "Alberto"));
    people.add(new Person(12, "Maria"));
    people.add(new Person(12, "Gallo Pedro"));
    people.add(new Person(3, "Juan"));
    people.add(new Person(4, "Marcos"));

    // Sort in order of id
    Collections.sort(people, new Comparator<Person>() {
      @Override
      public int compare(Person o1, Person o2) {
        return o1.getId() - o2.getId();
      }
    });

    System.out.println(people);

    // Sort in order of name
    Collections.sort(people, new Comparator<Person>() {
      @Override
      public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());
      }
    });

    System.out.println(people);
  }
}