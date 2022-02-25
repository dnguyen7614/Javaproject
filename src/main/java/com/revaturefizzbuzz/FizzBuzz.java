package com.revaturefizzbuzz;

public class FizzBuzz {
    public static void main(String [] args){
         int number = 30;
    }
    public static void fizzBuzz(int input) {

        if (input % 3 == 0 && input % 5 == 0) {
            System.out.println("FizzzBuzz");
        }
        if ((input % 3) ==0) {
            System.out.println("Fizzz");
        }
        else if ((input % 5) ==0) {
            System.out.println("Buzz");
        }
        else {
            System.out.println("Not a multiple of 3 and 5");
        }
    }


}
