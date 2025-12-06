public class Maxarray {

    public static void main(String[] args) {
        int []array = {-1,-2,-22,-22,-44,-56,-88};
//        int max = -1;
//        int max = array[0];
        int max =Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
//            if(array[i]>max){
//                max=array[i];
//            }
            max=Math.max(max,array[i]);

        }
        System.out.println(max);
    }
}
