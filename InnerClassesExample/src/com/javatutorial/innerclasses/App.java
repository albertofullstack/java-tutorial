package com.javatutorial.innerclasses;

public class App {

  public static void main(String[] args) {

    Robot robot = new Robot(7);
    robot.start();

    // This is only for the example purpose
    //Robot.Brain brain = robot.new Brain();
    //brain.think();

    Robot.Battery battery = new Robot.Battery();
    battery.charge();
  }
}