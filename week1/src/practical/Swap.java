package practical;

public class Swap {
    public static void main(String[] args){
        int a = 5, b = 6;
        int k = a;
        System.out.printf("The Value a = %d and b = %d before swapping \n",a,b);
        a = b;
        b = k;
        System.out.printf("The Value a = %d and b = %d after swapping",a,b);
    }
}
