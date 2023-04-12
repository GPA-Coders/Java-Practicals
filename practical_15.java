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
class Child extends Derived {
    Child () {
        System.out.println("Constructor Of The Child Class.");
    }
}
public class practical_15 {
    public static void main(String[] args) {
        Child c = new Child();
    }
}
