package com.javatutorial.othercastings;

class Machine {

  public void start() {
    System.out.println("Machine started!");
  }
}

class Camera extends Machine {

  @Override
  public void start() {
    System.out.println("Camera started");
  }

  public void snap() {
    System.out.println("Photo taken");
  }
}

public class App {

  public static void main(String[] args) {
    Machine machine1 = new Machine();
    Camera camera1 = new Camera();

    machine1.start();
    camera1.start();
    camera1.snap();

    // Up-casting: we cast from one object to a parent object,
    // in this case a Camera to its parent class Machine
    Machine machine2 = camera1;
    machine2.start();
    // error machine2.snap();

    // Down-casting: we cast from one object to a child object
    // in this case a Machine to its child class Camera
    Machine machine3 = new Camera();
    Camera camera2 = (Camera) machine3;
    camera2.start();
    camera2.snap();

    // Doesn't work --- runtime error.
    // This probes down-casting can be unsafe
    Machine machine4 = new Machine();
    // Camera camera3 = (Camera) machine4;
    // camera3.start();
    // camera3.snap();
  }
}