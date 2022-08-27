package com.javatutorial.multipleexceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class App {

  public static void main(String[] args) {

    Test test = new Test();

    /*
    try {
      test.run();
    } catch (IOException | ParseException e) {
      throw new RuntimeException(e);
    }
    */

    /*
    try {
      test.run();
    } catch (IOException e) {
      throw new RuntimeException(e);
    } catch (ParseException e) {
      throw new RuntimeException(e);
    }
     */

    try {
      test.run();
    } catch (Exception e) {
      e.printStackTrace();
    }

    try {
      test.input();
    } catch (FileNotFoundException fne) {
      fne.printStackTrace();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}