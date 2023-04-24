class Base {
    Base () {
        System.out.println("Constructor Of The Base Class.");
    }
}
class Derived extends Base {
    Derived () {
        System.out.println("Constructor Of The Derived Class.");
    }
}
class Child extends Base {
    Child () {
        System.out.println("Constructor Of The Child Class.");
    }
}
public class Main {
    public static void main(String[] args) {
        Derived d = new Derived();
        Child c = new Child();
    }
}

// Constructor Of The Base Class.
// Constructor Of The Derived Class.
// Constructor Of The Base Class.
// Constructor Of The Child Class.
