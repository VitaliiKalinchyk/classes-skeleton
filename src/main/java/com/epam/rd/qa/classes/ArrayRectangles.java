package com.epam.rd.qa.classes;

public class ArrayRectangles {

    private final Rectangle[] rectangleArray;

    public ArrayRectangles(int size) {
        check(size);
        rectangleArray = new Rectangle[size];
    }

    public ArrayRectangles(Rectangle... rectangles) {
        if (rectangles == null) {
            throw new IllegalArgumentException();
        }
        check(rectangles.length);
        rectangleArray = rectangles;
    }

    public boolean addRectangle(Rectangle rectangle) {
        if (rectangleArray.length == size()) {
            return false;
        }
        for (int i = 0; i < rectangleArray.length; i++) {
            if (rectangleArray[i] == null) {
                rectangleArray[i] = rectangle;
                break;
            }
        }
        return true;
    }

    public int size() {
        int size = rectangleArray.length;
        for (Rectangle rectangle : rectangleArray) {
            if (rectangle == null) {
                size--;
            }
        }
        return size;
    }

    public int indexMaxArea() {
        int max = 0;
        for (int i = 0; i < rectangleArray.length; i++) {
            if (rectangleArray[i] != null) {
                if (rectangleArray[i].area() > rectangleArray[max].area()) {
                    max = i;
                }
            }
        }
        return max;
    }

    public int indexMinPerimeter() {
        int min = 0;
        for (int i = 0; i < rectangleArray.length; i++) {
            if (rectangleArray[i] != null) {
                if (rectangleArray[i].perimeter() < rectangleArray[min].perimeter()) {
                    min = i;
                }
            }
        }
        return min;
    }

    public int numberSquares() {
        int count = 0;
        for (Rectangle rectangle : rectangleArray) {
            if (rectangle != null) {
                if (rectangle.isSquare()) {
                    count++;
                }
            }
        }
        return count;
    }

    private void check(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException();
        }
    }
}