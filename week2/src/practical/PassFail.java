package practical;
import java.util.Scanner;
public class PassFail {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks : ");
        int marks = sc.nextInt();
        PassFail ob = new PassFail();
        System.out.println(ob.isPass(marks));
    }

    public boolean isPass(int marks){
        if (marks >= 50){
            return true;
        }
        else return false;
    }
}
