package com.softserve.artem.task3;

import com.softserve.artem.task2.ComplexNumber;

import java.text.DecimalFormat;

public class QuadraticEq {
   private double a;
   private double b; // коэффициент квадратного уравнения ax^2+bx+c
   private double c;
   private double root1;
   private double root2;
   private double determinant;
   private ComplexNumber result;

    public QuadraticEq(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public QuadraticEq(double a, double b, double c, double root1, double root2, double determinant) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.root1 = root1;
        this.root2 = root2;
        this.determinant = determinant;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getRoot1() {
        return root1;
    }

    public void setRoot1(double root1) {
        this.root1 = root1;
    }

    public double getRoot2() {
       return root2;
    }

    public void setRoot2(double root2) {
        this.root2 = root2;
    }

    public double getDeterminant() {
        return determinant;
    }

    public void setDeterminant(double determinant) {
        this.determinant = determinant;
    }

    public ComplexNumber getResult() {
        return result;
    }

    public void setResult(ComplexNumber result) {
        this.result = result;
    }

    public String toString() {
        if (determinant > 0) {
            String fRoot1 = new DecimalFormat("#.##").format(root1);
            String fRoot2 = new DecimalFormat("#.##").format(root2);
            return "Root1 = " + fRoot1 + ". Root2 = " + fRoot2 + ".";
        }
        else if (determinant == 0) {
            String fRoot = new DecimalFormat("#.##").format(root1);
            return "Roots are equal. Root1 = Root2 = " + fRoot;
        }
        else {
            String fReal = new DecimalFormat("#.##").format(result.getReal());
            String fImag = new DecimalFormat("#.##").format(result.getImg());
            return "Roots are complex. Root1 = " + fReal + " + " + fImag + "i. Root2 = " + fReal + " - " + fImag + "i.";
        }
    }
}