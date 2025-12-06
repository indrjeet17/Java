class Mobile1 {

    String name;
    int price;

    String brand;

    static String modeltype;

    public void show() {
        System.out.println(price + " " + brand + " " + name + " " + modeltype);
    }


//    public static void  show1 (){
//        System.out.println(price+ " "+brand+" "+name+ " "+modeltype);
//        //non-static variable price cannot be referenced from a static context
//        // here it dont for which class this  variable are
//    }

    // pass object then static method will know about for which object this variable are assigned


    public static void show1(Mobile1 mb) {
        System.out.println(mb.price + " " + mb.brand + " " + mb.name + " " + modeltype);


    }
}




//No object yet exists: A static method belongs to the class itself,
// not to any specific instance (or object) of the class. When a Java program begins execution,
// the JVM loads the class into memory. Since no objects of that class have been created yet,
// a non-static method (which requires an object to be called) cannot be invoked.
//Consistent entry point: Declaring main as static provides a consistent and predictable way for the JVM to
// locate and call the method using just the class name (e.g., MyClass.main()).
// If main were non-static, the JVM would have to create an object of the class first.
// This would be complicated by the fact that a class can have multiple constructors, some of which may require arguments.
// It would be an inconsistent and unreliable process for the JVM to decide which constructor to use.
//No unnecessary overhead: Making the main method static prevents the JVM from creating an unnecessary object
// just for the sole purpose of starting the program
















public class Statcmthd {

    public static void main(String[] args) {

        Mobile1 mb = new Mobile1();

        mb.name = "iphone";
        mb.price = 4500;
        mb.brand = "Apple";

        mb.modeltype = "Smartphone";


        Mobile1 mb1 = new Mobile1();

        mb1.name = "Galaxy";
        mb1.price = 45000;
        mb1.brand = "Samsung";
        mb1.modeltype = "mamam";// change in this but will reflect in every object or same in all objects

        // or by class name we can initialised , initialised once can also initialised in all objects

        Mobile1.modeltype = "pranam";

        mb.show();
        mb1.show();
        Mobile1.show1(mb1);
    }
}
