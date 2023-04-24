class Base {
    Base() {
        System.out.println("Base Class Constructor.");
    }
    public void greet() {
        System.out.println("Greetings from base.");
    }
}
class Derived extends Base {
    Derived() {
        System.out.println("Derived Class Constructor.");
    }
    public void greet() {
        System.out.println("Greetings from derived.");
    }
}
public class Main {
    public static void main(String[] args) {
        Derived d = new Derived();
        d.greet();
    }
}

// Base Class Constructor.
// Derived Class Constructor.
// Greetings from derived.
