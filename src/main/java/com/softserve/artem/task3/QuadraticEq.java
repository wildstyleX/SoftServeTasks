package com.softserve.artem.task3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class QuadraticEq {
    public static void go() throws InputMismatchException {
        double a, b, c, root1, root2;
        Scanner scan = new Scanner(System.in);
        System.out.println("\nEnter value of a: ");
        a = scan.nextDouble();
        if (a == 0){
            throw new InputMismatchException();
        }
        System.out.println("Enter value of b: ");
        b = scan.nextDouble();
        System.out.println("Enter value of c: ");
        c = scan.nextDouble();
        double determinant = b * b - 4 * a * c;

        if (determinant > 0) {
                root1 = (-b + Math.sqrt(determinant)) / (2 * a);
                root2 = (-b - Math.sqrt(determinant)) / (2 * a);
                System.out.format(" Roots are real: root1 = %.2f; Root2 = %.2f", root1, root2);
            } else if (determinant == 0) {
                root1 = root2 = -b / (2 * a);
                System.out.format("Roots are equal: Root1 = Root2 = %.2f", root1);
            } else {
                double real = -b / (2 *a);
                double img = Math.sqrt(-determinant) / (2 * a);
                System.out.format("Roots are complex: Root1 = %.2f + %.2fi; Root2 = %.2f+ %.2fi", real, img, real, img);
            }
    }
}