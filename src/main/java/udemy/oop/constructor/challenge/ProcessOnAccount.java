package udemy.oop.constructor.challenge;

public class ProcessOnAccount {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        System.out.println(account.getAccountNumber());
        System.out.println(account.getCustomerName());
        account.depositFunds(5000);
        account.withdrawFunds(3000);
    }
}
