package com.javatutorial.tostring;

class Frog {

  private int id;

  private String name;

  public Frog(int id, String name) {
    this.id = id;
    this.name = name;
  }

  @Override
  public String toString() {

    return String.format("%-4d: %s", id, name);

    /*
    StringBuilder sb = new StringBuilder();
    sb.append(id).append(": ").append(name);
    return sb.toString();
     */
  }
}

public class Main {

  public static void main(String[] args) {
    Frog frog1 = new Frog(7, "Fred");
    Frog frog2 = new Frog(5, "George");

    // If you invoke this without the toString method it will
    // print the hashcode (com.javatutorial.tostring.Frog@7d4991ad)
    // the hashcode is an unique identifier for the object
    System.out.println(frog1);
    System.out.println(frog2);
  }
}