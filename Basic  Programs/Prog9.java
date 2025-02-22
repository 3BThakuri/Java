// Print Name 10 Times
import java.util.Scanner;

public class Prog9{
    public static void main(String[] args) {
        Scanner bmm=new Scanner(System.in);
        
        System.out.println("Enter your name: ");
        String name=bmm.nextLine();
        
        System.out.println("\nPrinting name 10 times:");
        for(int i = 1; i <= 10; i++) {
            System.out.println(i + ". " +name);
        }
        
        bmm.close();
    }
}
