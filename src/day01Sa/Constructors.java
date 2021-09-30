package day01Sa;

import java.time.LocalDate;
import java.time.Month;

class Person{  // sadece default olabilir diger class in Accesss modifier i

    public String name;
    public char gender;
    public LocalDate dateOfBirth;
    public static boolean isHuman = true;

    public Person(String name, char gender, LocalDate dateOfBirth) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }

}

public class Constructors {       // Class ismi ile File name ayni olmali , Access Modifier istedigimizi verebiliriz burda

    public static void main(String[] args) {

        Person person1 = new Person("Ali", 'M', LocalDate.of(1990, 5, 1));

        System.out.println("person1 = " + person1);

        System.out.println("person1.dateOfBirth = " + person1.dateOfBirth);

        System.out.println("Person.isHuman = " + Person.isHuman);

    }

}
