package day02Sa;

import javax.xml.bind.SchemaOutputResolver;
import java.io.FileInputStream;

public class ExceptionsPractice {

    public void m(){
//        super.finalize();
    }



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

        method1();


//        System.out.println("cybertek".charAt(2000));  //StringIndexOutOfBoundsException
        try{
            System.out.println("cybertek".charAt(2000));
            System.out.println("Try block");
        }catch (RuntimeException e){
            System.out.println("Catch Block");
//            System.exit(0); // terminates eveerything
        }finally {
            System.out.println("finally");
        }

        System.out.println("hello");


        System.out.println("----------------------");

        String s = "Toyota";
        s = "BMW";

        System.out.println("s = " + s);

        System.out.println("----------------------");

    }


    public static void method1() throws InterruptedException {  // any time if i call this method will give this exception , so throws not an actual exception handling

        Thread.sleep(3000);

        System.out.println("hello");

        Thread.sleep(3000);

        System.out.println("How r u");



    }

    public static void method2(){

        try {
            method1(); // we just ignore the exception through throws keyword in method signore
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void method3(){
        method2(); // try / catch ile handle
      // method1(); //throws still gives exception
    }




}
