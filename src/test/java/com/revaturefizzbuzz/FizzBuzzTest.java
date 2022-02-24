package com.revaturefizzbuzz;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
public class FizzBuzzTest {
    //input: 25;
    //output: FizzBuzz;

}
@Test
public void testfizzBuzz() {
    FizzBuzzTest test1 = new FizzBuzzTest();
    double actual = test1.fizzBuzz( 15);
    String expected = "FizzBuzz";
    assertEquals(expected, actual);
}

@Test
public void FizzBuzzTest{
        FizzBuzz fizz = new FizzBuzz();
        fizz.FizzBuzz(25);
        double actual = fizz.FizzBuzz(25);
        double expect = "FizzBuzz";
        assertEquals("Buzz", fizz.fizzBuzz(5));
        }
@Test
public void FizzBuzzTest {
        FizzBuzz fizz = new FizzBuzz();
        fizz.FizzBuzz(25);
        double actual = fizz.FizzBuzz(25);
        double expect = "FizzBuzz";
        assertEquals("fizzBuzz", fizz.fizzBuzz(15));
        }



