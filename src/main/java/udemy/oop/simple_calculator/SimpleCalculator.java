package udemy.oop.simple_calculator;

public class SimpleCalculator implements Operations {
    private double firstNumber;
    private double secondNuber;


    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }


    public void setSecondNuber(double secondNuber) {
        this.secondNuber = secondNuber;
    }

    @Override
    public double getAdditionResult() {
        return firstNumber + secondNuber;
    }

    @Override
    public double getSubtractionResult() {
        return firstNumber - secondNuber;
    }

    @Override
    public double getMultiplicationResult() {
        return firstNumber * secondNuber;
    }

    @Override
    public double getDivisionResult() {
        if (secondNuber == 0) return 0;
        return firstNumber / secondNuber;
    }
}
