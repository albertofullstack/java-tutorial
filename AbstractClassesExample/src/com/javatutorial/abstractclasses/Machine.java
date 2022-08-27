package com.javatutorial.abstractclasses;

/*
   About abstract classes
   -------------------------------------------------
   When you make the class a child of abstract class
   you make strong statement of what a child class is
   Here you say a Car and a Camera are Machines
*/
/*
   Interfaces are used to define what a class can do
   Behavior, they don't have a strong dependency with a child class
   Besides, interfaces doesn't provide implementation, only the form of the methods.
*/

public abstract class Machine {

  private int id;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public abstract void start();
  public abstract void doStuff();
  public abstract void shutdown();

  public void run() {
    start();
    doStuff();
    shutdown();
  }
}
