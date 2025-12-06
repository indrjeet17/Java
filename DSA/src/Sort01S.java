public class Sort01S {
    public static void main(String[] args) {

        int[] array = {0, 0, 1, 1, 1, 1, 1, 0, 0};
        int n = array.length;
// without no fo zeros
        //    int noOFzeros= 0; //noOFones=0;
//
//
//        for(int i=0;i<n;i++){
//            if(array[i]==0) noOFzeros++;
//            //else noOFones ++;


//        }
//      for(int i=0;i<noOFzeros;i++){
//            array[i]=0;
//        }
//
//        for(int i=noOFzeros;i<n;i++){
//            array[i]=1;
//        }

        // by second method
//        for(int i=0;i<n;i++){
//             if(i<noOFzeros) array[i]=0;
//             else array[i]=1;
//
//        }

// second method /// //////////// /////////////////////////// ///////////

        int j = n - 1, i = 0;

//        while (j > i) {
//            if (array[i] == 0) i++;
//            if (array[j] == 1) j--;
//            if (i > j) break;
//            if (array[i] == 1 && array[j] == 0) {
//                int temp = array[i];
//                array[i] = array[j];
//                array[j] = temp;
////             i++;
////             j--;
//
//            }
//        }

            while (j > i) {
                if (array[i] == 0) i++;
                else if (array[j] == 1) j--;
                    //if(i>j) break;
                else if (array[i] == 1 && array[j] == 0) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
//             i++;
//             j--;

                }
        }


                for (int ele : array) {
                    System.out.print(ele + " ");
                }

            }

    }