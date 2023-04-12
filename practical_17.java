class Base {
    Base() {
        System.out.println("Base Class Constructor.");
    }
    public void greet() {
        System.out.println("Hello EveryOne...");
    }
}
class Derived extends Base {
    Derived() {
        System.out.println("Derived Class Constructor.");
    }
    public void greet() {
        System.out.println("Good Morning...");      //method overidden
    }
}
public class practical_17 {
    public static void main(String[] args) {
        Derived d = new Derived();
        d.greet();
    }
}
