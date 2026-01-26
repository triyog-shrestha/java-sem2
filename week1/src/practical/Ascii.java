package practical;
import java.util.Scanner;
public class Ascii {
    public static void main(String[] args){
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character whose ASCII value you want = ");
        ch = sc.next().charAt(0);
        int asc = ch;
        System.out.printf("The ASCII value of %c is %d",ch,asc);
    }
}
