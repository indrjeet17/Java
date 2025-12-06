import java.sql.SQLOutput;

enum laptop4{

    Macbook (2000),Surface(800),XPS,ThinkPad(599); // objects , written  like this
    // look first we have craeted class laptop it has price only
    // and this constant are objects  with values how you give value to object by assigning with obj.variable
    // or by constructor direct
    // making constructor for this objects
    private int price; // cause it is only for class laptop


    laptop4() {
     price=800;
    }

    laptop4(int price){
        this.price=price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}



public class enum4 {
    public static void main(String[] args) {



        laptop4 lp =laptop4.Macbook;
        System.out.println(lp);
        System.out.println(lp.getPrice());

        for(laptop4 lp1 : laptop4.values()){ /// you have to store laptop4 in laptop4
            System.out.println(lp1+ " "+lp1.getPrice());
        }
    }
}
