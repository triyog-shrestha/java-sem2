package practical;
import java.util.Scanner;
public class CalculateDiscount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Whats your membership?(Gold,Silver,Bronze) : ");
        String memb = sc.next();
        CalculateDiscount ob = new CalculateDiscount();
        System.out.printf("Your discount is %s",ob.calculateDiscount(memb));

    }
    public String calculateDiscount(String memb){
        if (memb.equalsIgnoreCase("gold")) return "20%";
        else if (memb.equalsIgnoreCase("silver")) return "10%";
        else if (memb.equalsIgnoreCase("bronze")) return "5%";
        else return "0%";
    }
}
