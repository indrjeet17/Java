import java.sql.SQLOutput;

interface A9{
    int no =90;
    void show();
    void config();

}


interface x{
    void run();

}

interface y extends x{

}

class B9 implements A9,y{

    @Override
    public void show() {
        System.out.println(" im in high");

    }


    @Override
    public void config() {
        System.out.println(" im in fuck ");
    }

    // need to implement both methods or all methods otherwise it will declare the extending class abstract


    @Override
    public void run() {
        System.out.println(" in run");
    }
}









public class Interface1 {
    public static void main(String[] args) {

        A9 obj = new B9();

        obj.show();
        obj.config();
       // obj.run(); //noo cause A dont know about X
        System.out.println(A9.no);

        x obj1= new B9();

        obj1.run();


    }
}
