package udemy.oop.inheritance.challenge1;

public class CrossOver extends Car {
    private int roadServiceMonths;

    public CrossOver(int roadServiceMonths) {
        super("CR-V", "4WD", 4, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate) {
        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity == 0) {
            stop();
            changeGear(1);
        } else if (newVelocity > 0 && newVelocity <= 10) {
            changeGear(1);
        } else if (newVelocity > 10 && newVelocity <= 30) {
            changeGear(2);
        } else if (newVelocity > 30 && newVelocity <= 50) {
            changeGear(3);
        } else if (newVelocity > 50 && newVelocity <= 80) {
            changeGear(4);
        } else if (newVelocity > 80 && newVelocity <= 120) {
            changeGear(5);
        } else if (newVelocity > 120 && newVelocity <= 200) {
            changeGear(6);
        }
        if (newVelocity > 0) {
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }
}