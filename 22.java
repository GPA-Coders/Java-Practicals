package First;
public class practical_22 {
    public void greet(){
        System.out.println("Hello");
    }
}


// Demo.java
package Second;
import First.*;
public class Demo {
    public static void main(String[] args) {
        practical_22 obj = new practical_22();
        obj.greet();
    }
}
