package day01Sa;

public class Loops {

    public static void main(String[] args) {

        for (int i = 0; i < 5 ; i++){
            System.out.println("EU5");
        }

        System.out.println("----------------------------------");
        int i = 0;

        while(i < 5){
            System.out.println("EU5");
            i++;
        }


        System.out.println("----------------------------------");

        for(int k=0; k<5;k++){
            for (int j = 0; j < 5 ; j++){
                System.out.print("EU5 ");
            }
            System.out.println("");
        }
        System.out.println();

        System.out.println("----------------------------------");


        char[] ch1 = {'A', 'B', 'C', 'D', 'E'};

        for (int k = 0; k < ch1.length; k++) {
            System.out.print(ch1[k] + " ");
        }

        System.out.println("----------------------------------");

        for (char each : ch1) {
            System.out.print(each);
        }





    }


}
