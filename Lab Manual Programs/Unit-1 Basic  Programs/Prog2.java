// Mathematical Operations Program
import java.util.Scanner;

public class Prog2 {
    public static void main(String[] args)
     {
        Scanner bm=new Scanner(System.in);
        
        System.out.println("Enter first number: ");
        double num1=bm.nextDouble();
        System.out.println("Enter second number: ");
        double num2=bm.nextDouble();
        
        System.out.println("Addition: " + (num1+num2));
        System.out.println("Subtraction: " + (num1-num2));
        System.out.println("Multiplication: " + (num1*num2));
        System.out.println("Division: " + (num1/num2));
        System.out.println("Modulus: " + (num1%num2));
        
        bm.close();
    }
}