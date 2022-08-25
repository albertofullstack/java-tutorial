package com.javatutorial.stringbuilder;


public class Main {

  public static void main(String[] args) {

    // Memory Inefficient
    // Creates a new String in memory every time it appends with +=
    String info = "";

    info += "My name is Alberto.";
    info += " ";
    info += "I am a builder.";

    System.out.println(info);

    // More memory efficient
    StringBuilder sb = new StringBuilder("");

    sb.append("My name is Marie");
    sb.append(" ");
    sb.append("I am a lion tamer.");

    System.out.println(sb.toString());

    StringBuilder s = new StringBuilder();
    s.append("My name is Walter White")
        .append(" ")
        .append("I cook blue happiness.");

    System.out.println(s.toString());

    //// Formatting //////////////////////////

    System.out.print("Here is some text.\tThat was a tab.\nThat was a new line.");
    System.out.println(" More text.");

    // Formatting integers
    System.out.printf("Total cost %-10d; quantity is %d", 5, 144);

    for (int i = 0; i < 20; i++) {
      System.out.printf("%-2d: %s\n", i, "here is some text");
    }

    // Formating floating point value
    System.out.printf("Total value: %.2f\n", 5.6874);
    System.out.printf("Total value: %-6.1f\n", 343.23423);
  }
}