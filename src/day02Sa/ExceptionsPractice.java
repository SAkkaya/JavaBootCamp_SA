package day02Sa;

import java.io.FileInputStream;

public class ExceptionsPractice {

    public static void main(String[] args) throws InterruptedException {

        String str = null;
    //    System.out.println(str.toLowerCase());  //NullPointerException --> unchecked (during runtime occurs)

   //     FileInputStream file = new FileInputStream("") // checked exception


        try{
            System.out.println( 9 / 0 );   //ArithmeticException: / by zero
        }catch (RuntimeException e){
            e.printStackTrace(); // // after executing all the codes, gives the full details of the exception that was occured
        }

        System.out.println("Test1 Completed");


        /*
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

         */
        Thread.sleep(3000);
        System.out.println("Test2 Completed");

    }


    public static void method1(){

    }



}
