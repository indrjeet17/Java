class A{

    public A(){
        System.out.println("im called // constructor");

    }

    public void show(){
        System.out.println(" im method in class ");
    }
}



public class Anonymous1 {
    public static void main(String[] args) {

//        A aa= new A();
//        aa.show();

        // new A(); // Anonymous object crated without refernce used only once
        // if we use this again it will craete new object
        new A().show();
        new A().show(); // this will create new object

    }
}
