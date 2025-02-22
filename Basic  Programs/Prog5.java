// Student Grade Calculator
import java.util.Scanner;

public class Prog5{
    public static void main(String[] args) {
        Scanner mu=new Scanner(System.in);
        
        System.out.println("Enter marks for three subjects:");
        System.out.print("Subject 1: ");
        double sub1=mu.nextDouble();
        System.out.print("Subject 2: ");
        double sub2=mu.nextDouble();
        System.out.print("Subject 3: ");
        double sub3=mu.nextDouble();
        
        double total=sub1+sub2+sub3;
        double perc=total/3;
        
        String result = perc>= 40 ? "Pass" : "Fail";
        String grade = "F";
        if (perc>=75) grade = "Distinction";
        else if (perc>=60) grade = "First Class";
        else if (perc>=50) grade = "Second Class";
        else if (perc>=40) grade = "Pass Class";
        
        System.out.println("\nResults:");
        System.out.println("Total: " +total);
        System.out.println("Percentage: " +perc+ "%");
        System.out.println("Result: " +result);
        System.out.println("Class: " +grade);
        
        mu.close();
    }
}