import java.util.SortedMap;



 interface Computer
{
  public abstract void code();


}
class Desktop implements Computer
{
 public void code(){
     System.out.println(" run code in Desktop faster, developer!!");
 }
}

class laptop2 implements Computer
{
    public void code(){
        System.out.println(" run code on this but  slow, developer!! ");
    }
}

class dev
{
    public void devApp(/*laptop2 lp*/ Computer lp ){
        lp.code();
        System.out.println(" coded Application yeh!!"); // but deveoper need laptop for coding fisrt lp then coding
    }
}






public class Interfacess {
    public static void main(String[] args) {
       /* laptop2*/ Computer lp =new laptop2();
       /* Desktop*/ Computer ds = new Desktop();

        dev obj= new dev();
        // obj.devApp(lp);
        obj.devApp(ds);

 //but company has desktop no laptop but developer cant acccept it so what to do it has only laptop to obj
 // look desktop and laptop are both computers so make computer class extend it in both lp and desktop













//
//        abstract class Computer
//        {
//            public abstract void code();
//
//
//        }
//        class Desktop extends Computer
//        {
//            public void code(){
//                System.out.println(" run code in Desktop faster, developer!!");
//            }
//        }
//
//        class laptop2 extends Computer
//        {
//            public void code(){
//                System.out.println(" run code on this but  slow, developer!! ");
//            }
//        }
//
//        class dev
//        {
//            public void devApp(/*laptop2 lp*/ Computer lp ){
//                lp.code();
//                System.out.println(" coded Application yeh!!"); // but deveoper need laptop for coding fisrt lp then coding
//            }
//        }
//
//
//
//
//
//
//        public class Interfacess {
//            public static void main(String[] args) {
//                /* laptop2*/ Computer lp =new laptop2();
//                /* Desktop*/ Computer ds = new Desktop();
//
//                dev obj= new dev();
//                // obj.devApp(lp);
//                obj.devApp(ds);
//
//                //but company has desktop no laptop but developer cant acccept it so what to do it has only laptop to obj
//                // look desktop and laptop are both computers so make computer class extend it in both lp and desktop
//
//
//
//
//            }
//        }


    }
}


//class Computer
//{
//    public void code(){
//
//    } // later deaclare it abstarct
//}
//class Desktop
//{
//    public void code(){
//        System.out.println(" run code in Desktop faster, developer!!");
//    }
//}
//
//class laptop2
//{
//    public void code(){
//        System.out.println(" run code on this but  slow, developer!! ");
//    }
//}
//
//class dev
//{
//    public void devApp(laptop2 lp ){
//        lp.code();
//        System.out.println(" code, Application"); // but deveoper need laptop for coding fisrt lp then coding
//    }
//}
//
//
//
//
//
//
//public class Interfacess {
//    public static void main(String[] args) {
//        laptop2 lp =new laptop2();
//
//        dev obj= new dev();
//        obj.devApp(lp);
//
//        //but company has desktop no laptop but developer cant acccept it so what to do it has only laptop to obj
//        // look desktop and laptop are both computers so make computer class extend it in both lp and desktop
//
//
//
//    }


//}



//class Computer
//{
//    public void code(){
//
//    } // later deaclare it abstarct
//}
//class Desktop extends Computer
//{
//    public void code(){
//        System.out.println(" run code in Desktop faster, developer!!");
//    }
//}
//
//class laptop2 extends Computer
//{
//    public void code(){
//        System.out.println(" run code on this but  slow, developer!! ");
//    }
//}
//
//class dev
//{
//    public void devApp(/*laptop2 lp*/ Computer lp ){
//        lp.code();
//        System.out.println(" coded Application yeh!!"); // but deveoper need laptop for coding fisrt lp then coding
//    }
//}
//
//
//
//
//
//
//public class Interfacess {
//    public static void main(String[] args) {
//        /* laptop2*/ Computer lp =new laptop2();
//        /* Desktop*/ Computer ds = new Desktop();
//
//        dev obj= new dev();
//        // obj.devApp(lp);
//        obj.devApp(ds);
//
//        //but company has desktop no laptop but developer cant acccept it so what to do it has only laptop to obj
//        // look desktop and laptop are both computers so make computer class extend it in both lp and desktop
//
//
//
//
//    }
//}
