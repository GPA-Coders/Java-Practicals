class Car {
    private int topSpeed;
    private String name;
    public void settopSpeed(int s) {
        this.topSpeed = s;
    }
    public int gettopSpeed() {
        return topSpeed;
    }
    public void setname(String n) {
        this.name = n;
    }
    public String getname() {
        return name;
    }
    @Override
    public String toString() {
        return "topSpeed is : " + topSpeed + " and name is : " + name;
    }
}
public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.setname("Ford");
        c1.settopSpeed(15);
        System.out.println(c1.toString());
        Car c2 = new Car();
        c2.setname("MG");
        c2.settopSpeed(20);
        System.out.println(c2.toString());
        Car c3 = new Car();
        c3.setname("Tigor");
        c3.settopSpeed(20);
        System.out.println(c3.toString());
        Car c4 = new Car();
        c4.setname("Creta");
        c4.settopSpeed(30);
        System.out.println(c4.toString());
        Car c5 = new Car();
        c5.setname("Audi");
        c5.settopSpeed(35);
        System.out.println(c5.toString());
    }
}

// topSpeed is : 15 and name is : Ford
// topSpeed is : 20 and name is : MG
// topSpeed is : 20 and name is : Tigor
// topSpeed is : 30 and name is : Creta
// topSpeed is : 35 and name is : Audi
