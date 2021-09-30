package day01Sa;

import java.util.Arrays;
import java.util.List;

public class CustomMethods<T> {


    public T max(T[] arr){    // T: Dynamic Type     T yerine herhangi bir harf de olabilir onemli degil
    // generics --> Type safety

        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    public void reverse (T[] arr){
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void reverse (List<T> list){
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }




    public static void main(String[] args) {

        CustomMethods<Integer> intArrays = new CustomMethods<>();       //Dynamic olunca  non primitive olmali ici -->  <Integer>
        Integer [] arr = {1,2,3,4,5,16,7,8,9,10,15};
        System.out.println(intArrays.max(arr));
        intArrays.reverse(arr);


        CustomMethods<Double> doubleArray = new CustomMethods<>();
        Double [] arr2 = {12.1,3.4,5.6};
        System.out.println(doubleArray.max(arr2));
        doubleArray.reverse(arr2);


        System.out.println("----------------------------");

        CustomMethods<String> stringArrays = new CustomMethods<>();
        String [] names = {"A", "B", "C", "D", "E"};
        System.out.println(stringArrays.max(names));
        stringArrays.reverse(names);


        String str = "Java";
        //str.substring

    }

    public static int min (int [] arr){
        Arrays.sort(arr);
        return arr[0];
    }

    public static double min (double [] arr){
        Arrays.sort(arr);
        return arr[0];
    }

    public static short min (short [] arr){
        Arrays.sort(arr);
        return arr[0];
    }

    public static byte min (byte [] arr){
        Arrays.sort(arr);
        return arr[0];
    }


}
