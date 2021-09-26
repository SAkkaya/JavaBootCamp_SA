package day01Sa;

import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {

        int [] arr = new int[3];
        arr[0] = 3;
        arr[1] =2;
        arr[2] =3;

        System.out.println(Arrays.toString(arr));

        Integer [] arr2 ={1,2,3};
        System.out.println(Arrays.toString(arr2));

        String [] arr3 ={"A", "B", "C"};
        System.out.println(Arrays.toString(arr3));

        int [][] arr2D = {{1,2},{2,4,5}};
        System.out.println(Arrays.deepToString(arr2D));

        System.out.println("-----------------------------");

        int [] a1 = {1,2,3};
        int [] a2 = {2,1,3};

        Arrays.sort(a1);
        Arrays.sort(a2);

        if(a1.length==a2.length){
            System.out.println("the length of a1 and a2 is equal");
        }else{
            System.out.println("the length of a1 and a2 is not equal");
        }

        if(Arrays.equals(a1,a2)){
            System.out.println("the elements of a1 and a2 is equal");
        }else{
            System.out.println("the elements of a1 and a2 is not equal");
        }





    }
}
