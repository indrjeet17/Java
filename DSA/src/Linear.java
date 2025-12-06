import java.util.Scanner;

public class Linear {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        System.out.println("enter target");
        int x = sc.nextInt();

        System.out.println("enter size of array");
        int siz = sc.nextInt();

        int[] array = new int[siz];

        System.out.println("enter array");

        for(int i=0 ; i<siz;i++){
            array[i]=sc.nextInt();
        }

        boolean flag = false;
        for(int i=0; i<siz ;i++){
            if(array[i]==x) {
                flag = true;

            }
        }
        if(flag == true) {
            System.out.println("found");
        } else{
            System.out.println("not found");
        }


    }
}
