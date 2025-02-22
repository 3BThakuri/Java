// Simple Interest Cal
import java.util.Scanner;

public class Prog3 {
    public static void main(String[] args) {
        Scanner bm=new Scanner(System.in);
        
        System.out.println("Enter principal amount: ");
        double p=bm.nextDouble();
        System.out.println("Enter Rate of Interest: ");
        double r=bm.nextDouble();
        System.out.println("Enter NUmber of years: ");
        double n=bm.nextDouble();
        
        double si=(p*r*n)/100;
        System.out.println("Simple Interest: "+si);
        
        bm.close();
    }
}