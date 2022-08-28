package com.javatutorial.transientexample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjects {

  public static void main(String[] args) {
    System.out.println("Reading objects...");

    try (ObjectInputStream os = new ObjectInputStream(new FileInputStream("people.bin"))) {

      Person person1 = (Person) os.readObject();
      Person person2 = (Person) os.readObject();

      System.out.println(person1);
      System.out.println(person2);
    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    } catch (IOException e) {
      throw new RuntimeException(e);
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
}
