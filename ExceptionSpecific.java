




public class ExceptionSpecific {

    public static void main(String[] args) {



        int [] num = new int[4];

        int i=0;
        int j=0;

        try{
             j=18/i;
            System.out.println(num[5]);
        }
    // if dont know about the exception in specfic declare exception class at last so it will get that

        catch(ArithmeticException obj){
            System.out.println(" gantik gotala " +obj);
        }

        catch (ArrayIndexOutOfBoundsException obj ){
            System.out.println(" Array out of bound ahe bc ");
        }
        catch (Exception obj){
            System.out.println(" Savrjanik ");
        }

        System.out.println(j); // but solved the prblm not went out from excuatation




    }
}


