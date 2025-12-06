public class Typeconversion {
    public static void main(String[] args) {

       // byte b = 257;
        int a = 257;

        byte b ;

        b= (byte)a; // its beyond byte limit so printing modules value 257%256=1
        /// implicit
        int c=100;
        float d;
        d=c;

        System.out.println(b);
        System.out.println(d);

        //explicit
        double t = 2000;
        float n =  (float) t;
        System.out.println(n);

    }
}
