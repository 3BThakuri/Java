//  Constructor Demonstration
public class ConstDemo {
    private String message;
    
    // Default constructor
    public ConstDemo() {
        message = "Default Constructor Called";
    }
    
    public void disp() {
        System.out.println(message);
    }
    
    public static void main(String[] args) {
        ConstDemo bm = new ConstDemo();
        bm.disp();
    }
}