
class student
{

 int rollno;
 String name;

 int marks;

}

public class ArrayofObject {

    public static void main(String[] args) {

        student std = new student();

        std.name="indrajeet";
        std.marks=90;
        std.rollno=88;

        student std1 = new student();

        std1.name="indra";
        std1.marks=91;
        std1.rollno=45;

        student std2 = new student();

        std2.name="Don";
        std2.marks=67;
        std2.rollno=48;
//
        System.out.println(std );
        System.out.println(std.name);
        System.out.println(std1.name);




    // array of objects
       student array[]= new student[3];

       array[0]=std;
       array[1]=std1;
       array[2]=std2;


        for (int i = 0; i <array.length; i++) {

            System.out.print(array[i].name+ " " +array[i].marks+ " "+array[i].rollno) ;
            System.out.println();

        }


        System.out.println(array[1]);
    }
}
