package day02;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice {

    public static void main(String[] args) {
        String[] names = {"Oliver", "Jack", "Noah", "Breanna", "Shay","James", "Conor", "Jake", "John"};
        Integer[] salaries = {11000, 105000, 95000, 85000, 100000, 90000, 78000, 118000, 98000};

        Map<String, Integer> employeeMap = new LinkedHashMap<>();

        for (int i = 0; i < names.length; i++) {
            employeeMap.put(names[i], salaries[i]);
        }

        System.out.println(employeeMap);

        System.out.println("----------------------------------------------");
        // by keys:
        for(String eachKey   : employeeMap.keySet() ){
            System.out.println(eachKey);
        }

        System.out.println("----------------------------------------------");
        // by values:
        for (Integer eachValue : employeeMap.values()) {
            System.out.println(eachValue);
        }

        System.out.println("--------------------------------------------");
        // by entry
        for (Map.Entry<String, Integer> eachEntry : employeeMap.entrySet()) {
           // System.out.println(eachEntry);
            System.out.println(eachEntry.getKey() +" : "+eachEntry.getValue());
        }

        System.out.println("--------------------------------------------");

        employeeMap.forEach( (k, v)  -> {
            if(v < 100000)
                System.out.println(k+" : "+v);
        } );


    }

}
