package com.javatutorial.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {

  public static void main(String[] args) {

    ///////////////////// Before Java 5 ///////////////////
    ArrayList list = new ArrayList();

    list.add("apple");
    list.add("pineapple");
    list.add("yellow kiwi");

    String fruit = (String) list.get(2);
    System.out.println(fruit);

    ///////////////////// Modern style ///////////////////
    List<String> animals = new ArrayList<>();
    animals.add("cat");
    animals.add("kangaroo");
    animals.add("crocodile");

    String animal = animals.get(1);
    System.out.println(animal);

    /////// There can be more than one type argument ////////
    Map<Integer, String> map = new HashMap<>();

    /////// Java 7 style ////////
    // Just put diamond bracket in the constructor
  }
}