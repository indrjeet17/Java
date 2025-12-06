

class A1{

    public A1(){
        super(); // every constructor body has this at start
        System.out.println(" in A");
    }
    public A1(int n ){
        System.out.println(" in parameterized super constructor of A");
    }

}

class B extends  A1{
    public B(){
        // super(); // default one been called
       // super(5); // it will execute paramtirized one if we dont pass paramter it will call default means non paramterized

        System.out.println(" in B ");
    }
}




public class SuperThisMthd {

    public static void main(String[] args) {

        B b = new B();
        // it also call constructor of A


    }
}
