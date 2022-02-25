package com.revaturefizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;


public class FizzBuzzTest {
    @Test
    public void testMultipleOfThreeAndFivePrintsFizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzz.eval(15));
    }

    @Test
    public void testMultipleOfThreeOnlyPrintsFizz() {
        assertEquals("Fizz", FizzBuzz.eval(20));
    }

    @Test
    public void testMultipleOfThreeOnlyPrintsBuzz() {
        assertEquals("Buzz", FizzBuzz.eval(50));
    }

    @Test
    public void testMultipleOfThreeOnlyPrintsBuzz() {
        assertEquals("19", FizzBuzz.eval(19));
    }
}




