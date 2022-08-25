package com.javatutorial.classesandobjects;

class Person {

  // Instance variables (data or "state")
  String name;
  int age;

  // Classes can contain

  // 1. Attributes (variables)
  // 2. Behavior (methods)
}

public class Main {

  public static void main(String[] args) {

    Person person1 = new Person();
    person1.name = "Joe Bloggs";
    person1.age = 37;

    Person person2 = new Person();
    person2.name = "Sarah Smith";
    person2.age = 20;

    System.out.println(person1.name);

    RedFruit cherry = new RedFruit();
  }
}