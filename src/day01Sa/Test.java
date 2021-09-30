package day01Sa;

public class Test {

    public static void main(String[] args) {

        OOP_Encapsulation obj = new OOP_Encapsulation();

//        obj.name = "";
//        obj.salary =-10000;

        obj.setName("Aoron");
        obj.setSalary(-10000);

        System.out.println(obj.getName() + " : " + obj.getSalary());


    }
}
