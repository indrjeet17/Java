class A7
{
   public void show(){

       System.out.println("In A7 show");


   } // making a class to overide this show method having no other use  then go for inner anoyouous class

}

public class AnonymousInner
{

    public static void main(String[] args)
    {
        A7 obj = new A7()
        {
            @Override
            public void show() {
                System.out.println(" In A ananyomius  inner class show");
            }
        };


        obj.show();

    }


}
