package com.javatutorial.arraysserialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WriteObjects {

  public static void main(String[] args) {
    System.out.println("Writing objects...");

    Person[] people = {
        new Person(543, "Mike"),
        new Person(234, "Sue")
    };

    List<Person> peopleList = new ArrayList<>(Arrays.asList(people));

    try (FileOutputStream fs = new FileOutputStream("people.bin");
        ObjectOutputStream os = new ObjectOutputStream(fs)
    ) {

      os.writeObject(peopleList);

      os.writeInt(peopleList.size());

      for (Person person : peopleList) {
        os.writeObject(person);
      }

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
