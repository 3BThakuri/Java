//  Method Overloading
public class MethodOverloading {
    public int add(int a, int b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    public double add(double a, double b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        MethodOverloading bmm = new MethodOverloading();
        System.out.println("Sum of 2 num: " + bmm.add(5, 10));
        System.out.println("Sum of 3 num: " + bmm.add(5, 10, 15));
        System.out.println("Sum of 2 num: " + bmm.add(5.5, 10.5));
    }
}
