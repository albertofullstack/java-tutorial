package com.javatutorial.castingnumericals;

public class App {

  public static void main(String[] args) {

    byte byteValue = 20;
    short shortValue = 55;
    int intValue = 888;
    long longValue = 23355;

    float floatValue = 8844.3f;
    float floatValue2 = (float) 99.3;
    double doubleValue = 32.4;

    System.out.println(Byte.MAX_VALUE);

    intValue = (int) longValue;

    System.out.println(intValue);

    doubleValue = intValue;
    System.out.println(doubleValue);

    intValue = (int) floatValue;
    System.out.println(intValue);

    // The following won't work as we expect it to
    // output: -128
    byteValue = (byte) 128;
    System.out.println(byteValue);
  }
}