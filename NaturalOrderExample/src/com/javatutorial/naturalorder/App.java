package com.javatutorial.naturalorder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.SortedSet;
import java.util.TreeSet;

class Country implements Comparable<Country> {

  private String name;

  public Country(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return name;
  }

  @Override
  public int compareTo(Country country) {
    int lenghtDif = name.length() - country.name.length();
    if (lenghtDif == 0) {
      return name.compareTo(country.name);
    }
    return lenghtDif;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Country country = (Country) o;
    return Objects.equals(name, country.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }
}

public class App {

  public static void main(String[] args) {

    List<Country> list = new ArrayList<>();

    SortedSet<Country> set = new TreeSet<>();

    addElements(list);
    addElements(set);

    Collections.sort(list);

    showElements(list);
    System.out.println();
    showElements(set);
  }

  private static void addElements(Collection<Country> col) {
    col.add(new Country("Poland"));
    col.add(new Country("Spain"));
    col.add(new Country("EEUU"));
    col.add(new Country("Ukraine"));
    col.add(new Country("Denmark"));
    col.add(new Country("Mozambique"));

  }

  private static void showElements(Collection<Country> col) {

    for (Country element : col) {
      System.out.println(element);
    }
  }
}