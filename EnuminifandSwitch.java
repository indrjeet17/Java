enum Status1{
    Running,Falied,success,Inprocess; // all are constants as objects
}








public class EnuminifandSwitch {

    public static void main(String[] args) {
        Status s = Status.success;

//        if(s== Status.success) System.out.println("yu ve done it");
//        else if (s== Status.Falied) System.out.println(" bhava nanatar try kar");
//        else if (s== Status.Inprocess) System.out.println(" chalu hain");
//        else System.out.println(" smapla");


        switch (s) {
            case Running:
                System.out.println("kahbbdi");
                break;

            case Falied:
                System.out.println("chall");
                break;

            case success:
                System.out.println(" donnn");
                break;

            default:
                System.out.println("jahla");

        }
    }

}
