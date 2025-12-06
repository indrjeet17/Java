import java.util.Scanner;
public class Ap {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
           int n = sc.nextInt(); // no of terms
                   // a ; an =nth term ; difference 2,4,6,8,10 ... nth term
//        for(int i = 2;i<=2*n-1;i+=2){
//            System.out.println(i);
//        }
//        for(int i=100;i>=0;i-=3){
//            System.out.println(i);
//        }
//          int a=4 , d=3;
//        for(int i=1;i<=n;i++){
//            a+=d;
//            System.out.println(a);
//        }

        // gp
         int a=1;
        for(int i =1;i<=n;i++){
            a*=3;
            System.out.println(a);
        }




    }

}
