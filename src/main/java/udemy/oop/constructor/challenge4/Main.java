package udemy.oop.constructor.challenge4;

public class Main {

    public static void main(String[] args) {

        Carpet carpet = new Carpet(330);
        Floor floor = new Floor(3.00, 4.00);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
    }
}
