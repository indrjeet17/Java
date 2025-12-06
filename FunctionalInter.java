import java.sql.SQLOutput;

@FunctionalInterface
interface A10{
    void show();
}
class B10 implements A10{

    @Override
    public void show() {
        System.out.println(" in show");
    }
}



public class FunctionalInter {
    public static void main(String[] args) {
         A10 obj = new B10 (){

             @Override
             public void show() {
                 System.out.println(" in as show inner");
             }
         };
         obj.show();
    }
}
