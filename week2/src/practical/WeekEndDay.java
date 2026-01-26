package practical;
import java.util.Scanner;

public class WeekEndDay {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a day :");
        String day = sc.nextLine();
        WeekEndDay ob = new WeekEndDay();
        System.out.println(ob.isWeekend(day));
    }
    public boolean isWeekend(String day){
        if (day.equalsIgnoreCase("sunday") || day.equalsIgnoreCase("saturday") ) return true;
        else return false;
    }
}
