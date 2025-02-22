// Maximum of Two Numbers
import java.util.Scanner;

public class Prog6{
    public static void main(String[] args) {
        Scanner bm=new Scanner(System.in);
        
        System.out.println("Enter first number: ");
        int num1=bm.nextInt();
        System.out.println("Enter second number: ");
        int num2=bm.nextInt();
        
        int max=Math.max(num1, num2);
        System.out.println("Maximum number is: " + max);
        
        bm.close();
    }
}