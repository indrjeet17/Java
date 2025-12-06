import java.sql.SQLOutput;
import java.util.Objects;

class laptop{


    String model;
    int price;

//    @Override
//   public String toString() {
//        return model +"@"+ price ;
//   }


    @Override
    public String toString() {
        return "laptop{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    public boolean equals(laptop passedlp){

        if( this.model.equals(passedlp.model) && this.price == passedlp.price) {
            return true;
        }
        else {
            return false;
        }
    }



    //by ide
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        laptop laptop = (laptop) o;
//        return price == laptop.price && Objects.equals(model, laptop.model);
//    }

    @Override
    public int hashCode() {
        return Objects.hash(model, price);
    }
}
 class A4  {

     @Override
     public String toString() {
         return "hey";
     }
 }



public class Hashcde {
    public static void main(String[] args) {

//        A4 aa =new A4();
//        System.out.println(aa.toString());
//



        laptop lp = new laptop();
        lp.price =100000;
        lp.model="fucking cool laptop";


        laptop lp2 = new laptop();
        lp2.price =100000;
        lp2.model="fucking cool laptop";


        System.out.println(lp.toString());
        System.out.println(lp.equals(lp2));// because it caompres hashcode


    }
}
