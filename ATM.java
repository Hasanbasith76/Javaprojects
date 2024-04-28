import java.util.Scanner;
public class ATM extends user{
    public static void main(String[] args) throws Exception{
    System.out.println("ATM Machine");
    System.out.println("Enter a opertion to continue");
    System.out.println("1.Withdraw");
    System.out.println("2.Deposit");
    System.out.println("3.Check Balance");
    System.out.println("4.Exit");
    user user1 = new user();
    System.out.println("Select an option to proceed:");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
        switch (a) {
            case 1:
                user1.withdraw();
                break;
            case 2:
                user1.deposit();
                break;
            case 3:
                user1.Checkbalance();
                break;
            case 4:
                user1.Exit();
                break;
            default:
                System.out.println("Invalid option");
                break;
    }
    }
}
class user {
    // initial user has a minimum balance of $100000 during the opening of the account
    private long balance = 100000;
    private long amount;
    Scanner sc = new Scanner(System.in);

    public long withdraw() {
        System.out.println("Enter the amount to be withdrawn:");
        amount = sc.nextLong();
        if (balance >= this.amount) {
            balance -= this.amount;
            System.out.println("You have withdrawn $" + this.amount + " and your balance is $" + balance);
        } else {
            System.out.println("Insufficient balance.You have only $" + balance);
        }
        return 0;
    }

    public long deposit() {
        System.out.println("Enter the amount to be deposited:");
        amount = sc.nextLong();
        balance = amount + balance;
        System.out.println("Your balance is $" + balance);
        return 0;
    }

    public long Checkbalance(){
        System.out.println("$"+balance);
        return 0;
    }

    public int Exit(){
        return 0;
    }
}
