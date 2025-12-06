
class Mobile{

    String name ;
    int price ;

    String brand;

    static String modeltype;

    public void show (){
        System.out.println(price+ " "+brand+" "+name+ " "+modeltype);
    }

}





public class Statc {

    public static void main(String[] args) {

     Mobile mb = new Mobile();

     mb.name= "iphone";
     mb.price=4500;
     mb.brand="Apple";

     mb.modeltype="Smartphone";


        Mobile mb1 = new Mobile();

        mb1.name= "Galaxy";
        mb1.price=45000;
        mb1.brand="Samsung";
        mb1.modeltype="mamam";// change in this but will reflect in every object or same in all objects

        // or by class name we can initialised , initialised once can also initialised in all objects

        Mobile.modeltype="pranam";

        mb.show();
        mb1.show();
    }
}
