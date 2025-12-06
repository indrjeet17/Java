import java.sql.SQLOutput;

enum Status{
    Running,Falied,success,Inprocess; // all are constants as objects
}








public class Enum3 {
    public static void main(String[] args) {

        Status ss = Status.Inprocess;

        System.out.println(ss);

        System.out.println(ss.ordinal());

        Status [] sss= Status.values();
        for(Status s :sss){
            System.out.println(s + " :"+s.ordinal());
        }

    }
}
