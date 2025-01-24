// unit 2 Prog 7 Constructor Overloading
public class ConstrOverloading {
    private int value;
    private String text;
    
    public ConstrOverloading() {
        value = 7;
        text = "Namaste";
    }
    
    public ConstrOverloading(int value) {
        this.value = value;
        text = "Namastee";
    }
    
    public ConstrOverloading(int value, String text) {
        this.value = value;
        this.text = text;
    }
    
    public void disp() {
        System.out.println("Value: " + value + ", Text: " + text);
    }
    
    public static void main(String[] args) {
        ConstrOverloading bm1 = new ConstrOverloading();
        ConstrOverloading bm2 = new ConstrOverloading(10);
        ConstrOverloading bm3 = new ConstrOverloading(20, "Namaste Bye");
        
        bm1.disp();
        bm2.disp();
        bm3.disp();
    }
}