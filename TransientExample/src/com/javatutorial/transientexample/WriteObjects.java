package com.javatutorial.transientexample;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjects {

  public static void main(String[] args) {
    System.out.println("Writing objects...");

    Person mike = new Person(543, "Mike");
    Person.setCount(88);

    Person sue = new Person(234, "Sue");

    System.out.println(mike);
    System.out.println(sue);

    try(ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("people.bin"))) {

      os.writeObject(mike);
      os.writeObject(sue);

    } catch(FileNotFoundException e) {
      e.printStackTrace();
    } catch(IOException e) {
      e.printStackTrace();
    }
  }
}
