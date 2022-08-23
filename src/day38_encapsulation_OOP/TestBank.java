package day38_encapsulation_OOP;

public class TestBank {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount(2132215515, 123123321);

        // account1.balance = 10000000;
        // account1.setBalance(10000000)
        // balance is private and there is no setter method, so I can't change the values
        System.out.println(account1.getAccountNumber());
        System.out.println(account1.getBalance());
    }
}
