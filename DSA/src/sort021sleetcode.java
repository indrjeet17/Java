public class sort021sleetcode {

    public static void main(String[] args) {

        int []arr= {0,1,2,0,0,1,2,0,2,1,2,0,0};

        int n= arr.length;

        int mid = 0, high =n-1,low=0;

        while(mid<=high){
            if(arr[mid]==0){
                int temp=arr[mid];
                arr[mid]=arr[low];
                arr[low]=temp;
                low++;
                mid++;
            }
            else if(arr[mid]==1) mid++;
            else {
                // if(mid==2) swap with high high --;
                int temp = arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high --;
            }

        }

     for(int i=0 ;i<n ;i++){
         System.out.print(arr[i]+ " ");
     }

    }
}
