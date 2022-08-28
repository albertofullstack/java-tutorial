package com.javatutorial.hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import sun.reflect.generics.tree.Tree;

public class App {

  public static void main(String[] args) {
    Map<Integer, String> hashMap = new HashMap<>();
    Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
    Map<Integer, String> treeMap = new TreeMap<>();

    testMap(treeMap);

//    map.put(5, "Five");
//    map.put(4, "Four");
//    map.put(2, "Two");
//    map.put(0, "Zero");
//    map.put(16, "Sixteen");
//
//    map.put(2, "Hello");
//
//    String text = map.get(2);
//    System.out.println(text);
//
//    for (Map.Entry<Integer, String> entry: map.entrySet()) {
//      int key = entry.getKey();
//      String value = entry.getValue();
//
//      System.out.println(key + ":" + value);
//    }
  }

  public static void testMap(Map<Integer, String> map) {
    map.put(9, "fox");
    map.put(4, "mouse");
    map.put(6, "cat");
    map.put(1, "dog");
    map.put(0, "kangaroo");
    map.put(99, "ant");
    map.put(18, "bear");

    for (Integer key: map.keySet()) {

      String value = map.get(key);
      System.out.println(key + ":" + value);
    }
  }
}