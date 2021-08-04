package com.vijay.MyShinyNumbers;
/**
 * Shiny Number app
 *  By Vijay Sukhadeve
 */
import java.util.ArrayList;
import java.util.List;

public class App {
  public static void main(String[] args) {
    List < String > first100Shiny = new ArrayList < > ();
    char[] array = null;
    int index = 246888; /* We want the number greater than this number*/
    index++;
    while (first100Shiny.size() < 100) {
      array = Integer.toString(index).toCharArray();
      if (isSorted(array)) {
        first100Shiny.add((new String(array)));
      }
      index++;
    }
    System.out.println(first100Shiny);
  }
  static boolean isSorted(char[] array) {
    for (int i = 0; i < array.length - 1; i++) {
      if ((int) array[i] > (int) array[i + 1])
        return false;
    }
    return true;
  }

}