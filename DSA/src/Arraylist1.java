import java.util.ArrayList;

public class Arraylist1 {
    public static void main(String[] args) {

        ArrayList <Integer> arr = new ArrayList<>(8);

        arr.add(0,20);
        arr.add(1,30);
        arr.add(2,40);
        arr.add(3,50);
        arr.add(4,60);

        System.out.println(arr);
        System.out.println(arr.size()+" array size");
        System.out.println(arr.get(3) +"  index no 3 ");
        System.out.println(arr.getFirst() +"  first ele ");

        // output
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i)+" ");

        }

        System.out.println();

        // modify

        arr.set(2,200);
        System.out.println(arr.get(2));

        arr.add(500);

        System.out.println(arr);
        System.out.println(arr.size() +"  Array size");
    }
}
