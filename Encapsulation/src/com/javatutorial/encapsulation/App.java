package com.javatutorial.encapsulation;

class Plant {

  public static final int ID = 8;

  // we need to access this variable because is private
  private String name;

  public String getData() {
    return "some stuff" + calculateGrowthForecast();
  }

  private int calculateGrowthForecast() {
    return 9;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}

public class App {

  public static void main(String[] args) {

  }
}