import java.sql.SQLOutput;

class A6{

    int age;

    public void show(){
        System.out.println(" in a show");


    }

    static class B6{

        public void config(){
            System.out.println("in a config");
        }
    }
}





public class Inner {
    public static void main(String[] args) {

        A6 obj = new A6();
        obj.show();
        // A6.B6 obj1 = obj.new B6();

        // if static
        A6.B6 obj1 = new A6.B6();
        obj1.config();

    }
}
