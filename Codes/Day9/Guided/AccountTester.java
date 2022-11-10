package Day9.Guided;



class Account{
    double balance;

    public Account(double balance) {
        super();
        this.balance = balance;
    }

    public  synchronized void deposit(int amt) {
        this.balance=this.balance+amt;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Amount Deposited, Balance : " + balance);

    }

    public  synchronized void withdraw(int amt) {
        this.balance=this.balance-amt;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Amount Withdraw, Balance : " + balance);

    }

}
public class AccountTester {

    public static void main(String[] args) {
        Account obj = new Account(15000);

        Thread t1 = new Thread() {
            public void run() {
                obj.withdraw(5000);
                obj.deposit(1000);
            }
        };

        t1.start();

    }

}
