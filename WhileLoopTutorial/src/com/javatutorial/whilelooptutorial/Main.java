package com.javatutorial.whilelooptutorial;

public class Main {

  public static void main(String[] args) {

    int value = 0;
    boolean loop = value < 10;
    System.out.println("Loop: " + loop);

    while(value < 10) {
      System.out.println("Hello " + value);
      value++;
    }
    loop = value < 10;

    System.out.println(value);
    System.out.println("Loop: " + loop);
  }
}