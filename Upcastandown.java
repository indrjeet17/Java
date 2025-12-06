class A5 {

    public void show(){

        System.out.println("in A show");

    }
}
class B5 extends A5 {

    public void show1(){

        System.out.println("in B  show");

    }
}







public class Upcastandown {
    public static void main(String[] args) {

//
//        A5 obj = new A5();
//        obj.show();
//       // obj.show1(); // cant access it boy
//
        // so

        A5 obj2 = (A5) new B5();// no need to mention (A) bcz we are doing it right
       //  obj2.show1(); // still cant

        B5 obj1 ; // reference of B5
        obj1= (B5)obj2; // jamadasti ne A5 la kel refer to B5 karn without b% tar calll ny honar

        obj1.show1();

        // without b5 object can't possible to call show1()
    }
}
