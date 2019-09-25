package assignment2;

import java.lang.Math.*;

class Circle implements Shape {

    float radius = 0f;

    public float calculateArea() {
        return (float)Math.PI * (radius * radius);
    }

    public void display() {
        System.out.println("Circle");
    }
}