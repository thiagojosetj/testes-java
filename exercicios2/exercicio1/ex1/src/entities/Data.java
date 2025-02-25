package entities;

public class Data {

    private int number;
    private String name;
    private double balance;
    private double initialDeposit;

    public double getInitialDeposit() {
        return initialDeposit;
    }
    public void setInitialDeposit(double initialDeposit) {
        this.initialDeposit = initialDeposit;
        balance += initialDeposit;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double value) {
        if (value > 0) {
            balance += value;
        } else {
            System.out.println("Deposit value must be greater than zero.");
        }
    }
    
    public void withdraw(double value){

        if(balance >= value + 5){
            balance -= value + 5.0;
        }else{
            System.out.println("Not enough balance.");
        }
    }

    @Override
    public String toString(){
        return "Account data: \nAccount = " + number + ", Holder = " + name + ", balance = $" + balance;
    }
}