package com.javatutorial.genericwildcards;

import java.util.ArrayList;
import java.util.List;
import javafx.scene.Camera;

class Machine {

  public void start() {
    System.out.println("Machine starting!");
  }
  @Override
  public String toString() {
    return "Machine{}";
  }
}

class Television extends Machine {

  public void netflix() {
    System.out.println("Activating netflix!");
  }

  @Override
  public String toString() {
    return "Camera{}";
  }
}

public class App {

  public static void main(String[] args) {

    List<Machine> list1 = new ArrayList<>();
    list1.add(new Machine());
    list1.add(new Machine());

    List<Television> list2 = new ArrayList<>();
    list2.add(new Television());
    list2.add(new Television());

    showList(list2);
    showList2(list2);
    showList3(list1);
  }

  public static void showList(List<? extends Machine> list) {
    for (Machine value : list) {
      System.out.println(value);
      value.start();
    }
  }

  public static void showList2(List<? super Television> list) {
    for (Object value : list) {
      System.out.println(value);
    }
  }

  public static void showList3(List<?> list) {
    for (Object value : list) {
      System.out.println(value);
    }
  }
}