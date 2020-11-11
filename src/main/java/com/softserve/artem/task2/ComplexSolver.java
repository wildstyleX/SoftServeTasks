package com.softserve.artem.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ComplexSolver {

    double real, img;

    public ComplexSolver(double real, double img) {
        this.real = real;
        this.img = img;
    }

    public static void go() throws InputMismatchException {

        Scanner scan = new Scanner(System.in);
        System.out.println("\nEnter real part of the first equation: ");
        double real1 = scan.nextDouble();
        System.out.println("Enter imaginary part of the first equation: ");
        double img1 = scan.nextDouble();
        ComplexSolver first = new ComplexSolver(real1, img1);

        System.out.println("Enter real part of the second equation: ");
        double real2 = scan.nextDouble();
        System.out.println("Enter imaginary part of the second equation: ");
        double img2 = scan.nextDouble();
        ComplexSolver second = new ComplexSolver(real2, img2);

        System.out.println("Choose the operation (+, -, *, /): ");
        char op = scan.next().charAt(0);
        ComplexSolver result;

        if (op == '+') {
            result = new ComplexSolver(first.real + second.real, first.img + second.img);
            } else if (op == '-') {
            result = new ComplexSolver(first.real - second.real, first.img - second.img);
            } else if (op == '*') {
            result = new ComplexSolver(first.real * second.real, first.img * second.img);
            } else if (op == '/') {
            result = new ComplexSolver(first.real / second.real, first.img / second.img);
            } else {
            throw new InputMismatchException();
            }

        if (result.real == 0 && result.img == 0) {
            System.out.println("Your answer is: " + 0);
            } else if (result.real == 0) {
            System.out.format("Your answer is: %.2fi", result.img );
            } else if (result.img == 0) {
            System.out.format("Your answer is: %.2f", result.real);
            } else {
            System.out.format("Your answer is: %.2f " + ((result.img >= 0) ? " + " : " - ") + "%.2fi", result.real,Math.abs(result.img));
            }
    }
}