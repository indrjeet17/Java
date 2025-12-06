public class Throwkey {
    public static void main(String[] args) {


        int i=20;
        int j = 0;

        try{
            j=18/i; // will give zero so we handled that and catch can change the answer ,throw is for
            // printing what acqully happen wrong
            if(j==0)
            throw new ArithmeticException("Cant give 1.11 in Answer bcz of int so handled");

        }
        catch (ArithmeticException Obj ){
            j=1;
            System.out.println(" Hmmm !!! Something is wrong " +Obj);
        }
        System.out.println(j);

    }
}
