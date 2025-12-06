public class tryOF021ssort {
    public static void main(String[] args) {


        int []arr ={0,2,1,0,1,2,1,0,0,2,2,2,1};

        int n = arr.length;

            int noOFzeros =0, noOfones=0; // noOFtws=0;
          // treaverse
            for(int i=0;i<n; i++){
                if(arr[i]==0) noOFzeros++;          //  or    if(arr[i]==0) noOFzeros++;
                if(arr[i]==1) noOfones++;           //       else if(arr[i]==1) noOfones++;

               // if(arr[i]==2) noOFtws++;
        }
//            for(int i = 0;i<noOFzeros;i++){
//                arr[i]=0;
//
//                 }
//
//        for(int i=noOFzeros;i<noOfones+noOfones;i++){
//            arr[i]=1;
//
//        }
//
//        for(int i = noOFzeros+noOfones;i<n;i++){
//            arr[i]=2;
//
//        }
           for(int i=0;i<n;i++){
               if(i<noOFzeros) arr[i]=0;
               else if( i<noOFzeros+noOfones) arr[i]=1; // if( i<noOFzeros+noOfones) arr[i]=1 this code will give result like 111112222 no zeros cause first will get true and second cond also need
               // need to write else if bcz else if will give two condition separate treatment
               else arr[i]=2;
           }

        for(int ele : arr){
            System.out.print(ele+ " ");
        }


    }
}
