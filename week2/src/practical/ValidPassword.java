package practical;
import java.util.Scanner;
public class ValidPassword {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int max = 12;
        int min = 6;
        System.out.println("Please enter your password : ");
        String pw = sc.nextLine();

        ValidPassword ob = new ValidPassword();
        boolean res = ob.isValidPasswordLength(pw,max,min);
        System.out.println(res);
    }

    public Boolean isValidPasswordLength(String pw, int max, int min){
        if (pw.length() >= min && pw.length() <= max){
            return true;
        }
        else{
            return false;
        }
    }
}
