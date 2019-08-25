package com.alexvinall.code.fizzbuzz;

public class FizzBuzz {

  /**
   * FizzBuzz
   *
   * @param args no args
   */
  public static void main(String[] args) {
    for (int i = 1; i <= 100; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        System.out.println("FizzBuzz");
      } else if (i % 5 == 0) {
        System.out.println("Buzz");
      } else if (i % 3 == 0) {
        System.out.println("Fizz");
      } else {
        System.out.println(i);
      }
    }
  }
}
