package udemy.oop.inheritance.challenge2;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(2.5);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());

        Cylinder cylinder = new Cylinder(2.5, 3.9);
        System.out.println("The volume of the cylinder is: " + cylinder.getVolume());
    }
}
