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
public class practical_14 {
    public static void main(String[] args) {
        Derived d = new Derived();
    }
}
