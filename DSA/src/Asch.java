import  java.util.Scanner;

public class Asch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int lastdigit;
        int sum=0;
        while(n!=0){
            lastdigit=n%10;
            sum=sum+lastdigit;
             n=n/10;
        }
        System.out.println(sum);


    }
}
