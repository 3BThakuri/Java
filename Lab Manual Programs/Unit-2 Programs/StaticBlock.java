// Program 8 Static Block Demonstration
public class StaticBlock{
    static int var;
    
    static {
        System.out.println("static block execute");
        var=77;
    }
    
    public static void main(String[] args) {
        System.out.println("Main method Executed");
        System.out.println("Static variable Value: " +var);
    }
}