package com.alexvinall.code.palindrome;

import java.util.Stack;


/**
 * Detects palindromes, such as "racecar".
 *
 */
public class Palindrome {

  /**
   * Prints 'true' if the provided string is
   * a palindrome, otherwise prints 'false'
   *
   */
  public static void main(String[] args) {
// TODO implement this and print output to stdout
  }


  /**
   * @param input string to check
   * @return true if the input string is a palindrome, otherwise false.
   */
  public boolean isPalindrome(String input) {
    // Early return checks for null or zero-length input
    if (input == null || input.length() == 0) {
      return true;
    }

    // TODO sanitise input by removing punctuation and make case insensitive

    // Create a Stack containing all the characters in the input so that we can reverse it.
    Stack<Character> charStack = new Stack<>();
    for (int i = 0; i < input.length(); i++) {
      charStack.push(input.charAt(i));
    }

    // Reverse the String
    String reverse = "";
    while(!charStack.isEmpty()) {
      reverse = reverse + charStack.pop();
    }

    // Check if the String is the same backwards as forwards
    for (int i = 0 ; i < input.length() ; i++) {
      if (input.charAt(i) != reverse.charAt(i)) {
        // If the characters do not match, the input is not a palindrome
        return false;
      }
    }

    // If we have reached here, the String must be a palindrome.
    return true;
  }
}
