//import java.util.Scanner;

/**
 * example
 */
/*
 * public class example {
 * 
 * private double balance;
 * 
 * public example(double balance) {
 * this.balance = balance;
 * }
 * 
 * public double getBalance() {
 * return balance;
 * }
 * 
 * public void deposit(double amount) {
 * balance += amount;
 * }
 * 
 * public void withdraw(double amount) {
 * if (balance > amount) {
 * System.out.println("insufficient funds");
 * } else {
 * balance -= amount;
 * }
 * }
 * 
 * public static void main(String[] args) {
 * example acc = new example(15000);
 * Scanner sc = new Scanner(System.in);
 * 
 * System.out.println("welcome to the bank");
 * System.out.println("Enter amount to deposit");
 * double depositAmount = sc.nextDouble();
 * acc.deposit(depositAmount);
 * System.out.println("clear balance is :" + acc.getBalance());
 * 
 * System.out.println("enter an amount to withdraw: ");
 * double withdrawAmount = sc.nextDouble();
 * acc.withdraw(withdrawAmount);
 * System.out.println("clear balance is :" + acc.getBalance());
 * System.out.println("thank you visit again");
 * }
 * }
 */

class example {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1;
        System.out.println(n1 + "," + n2 + ",");
        for (int i = 3; i <= 10; i++) {
            int nextValue = n1 + n2;
            System.out.println(nextValue + ",");
            n1 = n2;
            n2 = nextValue;
        }
        System.out.println("\b");
    }
}
