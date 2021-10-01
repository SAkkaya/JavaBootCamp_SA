package day02Sa;

import apple.laf.JRSUIConstants;

import java.util.*;

public class Collectionspractice {

    public static void main(String[] args) {

        List<String> list1 = new Stack<>();
        list1.addAll(Arrays.asList("A","B", "C", "D", "E"));

        System.out.println(list1);  //[A, B, C, D, E]

        ((Stack<String>) list1).pop(); //LIFO ==> E

        System.out.println(list1); //[A, B, C, D]  //LIFO ==> E


        ((Stack<String>) list1).pop();

        System.out.println(list1);  //[A, B, C]


        System.out.println("--------------------");

       Set<Integer> set1 = new HashSet<>();  // does not keep insertion order, ORDER is RANDOM
       set1.addAll(Arrays.asList(10,10,1, 1,2,3,4,5,6,7,8,9,16, null, null)); //set1 = [16, null, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        Set<Integer> set2 = new LinkedHashSet<>(); // keeps  Insertion Order
        set2.addAll(Arrays.asList(10,10,1, 1,2,3,4,5,6,7,8,9,16, null, null)); // set2 = [10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 16, null]


        Set<Integer> set3 = new TreeSet<>();  //ascending order
       // set3.addAll(Arrays.asList(10,10,1, 1,2,3,4,5,6,7,8,9,16, null, null));  //NullPointerException   -> threeSet not allow null
        set3.addAll(Arrays.asList(10,10,1, 1,2,3,4,5,6,7,8,9,16)); //set3 = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 16]

        System.out.println("set1 = " + set1);
        System.out.println("set2 = " + set2);
        System.out.println("set3 = " + set3);


        System.out.println("--------------------");


//         set1.for     enter  -> short cut
        for (Integer integer: set1) {
            System.out.print(integer + " ");
        }

        System.out.println("--------------------");

        Queue<Integer> queue = new PriorityQueue<>();
        queue.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        System.out.println(queue); //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        queue.poll(); // FIFO

        System.out.println(queue); //[2, 3, 4, 5, 6, 7, 8, 9, 10]

        queue.poll(); // FIFO
        System.out.println(queue); //[3, 4, 5, 6, 7, 8, 9, 10]

        System.out.println("--------------------");

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,1,2,3,4,5,6,7,1,2,3,4,5));

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) <4){
                list.remove(i);
            }
        }

        System.out.println("list = " + list);  //[2, 4, 2, 4, 5, 6, 7, 2, 4, 5]  ==> removing elemnt  and shifting element cretes problem

        System.out.println("--------------------");

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,1,2,3,4,5,6,7,1,2,3,4,5));
        Iterator<Integer> iterator = list2.iterator();

        while(iterator.hasNext()){
            if (iterator.next() < 4){
                iterator.remove();
            }
        }

        System.out.println("list2 = " + list2);  //list2 = [4, 4, 5, 6, 7, 4, 5]


        System.out.println("--------------------");

        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,1,2,3,4,5,6,7,1,2,3,4,5));
        list3.removeIf(p -> p < 4 );

        System.out.println("list3 = " + list3); //list3 = [4, 4, 5, 6, 7, 4, 5]







    }
}
