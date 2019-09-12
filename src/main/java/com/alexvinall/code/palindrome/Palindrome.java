package com.alexvinall.code.palindrome;

import org.apache.commons.lang3.StringUtils;

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
    if (StringUtils.isBlank(input)) {
      return true;
    }

    // We'll create a stack of characters half as long as the overall string
    int stackSize = input.length() % 2 == 0 ? input.length() / 2 : (input.length()+1) / 2;

    Stack<Character> charStack = new Stack<>();

    for (int i = 0 ; i < input.length() ; i++) {
      if (i < stackSize) {
        charStack.push(input.charAt(i));
      }


      // TODO fix this part
      if (i >= stackSize - 1) {
        if (!Character.valueOf(input.charAt(i)).equals(charStack.pop())) {
          return false;
        }
      }
    }

    return true;
  }
}
