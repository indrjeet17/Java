class Don{

    private int age ;
    private String name ;

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        //Without a parameter, we wouldn’t know what new value the user wants to store in the private variable.
        age = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
       // name = name; why?
    }
}








public class Enscps2 {

    public static void main(String[] args) {
        Don dn = new Don();


        dn.setAge(12);
        dn.setName("Daaku");
        int res = dn.getAge();
        String str= dn.getName();

        System.out.println(dn.getAge()+" "+dn.getName());
      //  System.out.println(res+ " "+str);


    }
}
