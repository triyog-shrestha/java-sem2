package activity1;

public class Home {
    public static void main(String[] args){
        BankAcc acc = new BankAcc(1,"Triyog Shrestha",4000);
        acc.withdraw(300);
        acc.deposit(200);

        acc.display();

    }
}
