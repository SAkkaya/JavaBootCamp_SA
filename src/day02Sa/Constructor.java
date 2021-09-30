package day02Sa;


class A{
    public A(int a){  // constructor cannot be inherited
        System.out.println("A");
    }
}

class B extends A{

    public B(){
        super(10);
        //super()  -> parent class constructor
        System.out.println("B");
    }
}




public class Constructor {

    public static void main(String[] args) {

        new B();  // once parent in constructer i default super ile cagrilir sonra ilgili class in constructor i initialize olur

    }

}
