package com.javatutorial.runtimeexceptions;

public class App {

  public static void main(String[] args) {

    // This will throw an arithmetic exception
    // Which inherit from Runtime exception
    //int value = 7;
    //value = value / 0;

    // This will throw a NullPointerException
    // which is a runtime exception
    //String text = null;
    //System.out.println(text.length());

    // This will throw an ArrayIndexOutOfBoundsException
    String[] texts = {"one", "two", "three"};

    try {
      System.out.println(texts[5]);
    } catch (RuntimeException e) {
      System.out.println(e);
    }
  }
}