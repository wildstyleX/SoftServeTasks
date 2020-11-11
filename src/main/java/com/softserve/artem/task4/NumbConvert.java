package com.softserve.artem.task4;

import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NumbConvert {

    public static void go() throws InputMismatchException {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nTo convert value into decimal - enter 10;\nTo convert value into quinary - enter 5:");
        int choice = scan.nextInt();
        System.out.println("Enter a number:");

        if (choice == 10) {
            BigInteger number = scan.nextBigInteger(5);
            System.out.println("Your answer is: " + number.toString(10));
            } else if (choice == 5) {
            BigInteger number = scan.nextBigInteger(10);
            System.out.println("Your answer is: " + number.toString(5));
            } else {
            throw new InputMismatchException();
            }
    }
}