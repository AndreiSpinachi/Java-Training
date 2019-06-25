package udemy.oop.inheritance.sample_example;

public class Dog extends Animal {

    int eyes;
    int legs;
    int ears;
    int tail;
    String colour;

    public Dog(String name, int size, int weigth, int eyes, int legs, int ears, int tail, String colour) {
        super(name, 1, 1, size, weigth);

        this.colour = colour;
        this.ears = ears;
        this.eyes = eyes;
        this.tail = tail;
        this.legs = legs;
    }

    public void chew() {
        System.out.println("Dog chews the food");
    }

    public void walk() {
        System.out.println("walk() is called / Dog is walking pretty fast");
        super.move(10);
    }

    public void run() {
        System.out.println("run() is called / Dog is running pretty fast");
        move(20);
    }

    @Override
    public void eat() {
        chew();
        super.eat();
    }

    @Override
    public void move(int speed) {
        System.out.println("The dog is moving with speed: " + speed);
    }
}
