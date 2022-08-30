package com.javatutorial.customobjects;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

class Person {

  private int id;
  private String name;

  public Person(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public String toString() {
    return "{ID is: " + id + "; name is " + name + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Person person = (Person) o;
    return id == person.id && Objects.equals(name, person.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }
}

public class App {

  public static void main(String[] args) {

    Person p1 = new Person(0, "Tim");
    Person p2 = new Person(1, "Jonas");
    Person p3 = new Person(2, "Hugo");
    Person p4 = new Person(1, "Jonas");

    Map<Person, Integer> map = new LinkedHashMap<>();

    map.put(p1, 1);
    map.put(p2, 2);
    map.put(p3, 3);
    map.put(p4, 4);

    for (Person key : map.keySet()) {
      System.out.println(key + ": " + map.get(key));
    }

    Set<Person> set = new LinkedHashSet<>();

    set.add(p1);
    set.add(p2);
    set.add(p3);
    set.add(p4);

    System.out.println(set);
  }
}