package com.javatutorial.methods;

class Person {

  String name;
  int age;

  // This is a method (adds behavior to the class).
  void speak() {
    System.out.printf("Hello, my name is %s and I am %s years old\n", this.name, this.age);
  }

  public int getAge() {
    return this.age;
  }
}

public class Main {

  public static void main(String[] args) {
    Person person1 = new Person();
    person1.name = "Joe Bloggs";
    person1.age = 37;
    person1.speak();

    Person person2 = new Person();
    person2.name = "Sarah Smith";
    person2.age = 20;
    person2.speak();

    System.out.println(person1.name);
    System.out.println(person1.getAge());
  }
}