package com.alexvinall.code.fizzbuzz;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TestFizzBuzz {

    // Test subject
    FizzBuzz fizzBuzz;

    /**
     * Common setup before tests.
     */
    @Before
    public void before() {
      fizzBuzz = new FizzBuzz();
    }


    /**
     * Tests with a ceiling of 100
     */
    @Test
    public void testFizzBuzz100() {
      // Given
      int ceiling = 100;

      // When
      List<String> output = fizzBuzz.run(ceiling);

      // Then
      assertThat(output.size(), is(ceiling));
      // TODO implement proper output tests
    }
}
