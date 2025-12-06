abstract class A8
{
    public abstract void show();

}

// no need to create b8 and extend it in it i are creatng class only for
// extending so pls use inner class






public class AbstarctAnonymous
{
    public static void main(String[] args)
    {

        A8 obj = new A8() // here we will create obj of anonymous inner class not abstract A8
        {
            @Override
            public void show() {
                System.out.println(" In inner show");
            }
        };

        obj.show();


    }
}
