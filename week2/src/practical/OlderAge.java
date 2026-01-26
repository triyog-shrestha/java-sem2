package practical;
import java.util.Scanner;
public class OlderAge {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first age : ");
        int a1 = sc.nextInt();
        System.out.println("Enter the second age : ");
        int a2 = sc.nextInt();
        OlderAge ob = new OlderAge();
        System.out.println(ob.olderAge(a1,a2));
    }
    public int olderAge(int a,int b){
        if (a>b) return a;
        else if (b>a) return b;
        else return 0;
    }
}
