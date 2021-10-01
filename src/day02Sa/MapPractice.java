package day02Sa;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static java.util.Arrays.*;

public class MapPractice {

    public static void main(String[] args) {

        String[] names = {"Oliver", "Jack", "Noah", "Breanna", "Shay","James", "Conor", "Jake", "John"};
        Integer[] salaries = {11000, 105000, 95000, 85000, 100000, 90000, 78000, 118000, 98000};


        Map<String, Integer> employeeMap = new LinkedHashMap<>();

        for (int i = 0; i < names.length; i++) {
            employeeMap.put(names[i], salaries[i]);
        }

        System.out.println("employeeMap = " + employeeMap);


        System.out.println("--------------------");

       //  how do you iterate the map by values ??    --> For each loop is the way to go

        //by keys:
        for(String eachKey :employeeMap.keySet()){
            System.out.println(eachKey);
        }


        System.out.println("--------------------");

        //by values:
        for(Integer eachValues :employeeMap.values()){
            System.out.println(eachValues);
        }


        System.out.println("--------------------");

        // by entry

        //employeeMap.entrySet().for enter shortcut
        for (Map.Entry<String, Integer> eachEntry : employeeMap.entrySet()) {
          //  System.out.println(eachEntry);

            System.out.println(eachEntry.getKey() + " : " + eachEntry.getValue());
        }

        System.out.println("--------------------------------------------");

        employeeMap.forEach((k,v)->{System.out.println(k + " : " + v);});

        System.out.println("--------------------------------------------");

        employeeMap.forEach((k,v)-> {
            if(v <100000)
                System.out.println(k+ " : "+v);
        });


    }
}
