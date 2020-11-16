package com.softserve.artem.task3;

import com.softserve.artem.task2.ComplexNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuadraticEquationMathTest {

    @Test
    void resolveQuadraticEquationDeterminantBiggerThenZeroTest() {
        //given
        QuadraticEq equation = new QuadraticEq(1, 4, 2);
        double expectedRoot1 = -0.5857864376269049;
        double expectedRoot2 = -3.414213562373095;
        //when
        QuadraticEquationMath.resolveQuadraticEquation(equation);
        double actualRoot1 = equation.getRoot1();
        double actualRoot2 = equation.getRoot2();
        //then
        assertEquals(expectedRoot1, actualRoot1);
        assertEquals(expectedRoot2, actualRoot2);
    }

    @Test
    void solveQuadraticEquationDeterminantEqualsZero() {
        //given
        QuadraticEq equation = new QuadraticEq(2,4,2);
        double expectedRoot = -1;
        //when
        QuadraticEquationMath.resolveQuadraticEquation(equation);
        double actualRoot = equation.getRoot1();
        //then
        assertEquals(expectedRoot, actualRoot);
    }

    @Test
    void solveQuadraticEquationDeterminantLessThanZero() {
        //given
        QuadraticEq equation = new QuadraticEq(2,2,2);
        double expectedReal = -0.5;
        double expectedImg = 0.8660254037844386;
        //when
        QuadraticEquationMath.resolveQuadraticEquation(equation);
        ComplexNumber actual = equation.getResult();
        double actualReal = actual.getReal();
        double actualImg = actual.getImg();
        //then
        assertEquals(expectedReal, actualReal);
        assertEquals(expectedImg, actualImg);
    }
}