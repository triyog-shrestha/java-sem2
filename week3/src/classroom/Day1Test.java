package classroom;
import java.util.Scanner;


public class Day1Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Day1 ob = new Day1();
        int option = 0;
        do {
            option = ob.menu();
            if (option == 1) {
                ob.played();
            }
            else if (option == 3){
                ob.listSongs();
            }


        }while (option != 4 );
        sc.close();
    }
}
