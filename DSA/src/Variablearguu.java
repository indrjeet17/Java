import java.util.Arrays;

public class Variablearguu {
    public static void main(String[] args) {

   argus1(1,23,4,4,5,6,7,8,10);
    }


    static void argus1(int...v){
        // only three dots
        System.out.println(Arrays.toString(v));

    }
}
