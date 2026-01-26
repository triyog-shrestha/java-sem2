package activity1;

public class BankAcc {
    private int accNo;
    private String name;
    private double balance;

    public BankAcc(int accNo, String name, double balance){
        this.accNo = accNo;
        this.name =name;
        this.balance = balance;
    }

    public void deposit(double amount){
        this.balance = this.balance + amount;
        System.out.printf("You have successfully deposited Rs. %f\n",amount);
    }

    public void withdraw(double amount){
        if (this.balance < amount){
            System.out.println("Not sufficient balance, amount cannot be withdrawed\n");
        }
        else{
            this.balance = this.balance - amount;
            System.out.printf("You have successfully withdrawed Rs. %f\n",amount);
        }
    }

    public void display(){
        System.out.println("Account Number: " + this.accNo);
        System.out.println("Account Holder: " + this.name);
        System.out.println("Balance: Rs. " + this.balance);
    }
}
