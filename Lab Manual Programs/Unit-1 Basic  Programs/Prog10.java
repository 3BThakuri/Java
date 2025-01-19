// Sum of Digits
import java.util.Scanner;

public class Prog10 {
    public static void main(String[] args) {
        Scanner bamm= new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int number=bamm.nextInt();
        int sum=0;
        
        while(number>0) {
            sum +=number%10;
            number/=10;
        }
        System.out.println("Sum of digits: " + sum);
        bamm.close();
    }
}
