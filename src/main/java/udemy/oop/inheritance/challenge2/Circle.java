package udemy.oop.inheritance.challenge2;

public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
        if (radius < 0) {
            this.radius = 0;
        }
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        double PI = Math.PI;
        return radius * radius * PI;
    }
}
