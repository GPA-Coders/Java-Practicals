class Employee {
    private int id;
    private String name;
    public Employee () {
        id = 123;
        name = "Hacker";
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
    }
    public Employee (int id,String name) {
        this.id = id;
        this.name = name;
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
    }
}
public class practical_12 {
    public static void main(String[] args) {
        Employee e = new Employee(6,"Coder");
    }
}
