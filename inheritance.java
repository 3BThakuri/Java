// Simple Inheritance
class Animal{
    protected String name;
    
    public void eat() {
        System.out.println(name + " is eating");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        this.name = name;
    }
    
    public void bark() {
        System.out.println(name + " is barking");
    }
}

public class inheritance{
    public static void main(String[] args) {
        Dog d = new Dog("Dog");
        d.eat();  
        d.bark(); 
    }
}
