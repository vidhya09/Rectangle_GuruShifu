package com.thoughtworks.rectangle;

public class Rectangle {
    private final int length;
    private final int breadth;

    private Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public static Rectangle createRectangle(int length, int breadth) {
        return new Rectangle(length, breadth);
    }

    public int calculateArea() {
        return length * breadth;
    }

}
