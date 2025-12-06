public class Methods1 {





    static int add(){

        int a ;
        int b;

        int res ;

        a=10;
        b=20;

        res=a+b;
        return  res;




    }




    public static void main(String[] args) {


          calculator cal =new calculator();
          cal.add();

        System.out.println(add());
    }
}

class calculator{
    int a ;
     int b;

     int res;

     int add(){
         a=10;
         b=20;

         res=a+b;
         return  res;

     }

}