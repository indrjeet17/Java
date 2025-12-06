class Calc{

    public int add(int n , int n1){
        return n+n1;
    }
}

class AdvCalc extends Calc{
    @Override
    public int add(int n , int n1){

        return n+n1+1;
    }
}







public class OverridingMthd {

    public static void main(String[] args) {


        AdvCalc ad = new AdvCalc();

        int r1= ad.add(1,2);

        System.out.println(r1);


    }
}
