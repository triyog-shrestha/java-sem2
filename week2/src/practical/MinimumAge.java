package practical;
import java.util.Scanner;

public class MinimumAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minimum = 18;
        System.out.println("Please enter your age : ");
        int age = sc.nextInt();

        MinimumAge ob = new MinimumAge();
        String result = ob.isAtLeastAge(age,minimum);
        System.out.println(result);


    }

    public String isAtLeastAge(int age, int minimum){
        if (age >= minimum){
            return ("You are eligible");
        }
        else{
            return ("You are ineligible");
        }
    }
}
