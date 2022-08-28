package com.javatutorial.enums;

public enum Animal {

  CAT("cat"),
  DOG("dog"),
  MOUSE("mouse");

  private String name;

  Animal(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "This animal is called: " + name;
  }
}
