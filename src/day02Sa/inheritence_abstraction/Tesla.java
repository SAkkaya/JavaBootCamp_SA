package day02Sa.inheritence_abstraction;

public class Tesla extends Car implements LuxuryCar{
    public Tesla(int year, String model, String color, double price) {
        super(year, "Tesla", model, color, price);
    }

    public void start(){
        System.out.println("Say hello");
    }

    @Override
    public void massage() {

    }
}
