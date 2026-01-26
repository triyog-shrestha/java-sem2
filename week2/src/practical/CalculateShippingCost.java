package practical;
import java.util.Scanner;
public class CalculateShippingCost {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the weight = ");
        double weight = sc.nextDouble();
        CalculateShippingCost ob = new CalculateShippingCost();
        System.out.println(ob.calculateShippingCost(weight));

    }
    public String calculateShippingCost(double w){
        if (w >= 0 && w <5) return "$5";
        else if (w>=5 && w<10) return "$10";
        else if (w>=10 && w<20) return "$20";
        else return "$30";
    }
}
