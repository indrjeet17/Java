import java.util.Arrays;

public class copyOfArray {

    public static void main(String[] args) {

        int []arr = {1,34,5,6,7,8,9,0};

        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();// for new line

        int []nums = arr; // shallow copy like same array and two references

//        for (int i = 0; i < nums.length ; i++) {
//            System.out.print(nums[i]+ " ");
//
//        }
        // but if we change nums it will change arr too

        nums[0]=70;
       // System.out.println(arr[0]);

        for (int ele : arr){
            System.out.print(ele+ " ");
        }


        System.out.println();

         /// deep copy

        int [] brr = Arrays.copyOf(arr,arr.length);

        for(int ele : brr){
            System.out.print(ele+ " ");
        }
        System.out.println();
        brr[0]=90;


        // no cahnge arra only in brr
        for(int ele : arr){
            System.out.print(ele+ " ");
        }


        System.out.println();

        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i]+"  ");

        }

    }
}
