package practical;
import java.util.Scanner;
public class MaxNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first number : ");
        float a = sc.nextFloat();

        System.out.println("Please enter the second number : ");
        float b = sc.nextFloat();

        MaxNum ob = new MaxNum();
        float res = ob.findMax(a,b);
        System.out.println(res);

    }

    public float findMax(float a,float b){
        if (a>b){
            return a;
        }
        else if (b>a){
            return b;
        }
        else{
            return 0;
        }
    }
}
