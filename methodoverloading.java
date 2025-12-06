class calculator{

    public int add(int n1,int n2,int n3){
         return n1+n2+n3;

    }

    public int add(int n1,int n2){
        return n1+n2;

    }
    public double add(double n1,int n2){
        return n1+n2; // it returns double addition of diff data type gives big data type result
        // so double is given

    }

}

public class methodoverloading {

    public static void main(String[] args) {


        calculator cm = new calculator();
        int adde= cm.add(12,3);
        int baddie= cm.add(13,4);
        int zaddie = cm.add(12,13);

        System.out.println(baddie);
        System.out.println(zaddie);



        // overriding
        // Method resolution in overriding happens at runtime (dynamic polymorphism).
        // The Java Virtual Machine (JVM) determines which version of the method (superclass or subclass) to
        // execute based on the actual object type at runtime.
        // The @Override annotation is typically used to indicate an overridden method,
        // though it is not strictly required for functionality.


       // overloading
        //  Method resolution in overloading happens at compile time (static polymorphism).
        // The compiler determines which overloaded method to call based on the arguments provided during the method call.
    }
}
