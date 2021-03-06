package day02Sa.inheritence_abstraction;

public abstract class Car {

    public final int year;
    public final String make, model;
    public final String color;
    public double price;

    public Car(int year, String make, String model, String color, double price) {
        this.year = year;
        this.make = make;
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public final void drive(){
        System.out.println("Driving "+make+" "+ model);

    }

    public abstract void start();



    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }




}
