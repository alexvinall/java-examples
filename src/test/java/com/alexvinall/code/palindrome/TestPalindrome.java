package com.alexvinall.code.palindrome;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class TestPalindrome {

  private final Palindrome palindrome = new Palindrome();

  @Test
  public void testPalindrome() {
    assertFalse(palindrome.isPalindrome("palindrome"));
  }

  @Test
  public void testEmptyString() {
    assertTrue(palindrome.isPalindrome(""));
  }

  @Test
  public void testNull() {
    assertTrue(palindrome.isPalindrome(null));
  }

  @Test
  public void testRacecar() {
    assertTrue(palindrome.isPalindrome("racecar"));
  }


  @Test
  public void testNoon() {
    assertTrue(palindrome.isPalindrome("noon"));
  }
}
