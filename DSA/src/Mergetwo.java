public class Mergetwo {

    public static void main(String[] args) {

        int []a = {10,20,30,40};
        int [] b ={50,60,70,80,90};
      //  int n = a.length,m= b.length;
        int[]c =new int[a.length+b.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]){
                c[k]=a[i];
                k++;
                i++;
            }
            else{
                c[k]=b[j];
                j++;
                k++;
            }

            if(i==a.length) {
                while(j<b.length){
                    c[k]=b[j];
                    j++;
                    k++;

                }
            }
            if(j==b.length) {
                while(i<a.length){
                    c[k]=a[i];
                    i++;
                    k++;

                }
            }


        }
        for(int t : c){
            System.out.print(t+ " ");
        }


    }
}
