
class Human{

    private int age ;
    private String name ;

    public int getAge() {
        return age;
    }

    public void setAge(int age, Human obj /*a */) {
        //Without a parameter, we wouldn’t know what new value the user wants to store in the private variable.
        // age = a;
        //age = age; assigning value  to itself,  age is local variable, no value in object instance variable
        //Human obj = new Human();
       // obj.age=age;
        // u cant initaite this object and this object and object in main are different

        //Human obj1=obj;
        // obj1.age=age;
        // or
       // obj.age=age;

         this.age=age;

    }



    public String getName() {
        return name;
    }

    public void setName(String naam /*name*/) {
        // name = name; why? return null bcz no vallue assigned in object instance variable that local variable pointing to itself
        name=naam;
    }
}



public class  This {


    public static void main(String[] args) {


        Human obj = new Human();
        obj.setAge(12,obj); // instead of passing obj use this keyword
        obj.setName("Daaku");
        int res = obj.getAge();
        String str= obj.getName();

        System.out.println(obj.getAge()+" "+obj.getName());
        //  System.out.println(res+ " "+str);

    }
}
