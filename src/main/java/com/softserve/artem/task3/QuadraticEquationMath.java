package com.softserve.artem.task3;

import com.softserve.artem.task2.ComplexNumber;

public class QuadraticEquationMath {

    private QuadraticEquationMath() {
    }

    public static void resolveQuadraticEquation(QuadraticEq equation) {
        double determinant = equation.getB() * equation.getB() - 4 * equation.getA() * equation.getC();
        equation.setDeterminant(determinant);
        if (determinant > 0) {
            double root1 = (-equation.getB() + Math.sqrt(determinant)) / (2 * equation.getA());
            equation.setRoot1(root1);
            double root2 = (-equation.getB() - Math.sqrt(determinant)) / (2 * equation.getA());
            equation.setRoot2(root2);

        }
        else if (determinant == 0) {
            double root = -equation.getB() / (2 * equation.getA());
            equation.setRoot1(root);

        }
        else {
            double real = -equation.getB() / (2 * equation.getA());
            double img = Math.sqrt(-determinant) / (2 * equation.getA());
            equation.setResult(new ComplexNumber(real,img));
        }
    }
}
