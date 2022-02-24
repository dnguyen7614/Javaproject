package com.revaturefizzbuzz;

public class FizzBuzz {
    public static void main(String [] args){
        fizzBuzz(50);
    }
    public static void fizzBuzz(int number) {
        int i = number;
        if ((i%3) == 0) {
            System.out.println("Fizz");
        }
        else if ((i%5) ==0) {
            System.out.println("Buzz");
        }
        else if (((i%3) == 0) && ((i%5) == 0)) {
            System.out.println("FizzBuzz");
        }
        else {
            System.out.println("Not a multiple of 3 and 5");
        }
    }

}
