package day02Sa.inheritence_abstraction;

public class Mercedes extends Car implements LuxuryCar{
    public Mercedes(int year, String model, String color, double price) {
        super(year, "Mercedes", model, color, price);
    }

    public void start(){
        System.out.println("push the start button");
    }

    @Override
    public void massage() {
        System.out.println("Mercedes massage");
    }
}
