public class Trianglepattern {
    public static void main(String[] args) {


        for (int i = 0; i <5 ; i++) { // no of rows
            for (int j = 0; j <=i ; j++) { // no of columns
                System.out.print("*");

            }
            System.out.println();

        }

        // savtta logic lavl yoooo even rows la character

        for (int i = 1; i <5 ; i++) { // no of rows
            for (int j = 1; j <=i ; j++) { // no of columns
                if(i%2==0) System.out.print((char)(j+64) +"");
                else System.out.print(j);

            }
            System.out.println();

        }

  // savtta lavl logic rada naad banti jorat
        for (int i = 0; i <4 ; i++) { // no of rows
            for (int j = 4; j >i ; j--) { // no of columns
                System.out.print("*");

            }
            System.out.println();

        }

//        for (int i = 0; i <4 ; i++) { // no of rows
//            for (int j = 4; j >i ; j--) { // no of columns
//                System.out.print(j);
//// logic chuktay 4 yetoy start la
//            }
//            System.out.println();
//
//        }
        // n= 4
        for (int i = 1; i <=4 ; i++) { // no of rows
            for (int j = 1; j <= 4+1-i ; j++) { // no of columns
                System.out.print(j);

            }
            System.out.println();

        }


        for (int i = 1; i <=5 ; i++) { // no of rows
            for (int j = 1; j <=i ; j++) { // no of columns
                System.out.print((2*j)-1);

            }
            System.out.println();

        }


        // best code

        for (int i = 1; i <=5 ; i++) { // no of rows
            int a=1; // a=0 will print even triangle
            for (int j = 1; j <=i ; j++) { // no of columns
                System.out.print(a);
                a=a+2;
            }
            System.out.println();

        }
//
//        for (int i = 0; i <5 ; i++) { // no of rows
//            int a =a+1;
//            for (int j =0 ; j <=i ; j++) { // no of columns
//                System.out.print(a);
//
//            }
//            System.out.println();
//
//        }
int a=1;
        for (int i = 0; i <4 ; i++) { // no of rows
            for (int j = 0; j <=i ; j++) { // no of columns
                System.out.print(a + " ");
                a++;
            }
        System.out.println();

        }


    }
}
