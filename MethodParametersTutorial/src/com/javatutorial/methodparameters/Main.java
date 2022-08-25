package com.javatutorial.methodparameters;

class Robot {

  public void speak(String text) {
    System.out.println(text);
  }

  public void jump(int height) {
    System.out.println("Jumping: " + height);
  }

  public void move(String direction, double distance) {
    System.out.println("Moving " + distance + "m in direction " + direction);
  }
}

public class Main {

  public static void main(String[] args) {
    Robot sam = new Robot();
    sam.speak("Hi I'm Sam");
    sam.jump(45);
    sam.move("west", 4.5);

    String greeting = "Hello there!";
    sam.speak(greeting);

    int value = 14;
    sam.jump(value);
  }
}