// Runtime polymorphism (dynamic polymorphism) in Java can only be achieved through inheritance
// (or interfaces, which are also a kind of inheritance).
class A3 {

    public void show() {

        System.out.println(" in A show");
    }

}

class B3 extends A3 {
    public void show() {

        System.out.println(" in B show");
    }

}

class C3 extends A3{

    @Override
    public void show() {
        //  super.show();
        System.out.println(" in C show");
    }
}




public class Ploy {


    public static void main(String[] args) {
        A3 obj = new A3();
        obj.show();

        obj = new B3();
        obj.show();


        obj= new C3();
        obj.show();



    }
}
