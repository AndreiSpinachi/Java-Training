package udemy.oop.inheritance.sample_example;

public class Fish extends Animal {

    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weigth, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weigth);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest() {

    }

    private void moveMuscles() {
        System.out.println("moveMuscles() is called");
    }

    private void moveBackFin() {

        System.out.println("moveBackFin() is called");
    }

    void swim(int speed) {
        moveMuscles();
        moveBackFin();
        System.out.println("Fish is swimming");
        super.move(speed);
    }
}
