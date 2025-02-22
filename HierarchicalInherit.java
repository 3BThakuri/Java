// Hierarchical Inheritance
class Shape {
    protected double area;
    
    public void displayArea() {
        System.out.println("Area: " + area);
    }
}

class Circle extends Shape {
    public Circle(double radius) {
        area = Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    public Rectangle(double length, double width) {
        area = length * width;
    }
}

public class HierarchicalInherit{
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        
        System.out.println("Circle:");
        circle.displayArea();
        System.out.println("Rectangle:");
        rectangle.displayArea();
    }
}
