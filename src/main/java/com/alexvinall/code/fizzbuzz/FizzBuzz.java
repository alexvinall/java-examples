package com.alexvinall.code.fizzbuzz;

import java.util.LinkedList;
import java.util.List;

public class FizzBuzz {

  /**
   * Prints FizzBuzz output for integers 1 to 100 inclusive.
   *
   * @param args no arguments
   */
  public static void main(String[] args) {
    List<String> outputLines = run(100);

    for (String line : outputLines) {
      System.out.println(line);
    }
  }


  /**
   * Runs FizzBuzz, accepting a ceiling value.
   *
   * @param ceiling the maximum integer value.
   * @return a List of output lines.
   */
  public static List<String> run(int ceiling) {
    LinkedList<String> outputLines = new LinkedList<>();

    for (int i = 1; i <= ceiling; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        outputLines.add("FizzBuzz");
      } else if (i % 5 == 0) {
        outputLines.add("Buzz");
      } else if (i % 3 == 0) {
        outputLines.add("Fizz");
      } else {
        outputLines.add(String.valueOf(i));
      }
    }

    return outputLines;
  }
}
