package udemy.oop.constructor.challenge;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private int phoneNumber;
    private String email;
    private String customerName;

    public BankAccount() {
        this("DefaultAccountNumber ", 0.0, 75 - 74 - 51, " default@email.com ", "DfaultName");
    }

    public BankAccount(String accountNumber, double balance, int phoneNumber, String email, String customerName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.customerName = customerName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void depositFunds(double depositAmount) {
        this.balance += depositAmount;
    }

    public void withdrawFunds(double withdrawalAmount) {
        if (balance - withdrawalAmount <= 0) {
            System.out.println("Only " + balance + "available.Withdrawal not processed");
        } else {
            balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance = " + this.balance);
        }
    }
}