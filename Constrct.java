class Thanos{

    private int age;
    private String name ;



    public Thanos(){
        age=12;
        name= "Mara";
    }

    public Thanos (int a , String n){
        age=a;
        name=n;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}



public class Constrct {

    public static void main(String[] args) {

        Thanos th = new Thanos();
        Thanos th1= new Thanos(13,"maatira");


        System.out.println(th.getName()+ " "+ th.getAge());
        System.out.println(th1.getName()+ " "+ th1.getAge());

    }
}
