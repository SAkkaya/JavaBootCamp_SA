package day02Sa;

import day02Sa.inheritence_abstraction.BMW;
import day02Sa.inheritence_abstraction.Car;
import day02Sa.inheritence_abstraction.Mercedes;
import day02Sa.inheritence_abstraction.Toyota;

public class Polymorphism {

    public static void main(String[] args) {

        Car car1 = new Toyota(2019, "Camry", "Black", 25000);
        Car car2 = new BMW(2020, "X6", "Red", 45000);

        car2.start();
        car2.drive();

        ((BMW) car2).massage();
        ((Mercedes)car2).massage();  //ClassCastException:  There must be a IS a relation between object type and regference type




    }




}
