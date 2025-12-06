class Mobile2 {

    String name;
    int price;

    String brand;

    static String modeltype;

//    public void show() {
//        System.out.println(price + " " + brand + " " + name + " " + modeltype);
//    }
//


    static{ // even without object craetion u can get this bcz it loads with class .class loads in class loader
        // class loader jvm where all class loads
        modeltype="smartphone"; //  here we done it
        System.out.println("im in  static");
    }

    public Mobile2(){

        name="";
        price= 20000;
        brand="same";
        modeltype="smartphone"; // this will be called with every object but it will not change
        // so decaler it once

        System.out.println("im in constructor");
    }

}
















public class Statcblock {
    public static void main(String[] args) throws ClassNotFoundException {

//        Mobile2 mb1 = new Mobile2();
//        Mobile2 mb2= new Mobile2();


// without object creation calling class
        Class.forName("Mobile2");





//        mb.modeltype = "Smartphone";
//        Mobile2.modeltype="hii";

        //mb.show();

    }
}
