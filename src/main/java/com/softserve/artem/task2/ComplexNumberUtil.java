package com.softserve.artem.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ComplexNumberUtil {
    public static void go() throws InputMismatchException {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nEnter real part of the first equation : ");
        double real = scan.nextDouble();
        System.out.println("Enter imaginary part of the first equation: ");
        double img = scan.nextDouble();
        ComplexNumber first = new ComplexNumber(real, img);

        System.out.println("Enter real part of the second equation: ");
        real = scan.nextDouble();
        System.out.println("Enter imaginary part of the second equation: ");
        img = scan.nextDouble();
        ComplexNumber second = new ComplexNumber(real, img);

        System.out.println("Choose the operation (+, -, *, /): ");
        char operation = scan.next().charAt(0);
        ComplexNumber result;
        switch (operation) {

            case ('+'):
                result = ComplexNumberSolver.add(first, second);
                break;
            case ('-'):
                result = ComplexNumberSolver.substract(first, second);
                break;
            case ('*'):
                result = ComplexNumberSolver.multiply(first, second);
                break;
            case ('/'):
                result = ComplexNumberSolver.divide(first, second);
                break;
            default:
                throw new InputMismatchException();
        }

        System.out.println("Your answer is: " + result.toString());
    }
}
