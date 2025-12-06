public class Reversearray {
    public static void main(String[] args) {
        int []array = {10,20,30,40,50,60,70};

        int n = array.length;
       // for (int i = 0; i < n/2; i++) can swap again after passing middle
        for (int i = 0; i < n/2; i++) {

            int j = n-1-i;
            int temp = array[i];
            array[i]=array[j];
            array[j]=temp;
        }

        for(int ele : array){
            System.out.print(ele+ " ");
        }
    }
}
