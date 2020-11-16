package com.softserve.artem.task1;

import com.softserve.artem.task2.ComplexNumber;
import com.softserve.artem.task2.ComplexNumberUtil;
import com.softserve.artem.task3.QuadraticEquationUtil;
import com.softserve.artem.task4.NumbConvert;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Dispatcher {
    public static void main(String[] args) {
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("\nChoose the action you would like to do:\n\n" +
                        "1) - Perform simple operations on complex numbers;\n\n" +
                        "2) - Solve quadratic equations;\n\n" +
                        "3) - Convert number between decimal and quinary numeral systems;\n\n" +
                        "0) - Exit\n");

                int choice = scanner.nextInt();
                switch (choice) {
                    case (0):
                        System.exit(0);
                        break;
                    case (1):
                        ComplexNumber complexNumber = new ComplexNumber(0,0);
                        ComplexNumberUtil.go();
                        break;
                    case (2):
                        QuadraticEquationUtil.go();
                        break;
                    case (3):
                        NumbConvert.go();
                        break;
                    default:
                        throw new InputMismatchException();
                }
                System.out.println("\n\nPress any key to continue...");
                System.in.read();
            } catch (InputMismatchException ex) {
                System.out.print("Incorrect value\n");
            } catch (Exception e) {
            }
        }
    }
}
