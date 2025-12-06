

import others.*;

class Asch extends A{

    public void nhii(){

      System.out.println(man); //  proctected in other package but  in subclass 
       System.out.println(women); // we can not accesse daefult in sub class in other pacakages

    }
}


public class Demo1{

    public static void main(String[] args) {
        System.out.println("hii");

             //Calc c=new Calc(); // in this way we can create of that calc class .class file 

         
        // class file of calc is created when it was sepeate java file , when it was
        // in same java file then it was created
        // means every class has its own .class file
        
        // AdvCalc cv= new AdvCalc();
        // int r1=cv.add(1,2);
        //  int r2=cv.sub(1,2);
        //  int r3 = cv.div(1, 2);

        //  System.out.println(r1+ " "+r2+" "+r3);


        ScienticCalc sc = new ScienticCalc();

        // int r1= sc.add(1, 2);

        //  int r2 = sc.div(12, 13);

        // double r3 = sc.power(2, 3);
           
        // int r4 =sc.add(2, 3);

        // System.out.println(r4);

        // System.out.println(r3+ " "+r2);
          

    //     Calcu cc = new Calcu();

    //    int r = cc.add(1, 2);
    //      System.out.println(r);


     A aa = new A();

     System.out.println(aa.marks); // "message": "marks is not public in A; cannot be accessed from outside package",
    //  after 
   
     B bb = new B();
     
     System.out.println(bb.marks);  //  deafult marks can be accsesed in Same packages

   



     



    }
}