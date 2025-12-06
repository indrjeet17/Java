class A2{

    public A2(){
        super(); // every constructor body has this at start
        System.out.println(" in A");
    }


}

class B1 extends  A2 {
    public B1() {
        // super hidden here calls the const of super class
        System.out.println(" in B ");
    }

    public B1(int n) {
        this();// it will call constructor of b class only that is default const
        System.out.println(" in B ");
    }


}


public class SuperThisMthd2 {

    public static void main(String[] args) {
        B1 b = new B1();

    }
}
