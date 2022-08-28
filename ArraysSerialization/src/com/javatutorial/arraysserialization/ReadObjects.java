package com.javatutorial.arraysserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class ReadObjects {

  public static void main(String[] args) {
    System.out.println("Reading objects...");

    try (FileInputStream fs = new FileInputStream("people.bin")) {

      ObjectInputStream os = new ObjectInputStream(fs);

      List<Person> people = (List<Person>) os.readObject();

      for (Person person : people) {
        System.out.println(person);
      }

      int num = os.readInt();

      for (int i = 0; i< num; i++) {
        Person person = (Person) os.readObject();
        System.out.println(person);
      }

      os.close();
    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    } catch (IOException e) {
      throw new RuntimeException(e);
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
}
