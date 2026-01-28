package classroom;
import java.util.Scanner;
//calculator
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator ob = new Calculator();
        char end;
        do {
            System.out.println("Enter the first number = ");
            double a = sc.nextDouble();
            System.out.println("Enter the second number = ");
            double b = sc.nextDouble();
            System.out.println("Enter your operation : \n1 for addition\n2 for subtraction\n3 for multiplication\n4 for division\n5 for exponential(a^b)");
            int ch = sc.nextInt();
            if (ch > 5 || ch < 1) {
                System.out.println("Error, try again");
            } else if (ch == 4 && b == 0) {
                System.out.println("Cannot Divide by zero.");
            } else if (ch == 5) {
                System.out.printf("%.2f to the power of %.2f = %.2f", a, b, ob.calculator(a, b, ch));
            } else {
                System.out.printf("%.2f %c %.2f = %.2f", a, ob.getOperator(ch), b, ob.calculator(a, b, ch));
            }
            System.out.println("\nDo you want to continue(y,n) = ");
            end = sc.next().charAt(0);
        }while (end == 'y' || end =='Y');
    }

    public double calculator(double a, double b, int ch){
        if (ch==1) return a+b;
        else if (ch == 2) return a-b;
        else if (ch==3) return a*b;
        else if (ch==4) return a/b;
        else return Math.pow(a,b);
    }

    public char getOperator(int ch){
        if (ch == 1) return '+';
        else if (ch==2) return'-';
        else if (ch==3) return '*';
        else return '/';
    }

}
