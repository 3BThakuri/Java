// Sum and Average of 10 Numbers
import java.util.Scanner;

public class Prog8{
    public static void main(String[] args) {
        Scanner bam= new Scanner(System.in);
        int sum=0;
        
        System.out.println("Enter 10 numbers:");
        for(int i = 1; i <= 10; i++) {
            System.out.print("Number " + i + ": ");
            sum += bam.nextInt();
        }
        
        double average=sum/10.0;
        System.out.println("Sum: " +sum);
        System.out.println("Average: " +average);
        
        bam.close();
    }
}
