package day02;

import day02.inheritance_abstraction.BMW;
import day02.inheritance_abstraction.Car;
import day02.inheritance_abstraction.Mercedes;
import day02.inheritance_abstraction.Toyota;

public class Polymorphism {

    public static void main(String[] args) {

        Car car1 = (Car) new Toyota(2019, "Camry", "Black", 25000); // upcasting

        Car car2 = new BMW(2020, "X6", "Red", 45000);
        car2.start();
        car2.drive();

       // car2.massage();
        ( (BMW)car2 ).massage();

        ((BMW) car2).massage();

       ( (Mercedes)car2 ).massage();  // there MUST be IS A relation between object Type and reference type






    }

}
