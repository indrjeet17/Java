public class twopointers {

    public static void main(String[] args) {

        int[]array={1,2,3,4,5,6,7};
        int n = array.length;

        // int i=0,j=n-1;
         int i=1 ,j=5;

        while(i<j){
            int temp = array[i];
            array[i]=array[j];
            array[j]=temp;
            i++;
            j--;

        }

        for (int ele : array){
            System.out.print(ele+ " ");
        }

    }
}

