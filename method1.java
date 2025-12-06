class Demo{

    public String Getpen(int cost){

        return  "pen";
    }


}











public class method1 {
    public static void main(String[] args) {

        Demo dm = new Demo();

        String result =dm.Getpen(10);
        System.out.println(result);

       //  System.out.println(Getpen(10));   ///  wrong way // java: cannot find symbol
                                                           //  symbol:  method Getpen(int)
                                                          //   location: class method1


        System.out.println(dm.Getpen(10)); // correct way
    }
}
