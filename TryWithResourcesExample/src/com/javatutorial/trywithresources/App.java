package com.javatutorial.trywithresources;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class Temp implements AutoCloseable {

  @Override
  public void close() {
    System.out.println("Closing");
    throw new RuntimeException("oh no!");
  }
}

public class App {

  public static void main(String[] args) {

    // method close automatically called by the try
    try (Temp temp = new Temp()){
    } catch (Exception e) {
      e.printStackTrace();
    }

    /*
    File file = new File("test.txt");

    BufferedReader br = null;

    try {
      FileReader fr = new FileReader(file);
      br = new BufferedReader(fr);

      String line;

      while ((line = br.readLine()) != null) {
        System.out.println(line);
      }
    } catch (FileNotFoundException e) {
      System.out.println("File not found: " + file);
    } catch (IOException e) {
      System.out.println("Unable to read file: " + file);
    } finally {
      try {
        br.close();
      } catch (IOException e) {
        System.out.println("Unable to close file: " + file);
      } catch (NullPointerException ex) {
        // File was probably never opened
      }
    }

     */
  }
}