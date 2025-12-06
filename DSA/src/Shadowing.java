public class Shadowing {

    static int x =90;

    public static void main(String[] args) {

        System.out.println(x);
        int x =40;
        System.out.println(x); // shadowed the x=90 bcz the lower scope function is in class class
        // class is higher in scope so its variable is shadowed
         fun();
//        Shadowing sh = new Shadowing();
//
//        sh.fun();

    }

     static void fun(){

        System.out.println(x);
    }
}
