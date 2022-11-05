package com.epam.rd.qa.classes;

import java.util.Objects;

public class Rectangle {

    private double sideA;

    private double sideB;

    public Rectangle(double sideA, double sideB) {
        checkSide(sideA);
        checkSide(sideB);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public Rectangle(double side) {
        checkSide(side);
        this.sideA = this.sideB = side;
    }

    public Rectangle() {
        this.sideA = 4;
        this.sideB = 3;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double area() {
        return sideA * sideB;
    }

    public double perimeter() {
        return 2 * (sideA + sideB);
    }

    public boolean isSquare() {
        return sideA == sideB;
    }

    public void replaceSides() {
        double temp = sideA;
        sideA = sideB;
        sideB = temp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.sideA, sideA) == 0 && Double.compare(rectangle.sideB, sideB) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sideA, sideB);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                '}';
    }

    private void checkSide(double side) {
        if (side <= 0 ) {
            throw new IllegalArgumentException();
        }
    }
}