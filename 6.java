class Student {
    private long enrollmentNo;
    private String name;
    public void setName(String n) {
        name = n;
    }
    public String getName() {
        return name;
    }
    public void setEn(int n) {
        enrollmentNo = n;
    }
    public long getEn() {
        return enrollmentNo;
    }
}
public class practical_6 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Prakhar");
        System.out.println(s.getName());
        Student s1 = new Student();
        s1.setName("Pratham");
        System.out.println(s1.getName());
        Student s2 = new Student();
        s2.setName("Tarun");
        System.out.println(s2.getName());
    }
}
