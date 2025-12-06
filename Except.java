





public class Except {
    public static void main(String[] args) {

        int i=0; int j=0;
//        int j=18/i;
//        System.out.println(j);
        // System.out.println(" working coding kya after error ");
 //Exception in thread "main" java.lang.ArithmeticException: / by zero
        //	at Except.main(Except.java:11

        try{ //jhal tar bag complier nhitar de error karto catch
            j=18/i;
        }
        catch (Exception e ){
            System.out.println(" something wrong");
        }
        System.out.println(" code after error working haa");

    }
}
