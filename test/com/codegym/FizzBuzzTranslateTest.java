package com.codegym;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {

    @Test
    void FizzBuzzTranslateTest1() {
        int number = 6;
        String expected= "Fizz";
        String result= FizzBuzzTranslate.FizzBuzz(number);
        assertEquals(expected,result);
    }
    @Test
    void FizzBuzzTranslateTest2() {
        int number = 10;
        String expected= "Buzz";
        String result= FizzBuzzTranslate.FizzBuzz(number);
        assertEquals(expected,result);
    }
    @Test
    void FizzBuzzTranslateTest3() {
        int number = 15;
        String expected= "Fizz Buzz";
        String result= FizzBuzzTranslate.FizzBuzz(number);
        assertEquals(expected,result);
    }
    @Test
    void FizzBuzzTranslateTest4() {
        int number = 4;
        String expected= "4";
        String result= FizzBuzzTranslate.FizzBuzz(number);
        assertEquals(expected,result);
    }
}