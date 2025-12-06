@FunctionalInterface
interface a12{
    int add(int i, int j);
}






public class Returnlamda {
    public static void main(String[] args) {

        a12 obj =/*new a12*/  (i,j) -> i+j;  // no return


        // or
//        {
//            return i+j;
//        };




//               {
//            @Override
//            public int add(int i, int j) {
//                return i+j;
//            }
//        };

        int res = obj.add(2,3);
        System.out.println(res);

    }
}
