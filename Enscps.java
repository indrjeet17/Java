class Don1{

    private int age=11;
    private String name ="manya";

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}





public class Enscps {

    public static void main(String[] args) {

        Don1 dn = new Don1();

        int res = dn.getAge();
        String str= dn.getName();

        System.out.println(dn.getAge()+" "+dn.getName());
        //System.out.println(res+ " "+str);

    }
}
