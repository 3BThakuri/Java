// Maximum of Three Numbers
import java.util.Scanner;

public class Prog7{
    public static void main(String[] args) {
        Scanner bam=new Scanner(System.in);
        
        System.out.println("Enter three numbers:");
        int num1=bam.nextInt();
        int num2=bam.nextInt();
        int num3=bam.nextInt();
        
        int max=Math.max(Math.max(num1, num2), num3);
        System.out.println("Maximum number is: " + max);
        
        bam.close();
    }
}