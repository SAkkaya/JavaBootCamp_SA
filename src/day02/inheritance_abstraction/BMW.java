package day02.inheritance_abstraction;

public final class BMW extends Car implements LuxuryCar{ // BMW Is A Car
    public BMW(int year, String model, String color, double price) {
        super(year, "BMW", model, color, price);
    }

    @Override
    public void start() {
        System.out.println("Push the start button");
    }

    @Override
    public void massage() {

    }
}
