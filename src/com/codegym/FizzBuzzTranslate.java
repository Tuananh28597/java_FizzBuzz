package com.codegym;

public class FizzBuzzTranslate {

    public static String FizzBuzz(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "Fizz Buzz";
        } else if (number % 3 == 0 || number == 3) {
            return "Fizz";
        } else if (number % 5 == 0 || number == 5) {
            return "Buzz";
        } else {
            return "" + number;
        }

    }
}
