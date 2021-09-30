package day02Sa.inheritence_abstraction;

public class Toyota extends Car{

    public Toyota(int year, String model, String color, double price) {   // instance metodlar call etmek icin
        super(year, "Toyota", model, color, price); // parent class in constructor ini cagirmamiz lazim instancelar inherit edilir ama constructor i edilemez cagirmak lazim super( ile
    }

    @Override
    public void start() {
        System.out.println("Twist the key to ignition");
    }
}
