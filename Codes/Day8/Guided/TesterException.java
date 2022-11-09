package Day8.Guided;

import java.util.ArrayList;

class Account{

    private int accountNumber;
    private double balance;

    public Account() {
    }

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}

class AccountList{

    public ArrayList<Account> accountObjects = new ArrayList<>();

    public AccountList() {
        Account nikhil = new Account(12321, 930.00);
        Account aniket = new Account(12322, 1100.00);
        Account yogesh = new Account(12323, 1249.00);
        Account bhushan = new Account(12324, 1000.00);
        Account nilesh = new Account(12325, 5409.00);
        this.accountObjects.add(nikhil);
        this.accountObjects.add(aniket);
        this.accountObjects.add(yogesh);
        this.accountObjects.add(bhushan);
        this.accountObjects.add(nilesh);
    }

    public ArrayList<Account> getAccountObjects() {
        return accountObjects;
    }

}

class InsufficientFundsException extends Exception  {

    public InsufficientFundsException(String message){
        super(message);
    }

}

class NegativeAmountException extends Exception  {

    public NegativeAmountException(String message){
        super(message);
    }

}

class InvalidAccountException extends Exception  {

    public InvalidAccountException(String message){
        super(message);
    }
}


class AccountManager{

    AccountList obj = new AccountList();

    public boolean checkAccount(int accountNumber){
        for(Account person: this.obj.getAccountObjects()){
            if(accountNumber == person.getAccountNumber())
                return true;
        }

        return false;
    }

    public void deposit(int accountNumber, double amount) throws InvalidAccountException, NegativeAmountException{
        if(checkAccount(accountNumber) == false){
            throw new InvalidAccountException("The account number doesn't exist");
        }
        else if (amount < 0){
            throw new NegativeAmountException("Negative value of amount can't be deposited");
        }

        for(Account person: this.obj.getAccountObjects()){

            if(accountNumber == person.getAccountNumber()){
                double currBalance = person.getBalance();
                person.setBalance(currBalance + amount);
            }

        }

    }

    public void withdraw(int accountNumber, double amount) throws InvalidAccountException, InsufficientFundsException, NegativeAmountException{
        if(checkAccount(accountNumber) == false){
            throw new InvalidAccountException("The account number doesn't exist");
        }

        else if (amount < 0){
            throw new NegativeAmountException("Negative value of amount can't be withdrawn");
        }
        for(Account person: this.obj.getAccountObjects()){

            if(accountNumber == person.getAccountNumber()){
                if(person.getBalance() < amount){
                    throw new InsufficientFundsException("The amount to be withdrawn is insufficient");
                }
                else{
                    double currBalance = person.getBalance();
                    person.setBalance(currBalance - amount);
                }
            }
        }
    }

    public double getBalance(int accountNumber) throws InvalidAccountException{
        if(checkAccount(accountNumber) == false){
            throw new InvalidAccountException("The account number doesn't exist");
        }

        for(Account person: this.obj.getAccountObjects()){
            if(accountNumber == person.getAccountNumber()){
                return person.getBalance();
            }
        }
        return 0.0;
    }
}


public class TesterException {

    public static void main(String[] args) throws  InsufficientFundsException, InvalidAccountException, NegativeAmountException{
        AccountManager manager = new AccountManager();
        System.out.println(manager.checkAccount(12311));
        System.out.println(manager.getBalance(12321));
        manager.deposit(12321, 1000);
        System.out.println(manager.getBalance(12321));
        manager.withdraw(12321, -50);
    }

}
