package day02Sa.inheritence_abstraction;

public class BMW extends Car implements LuxuryCar{
    public BMW(int year, String model, String color, double price) {
        super(year, "BMW", model, color, price);
    }

    @Override
    public void start() {
        System.out.println("Push the start button");
    }

    @Override
    public void massage() {

        System.out.println("BMW massage");
    }
}
