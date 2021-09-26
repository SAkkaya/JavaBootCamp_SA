package day02;

import java.util.*;

public class CollectionsPractice {

    public static void main(String[] args) {

        List<String> list1 = new Stack<>();
        list1.addAll(Arrays.asList("A", "B", "C", "D", "E"));

        System.out.println(list1);

        ((Stack<String>) list1).pop(); //LIFO ==> E

        System.out.println(list1);

        ((Stack<String>) list1).pop();  //LIFO ==> D

        System.out.println(list1);

        System.out.println("--------------------------------");

        Set<Integer> set1 =new HashSet<>();
        set1.addAll(Arrays.asList(10,10,1,1,2,3,4,5,6,7,8,9,16, null, null));

        Set<Integer> set2 =new LinkedHashSet<>();
        set2.addAll(Arrays.asList(10,10,1,1,2,3,4,5,6,7,8,9,16, null, null));

        Set<Integer> set3 = new TreeSet<>();
        set3.addAll(Arrays.asList(10,10,1,1,2,3,4,5,6,7,8,9,16));

        System.out.println("set1 = " + set1);
        System.out.println("set2 = " + set2);
        System.out.println("set3 = " + set3);

        System.out.println("-------------------------------");

        Queue<Integer> queue = new PriorityQueue<>();
        queue.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        System.out.println(queue);

        queue.poll(); //FIFO ==> 1

        System.out.println(queue);

        queue.poll(); //FIFO ==> 2

        System.out.println(queue);

        System.out.println("-----------------------------------------");

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,1,2,3,4,5,6,7,1,2,3,4,5));

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)<4){
                list.remove(i);
            }
        }

        System.out.println("list = " + list);

        System.out.println("------------------------------------------------");

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,1,2,3,4,5,6,7,1,2,3,4,5));

        Iterator<Integer> iterator = list2.iterator();
        while(iterator.hasNext()){
            if(iterator.next() < 4){
                iterator.remove();
            }
        }

        System.out.println("list2 = " + list2);

        System.out.println("-----------------------------------------------");

        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,1,2,3,4,5,6,7,1,2,3,4,5));

        list3.removeIf( p -> p < 4 );

        System.out.println("list3 = " + list3);


    }


}
