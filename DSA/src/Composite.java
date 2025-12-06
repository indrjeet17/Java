import java.util.Scanner;
public class Composite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


//        for(int i=2;i<=n-1;i++){
//           if(n%i==0) System.out.println("composite");
//           break;
//        }
 // wrong approch
        //if(n==1) sout("neither");
        // this was printing neither and  prime too bcz prime is only written with  if(x==0) only
        // now i ve written with else if now. only if, if fails then only  else if will run
// applying state logic
        int x =0; // instalizing as 0 means prime if becomes one then composite
        for(int i=2;i<=n-1;i++){
            if(n%i==0) {
                System.out.println("composite");
                x = 1; // compsoite
                break;

            }
        }
        if(n==1){
            System.out.println("neither prime or compsoite");
        }
        else if(x==0) {
            System.out.println("prime");
        }
    }
}


