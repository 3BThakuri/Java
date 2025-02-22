// Personal Information Display
import java.util.Scanner;

public class Prog4 {
    public static void main(String[] args) {
        Scanner bmm=new Scanner(System.in);
        
        System.out.println("Enter your name: ");
        String name=bmm.nextLine();
        System.out.println("Enter your age: ");
        int age=bmm.nextInt();
        bmm.nextLine(); // clear newline
        System.out.println("Enter your address: ");
        String addr=bmm.nextLine();
        System.out.println("\nPersonal Information:");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Address: "+addr);
        
        bmm.close();
    }
}