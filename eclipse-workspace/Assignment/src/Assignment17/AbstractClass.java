package Assignment17;

abstract class Shape {
    abstract void area(); // abstract method

    void displayMessage() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void area() {
        System.out.println("Area of circle: " + (Math.PI * radius * radius));
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        c.displayMessage();
        c.area();
    }
}
