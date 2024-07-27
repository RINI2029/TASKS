import java.util.Scanner;

public class task_two_account
{
    private double balance;

    public task_two_account()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter initial balance: ");
        balance = scanner.nextDouble();
    }

    public task_two_account(double balance)
    {
        this.balance = balance;
    }

    public void deposit(double amount)
    {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
            System.out.println("Current Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount)
    {
        if (amount > 0 && amount <= balance)
        {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Current Balance: " + balance);
        } else
        {
            System.out.println("Invalid withdrawal amount");
        }
    }

    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

class main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        task_two_account account1 = new task_two_account();

        System.out.println("Enter amount to deposit: ");
        double depositAmount = scanner.nextDouble();
        account1.deposit(depositAmount);

        System.out.println("Enter amount to withdraw: ");
        double withdrawAmount = scanner.nextDouble();
        account1.withdraw(withdrawAmount);

        account1.displayBalance();
    }
}


