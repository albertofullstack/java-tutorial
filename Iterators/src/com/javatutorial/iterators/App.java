package com.javatutorial.iterators;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class App {

  public static void main(String[] args) {

    List<String> items = new LinkedList<>();
    items.add("scissors");
    items.add("tv");
    items.add("pencil");
    items.add("pen");

    Iterator<String> it = items.iterator();

    while (it.hasNext()) {
      String itratorValue = it.next();
      System.out.println(itratorValue);

      if (itratorValue.equals("pencil")) {
        it.remove();
      }
    }

    System.out.println();

    // Modern iteration, Java 5 and later
    for (String item : items) {
      System.out.println(item);
    }

  }
}