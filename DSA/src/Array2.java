
import java.util.Scanner;
public class Array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr = new int[5];

        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();

        }
 int sum=0;

        for(int i=0;i< arr.length;i++) {

            sum = sum + arr[i];
            // System.out.println(sum);

        }
        System.out.println(sum);


    }
}
