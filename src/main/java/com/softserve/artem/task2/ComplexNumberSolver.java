package com.softserve.artem.task2;

public class ComplexNumberSolver {

        private ComplexNumberSolver() {
        }

        public static ComplexNumber add(ComplexNumber first, ComplexNumber second) {
            double real = first.getReal() + second.getReal();
            double img = first.getImg() + second.getImg();
            return new ComplexNumber(real, img);
        }

        public static ComplexNumber substract(ComplexNumber first, ComplexNumber second) {
            double real = first.getReal() - second.getReal();
            double img = first.getImg() - second.getImg();
            return new ComplexNumber(real, img);
        }

        public static ComplexNumber multiply(ComplexNumber first, ComplexNumber second) {
            double real = first.getReal() * second.getReal() - first.getImg() * second.getImg();
            double img = first.getReal() * second.getImg() + first.getImg() * second.getReal();
            return new ComplexNumber(real, img);
        }

        public static ComplexNumber divide(ComplexNumber first, ComplexNumber second) {
            double denominator = Math.pow(second.getReal() + second.getImg(), 2);
            double real = (first.getReal() * second.getReal() - first.getImg() * second.getImg()) / denominator;
            double img = (-first.getReal() * second.getImg() + first.getImg() * second.getReal()) / denominator;
            return new ComplexNumber(real, img);
        }
    }

