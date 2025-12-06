import jdk.swing.interop.SwingInterOpUtils;

public class Wrapper1 {

    public static void main(String[] args) {

        int num =7;

        //Integer num1 = new Integer(num);

        Integer num1 = num; // autoboxing

        System.out.println(num1);


      //  int num2 = num1.intValue();

        int num2 = num1; // autoboxing

        System.out.println(num2);


        String str = "12";
        int num3 = Integer.parseInt(str); // converting string to int

        System.out.println(str);

    }
}
