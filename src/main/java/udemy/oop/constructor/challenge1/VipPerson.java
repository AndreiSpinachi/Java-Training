package udemy.oop.constructor.challenge1;

public class VipPerson {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipPerson(String name, double creditLimit) {
        this(name, creditLimit, "unkown@emailAddress.com");
    }

    public VipPerson() {
        this("Andrei", 25000.20, "andreeaspinaci@gmail.com");
    }

    public VipPerson(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}