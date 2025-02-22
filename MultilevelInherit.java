//  Multilevel Inheritance
class Vehicle {
    protected String brand = "Ford";
    public void honk() {
        System.out.println("Tuut, tuut!");
    }
}

class Car extends Vehicle {
    protected String modelName = "Mustang";
    public void start() {
        System.out.println("Car is starting");
    }
}

class SportsCar extends Car {
    public void turboBoost() {
        System.out.println(brand + " " + modelName + " turbo activated!");
    }
}

public class MultilevelInherit{
    public static void main(String[] args) {
        SportsCar myCar = new SportsCar();
        myCar.honk(); 
        myCar.start();   
        myCar.turboBoost(); 
    }
}
