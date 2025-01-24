// 10. Varargs Demonstration
public class VarargsDemo {
    public static int sum(int... numbers) {
        int total = 0;
        for(int num : numbers) {
            total += num;
        }
        return total;
    }
    
    public static void printAll(String message, String... items) {
        System.out.println(message);
        for(String item : items) {
            System.out.println(item);
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Sum of 2 numbers: " + sum(10, 20));
        System.out.println("Sum of 3 numbers: " + sum(10, 20, 30));
        System.out.println("Sum of 4 numbers: " + sum(10, 20, 30, 40));
        
        printAll("Fruits:", "Apple", "Banana", "Orange");
    }
}
