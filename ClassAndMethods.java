// Class and Methods Demonstration
public class ClassAndMethods {
    private int num;
    private String text;
    
    public void setval(int n, String t) {
        num= n;
        text = t;
    }
    
    public void dispvalue() {
        System.out.println("Number: " + num);
        System.out.println("Text: " + text);
    }
    
    public static void main(String[] args) {
        ClassAndMethods cm = new ClassAndMethods();
        cm.setval(77, "Hello 3B");
        cm.dispvalue();
    }
}