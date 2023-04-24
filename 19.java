interface Base {
    void m1();
    void m2();
}
interface Derived {
    void m3();
    void m4();
}
class Sample implements Base, Derived {
    public void m1() {
        System.out.println("Method 1");
    }
    public void m2() {
        System.out.println("Method 2");
    }
    public void m3() {
        System.out.println("Method 3");
    }
    public void m4() {
        System.out.println("Method 4");
    }

}
public class Main {
    public static void main(String[] args) {
        Sample s = new Sample();
        s.m1();
        s.m2();
        s.m3();
        s.m4();
    }
}

// Method 1
// Method 2
// Method 3
// Method 4
