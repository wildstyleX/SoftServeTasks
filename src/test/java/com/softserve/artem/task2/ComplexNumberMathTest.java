package com.softserve.artem.task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplexNumberMathTest {
    @Test
    void addTest() {
        //given
        ComplexNumber first = new ComplexNumber(6, 12);
        ComplexNumber second = new ComplexNumber(4, 2);
        double expectedReal = 10;
        double expectedImag = 14;
        //when
        ComplexNumber actual = ComplexNumberSolver.add(first, second);
        //then
        assertEquals(expectedReal, actual.getReal());
        assertEquals(expectedImag, actual.getImg());
    }

    @Test
    void substractTest() {
        //given
        ComplexNumber first = new ComplexNumber(6, 12);
        ComplexNumber second = new ComplexNumber(4, 2);
        double expectedReal = 2;
        double expectedImag = 10;
        //when
        ComplexNumber actual = ComplexNumberSolver.substract(first, second);
        //then
        assertEquals(expectedReal, actual.getReal());
        assertEquals(expectedImag, actual.getImg());
    }

    @Test
    void multiplyTest() {
        //given
        ComplexNumber first = new ComplexNumber(6, 12);
        ComplexNumber second = new ComplexNumber(4, 2);
        double expectedReal = 0;
        double expectedImag = 60;
        //when
        ComplexNumber actual = ComplexNumberSolver.multiply(first, second);
        //then
        assertEquals(expectedReal, actual.getReal());
        assertEquals(expectedImag, actual.getImg());
    }

    @Test
    void divideTest() {
        //given
        ComplexNumber first = new ComplexNumber(6, 12);
        ComplexNumber second = new ComplexNumber(4, 2);
        double expectedReal = 0;
        double expectedImag = 1;
        //when
        ComplexNumber actual = ComplexNumberSolver.divide(first, second);
        //then
        assertEquals(expectedReal, actual.getReal());
        assertEquals(expectedImag, actual.getImg());
    }
}

