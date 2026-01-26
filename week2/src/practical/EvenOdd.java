package practical;
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        EvenOdd ob = new EvenOdd();
        System.out.println(ob.isEven(num));

    }

    public boolean isEven(int num){
        if (num % 2 == 0) return true;
        else return false;
    }

}
