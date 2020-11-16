package com.softserve.artem.task2;

public class ComplexNumber {

    private double real;
    private double img;

    public ComplexNumber(double real, double img) {
        this.real = real;
        this.img = img;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImg() {
        return img;
    }

    public void setImg(double img) {
        this.img = img;
    }


    public String toString() {
        if (real == 0 && img == 0) {
            return 0 + "";
        }
        else if (img == 0) {
            return real + "";
        }
        else if (real == 0) {
            return img + "i";
        }
        else if (img < 0) {
            return real + " - " + (-img) + "i";
        } else {
            return real + " + " + img + "i";
        }
    }
}