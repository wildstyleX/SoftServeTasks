package com.softserve.artem.task1;

import com.softserve.artem.task2.ComplexSolver;
import com.softserve.artem.task3.QuadraticEq;
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
                        "4) - Exit\n");

                int choice = scanner.nextInt();
                if (choice == 1) {
                    ComplexSolver.go();
                    } else if (choice == 2) {
                    QuadraticEq.go();
                    } else if (choice == 3) {
                    NumbConvert.go();
                    } else if (choice == 4) {
                    System.exit(0);
                    } else {
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
