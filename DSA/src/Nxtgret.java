import java.sql.SQLOutput;

public class Nxtgret {

    public static void main(String[] args) {

        int []arr ={12,3,4,56,78,90,12,34};

        int n = arr.length;

//        int [] ans = new int[n];
//        ans[n-1]=-1;
 // brute force

//        for (int i = 0; i < n; i++) {
//
//            int max =Integer.MIN_VALUE;
//            for (int j = i+1; j < n; j++) {
//
//                  max=Math.max(max,arr[j]);
//
//            }
//            ans[i]=max;
//        }

        int nge = n-1;

        for (int i = n-2; i >=0  ; i--) {

            arr[i]=nge;
            nge=Math.max(arr[i],nge);


        }



        for(int ele : arr){
            System.out.print(ele+ " ");
        }



    }
}
