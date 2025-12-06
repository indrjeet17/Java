import java.sql.SQLOutput;

interface A11{
    // void show();
    void show(int i );
}



public class LambdaExp {
    public static void main(String[] args) {

//        A11 obj = () -> System.out.println("in a show lambda exp"); // cuutted  new A11 and public void show {}
//        obj.show();

        A11 obj =  /* new A11*/ (i) -> System.out.println(" in show  "+i);

//           {
//            @Override
//            public void show(int i) {
//                System.out.println(" in a paramer show "+i);
//            }
//        };
        obj.show(40);

    }
}
