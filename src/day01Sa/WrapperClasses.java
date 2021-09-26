package day01Sa;

public class WrapperClasses {
    public static void main(String[] args) {

        byte b = 100;
       // Integer x = b;
        int c = b;

        int d = 100;
        Integer z = d;

        String a = "1000";
        int r1= Integer.parseInt(a);
        System.out.println(r1*3);

        Integer r2= Integer.valueOf(a);
        System.out.println(r2*4);



    }
}
