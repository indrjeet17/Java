public class Strbuffer {

    public static void main(String[] args) {
        StringBuffer str = new StringBuffer();
        System.out.println(str.capacity());


        StringBuffer str1 = new StringBuffer("navin");
        System.out.println(str1.capacity());

         String st = str1.toString();
        System.out.println(st);

        str1.append("reddy");
        System.out.println(str1);


    }
}
