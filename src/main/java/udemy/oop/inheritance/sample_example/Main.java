package udemy.oop.inheritance.sample_example;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Martin", 25, 50, 2, 4, 2, 1, "black");
        dog.eat();
        dog.run();
        dog.walk();

        Fish fish = new Fish("Somon", 2, 3, 2, 2, 2);

        fish.swim(20);
    }
}
