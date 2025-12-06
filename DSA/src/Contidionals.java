import java.util.Scanner ;

public class Contidionals {
    public static void main(String[] args) {

//        int  b =sc.nextInt();
//
//        int c = sc.nextInt();
//
//
//        if(a>b){
//            if (a>c) System.out.println("a is greatest ");
//
//            else
//                System.out.println("c is greatest");
//        }
//        else{
//            if(b>c) System.out.println("b is greatest");
//
//            else
//                System.out.println("c greatest");
//        }



        int i ;
//        for (i=0;i<=5;i++){
//            System.out.println("hey");
//        }
//        System.out.println(i);


//   for(i=0;i<100;i++){
//       if(i%2==0) System.out.println(i);
//       System.out.println("even");
//
//   }


//     for(i=0;i<n;i++){
//         System.out.println(i);
//     }


        //  first approach
//           for(i=19;i<=190;i++){
//              if(i%19==0) System.out.println(i);
//           }

        //second approach
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
////        int num;
//
//        for(i=n;i<=n*10;i++){
//            if(i%n==0) System.out.println(i);
//        }

        for(i=19;i<=190;i+=19){
            System.out.println(i);
        }
 // even approch
        for(i=2;i<100;i+=2){
            System.out.println(i);
        }
 // odd approch of 50 rounds
        for(i=1;i<100;i+=2){
            System.out.println(i);
        }

    }
}
