package com.softserve.artem.task3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class QuadraticEquationUtil {

        public static void go() throws InputMismatchException {

            Scanner scan = new Scanner(System.in);
            System.out.println("\nEnter value of a (ax^2+bx+c): ");
            double a = scan.nextDouble();
            if (a == 0){
                throw new InputMismatchException();
            }
            System.out.println("Enter value of b (ax^2+bx+c): ");
            double b = scan.nextDouble();
            System.out.println("Enter value of c (ax^2+bx+c): ");
            double c = scan.nextDouble();
            QuadraticEq equation = new QuadraticEq(a,b,c);
            QuadraticEquationMath.resolveQuadraticEquation(equation);
            System.out.println(equation.toString());
            }
        }

