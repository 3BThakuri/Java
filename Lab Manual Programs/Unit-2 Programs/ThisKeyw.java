// prog 5 Keyword Demonstration
public class ThisKeyw {
    private int number;
    private String text;
    
    public ThisKeyw(int number, String text) {
        this.number = number; 
        this.text = text;
    }
    
    public void display() {
        System.out.println("Rollno: " + this.number);
        System.out.println("Name: " + this.text);
    }
    
    public static void main(String[] args) {
        ThisKeyw bm = new ThisKeyw(73, "3B THAKURI");
        bm.display();
    }
}