package com.javatutorial.gettersandreturn;

class Person {

  private String name;
  private int age;

  // This is a method (adds behavior to the class).
  void speak() {
    System.out.printf("Hello, my name is %s and I am %s years old\n", this.name, this.age);
  }

  // Calcula la edad de jubilación
  int calculateYearsToRetirement() {
    int yearsLeft = 65 - this.age;

    return yearsLeft;
  }

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }
}

public class Main {

  public static void main(String[] args) {

    Person person1 = new Person();
    person1.setName("Joe Bloggs");
    person1.setAge(37);
    //person1.speak();

    int yearsToRetirement = person1.calculateYearsToRetirement();
    System.out.println("Years till retirement: " + yearsToRetirement);

    String name = person1.getName();
    int age = person1.getAge();

    System.out.println("Name is " + name);
    System.out.println("Age is " + age);
  }
}