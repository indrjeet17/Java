public class Minarray {
    public static void main(String[] args) {

        int []array = {2,23,22,1,44,56,-4};

        // min = array[0];
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < array.length; i++) {
            if(min>array[i]){
                min=array[i];
            }
//            min=Math.min(max,array[i]);

        }
        System.out.println(min);
    }
}
