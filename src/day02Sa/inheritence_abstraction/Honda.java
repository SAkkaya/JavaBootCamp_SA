package day02Sa.inheritence_abstraction;

public class Honda extends Car{
    public Honda(int year, String model, String color, double price) {
        super(year, "Honda", model, color, price);
    }

    @Override
    public void start() {
        System.out.println("Twist the key to ignition");
    }



}
