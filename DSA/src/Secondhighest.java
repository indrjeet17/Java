import java.util.Scanner;

public class Secondhighest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [] array = {1,2,3,4,5,6,7,8};

        int max = Integer.MIN_VALUE;
        for (int i=0 ;i< array.length;i++){
            if(max<array[i]){
                max=array[i];
               // max=Math.max(max,array[i]);
            }
        }
        System.out.println(max);

        int smax= Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if(smax<array[i] && array[i]!=max){
                smax=array[i];

                // smax=Math.max(smax,array[i]);
            }

        }

        System.out.println(smax);


    }
}
