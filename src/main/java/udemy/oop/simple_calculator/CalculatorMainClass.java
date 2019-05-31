package udemy.oop.simple_calculator;

public class CalculatorMainClass {

    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(25);
        calculator.setSecondNuber(25);
        double addition = calculator.getAdditionResult();
        double multiplication = calculator.getMultiplicationResult();
        double subtraction = calculator.getSubtractionResult();
        double division = calculator.getDivisionResult();

        System.out.println("The addition of the first and second number is: " + addition);
        System.out.println("The multiplication of the first and second number is: " + multiplication);
        System.out.println("The subtraction of the first and second number is: " + subtraction);
        System.out.println("The division of the first and second number is: " + division);
    }
}
