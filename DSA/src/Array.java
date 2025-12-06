import java.util.Scanner;
public class Array {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//
//        int [] arr= new int[5];
//        // instatisling using individual elements
//
//        // arr[1]=10;
//        arr[1]=sc.nextInt();
//        System.out.println(arr[1]);

        int[] array = new int[7];

        for (int i = 0; i < 7; i++) {
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < 7; i++) {
            System.out.print(array[i]);
            ;
        }

//        int max = array[0];
//
//        for (int i = 1; i < 7; i++) {
//            if (max < array[i]) {
//                max = array[i];
//
//            }
//
//        }

    }
}

