package day01;

import java.util.Arrays;
import java.util.List;

public class CustomMethods<T> {  // T: Dynamic Type==> can work with multiple types
// generics ===> Type safety

    public T max(T[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    public void reverse(T[] arr){
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public void reverse(List<T> list){
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }



    public static void main(String[] args) {

        CustomMethods<Integer> intArrays = new CustomMethods<>();

        Integer[] arr ={1,2,3,4,5,6,7,8,9,10};

        System.out.println(intArrays.max(arr) );

        intArrays.reverse(arr);

        CustomMethods<Double> doubleArray = new CustomMethods<>();
        Double[] arr2 = {20.5, 20.5, 30.5};
        doubleArray.max(arr2);
        doubleArray.reverse(arr2);

        System.out.println("-------------------------------");

        String[] names = {"A", "B", "C", "D", "E"};

        CustomMethods<String> stringArray = new CustomMethods<>();

        stringArray.reverse(names);
        
        
        String str = "Java";
        //str.substring
        
        

    }
    
    public static int min(int[] arr){
        Arrays.sort(arr);
        return arr[0];
    }
    
    public static double min(double[] arr){
        Arrays.sort(arr);
        return arr[0];
    }

    public static short min(short[] arr){
        Arrays.sort(arr);
        return arr[0];
    }

    public static byte min(byte[] arr){
        Arrays.sort(arr);
        return arr[0];
    }
    
    


    



}
