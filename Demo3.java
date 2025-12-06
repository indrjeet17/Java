

abstract class Car{

//    public void drive(){
//    }
    //no implementation of this so decalre it just ky pata whether it is used by upcoming classes

    //public void drive();
    //can't declare like this so use abstract but abstarct method requires abstaract class so dec class as
    //abstaract

   public abstract void drive();

    public abstract void fly();

    public static void Music(){
        System.out.println("music haa");
    }
}



abstract class Wagnor extends Car{

    @Override
    public  void drive() {
        System.out.println("hii ");

        // need to implement the fly also means extending abstarct class means need to implement all abstract method
//
//        public void fly() {
//            System.out.println(" im nin flying car");
//        }

        // dont want this to happen
        // i want only one method in wagonr not both method so declare it in another class

       // declare class extending as abstract to use only one  abstract method
    }
}

// u cant craete object of abstarct class

// create two classes and use two abstarct method so no need to make class abstarct

class Upperwagonr extends Wagnor{

    @Override
    public void fly() {
        System.out.println("fuck fly");
    }
}



public class Demo3 {

    public static void main(String[] args) {

        Car obj = new Upperwagonr();
        Upperwagonr obj1 = new Upperwagonr();

        obj1.fly();
        obj1.drive();
        obj1.Music();

    }
}
