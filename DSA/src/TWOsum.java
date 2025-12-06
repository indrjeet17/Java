public class TWOsum {
    public static void main(String[] args) {

        int [] array = {1,2,3,1};
        int target =2 ;

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                 if(array[i]+array[j]==target){
                     System.out.println(array[i]+" "+array[j]);
                 }

            }

        }


    }
}
