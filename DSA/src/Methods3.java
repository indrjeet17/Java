public class Methods3 {
    static int a=10;
   static int b=20;


    public static void main(String[] args) {
//        int a=10;
//        int b=20;

        swap(a,b);

        System.out.println(a+ " "+ b);

        String name = "kunal ";
        changename1(name);
        System.out.println(name);

    }



    static void changename1(String name){
        name="kunalbhai";
        //System.out.println(name);
    }
    static void swap(int a , int b){
        int temp = a;
        a=b;

        b=temp; // in this a and b are swapped but the original a and b not bcz pass by value is their
        // they are still pointing to a and b  2

    }

}
