package com.test;

import org.junit.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest {

    Calculator c=new Calculator();
    @Test
    void additionTest(){
        assertEquals(5,c.add(2,3));
    }

    @Test
    void subtractionTest(){
        assertEquals(-1,c.subtract(2,3));
    }

    @Test
    void multiplicationTest(){
        assertEquals(6,c.multiply(2,3));
    }

    @Test
    void devideTest(){
        assertEquals(0,c.divide(2,3));
    }
}
