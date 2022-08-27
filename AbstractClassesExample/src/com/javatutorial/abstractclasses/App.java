package com.javatutorial.abstractclasses;

public class App {

  public static void main(String[] args) {

    Camera cam1 = new Camera();
    cam1.setId(14);

    Car volvo = new Car();
    volvo.setId(6);

    volvo.run();
  }
}