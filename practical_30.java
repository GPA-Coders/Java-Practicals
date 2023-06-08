import java.util.*;
public class practical_30 {
    public static void main(String[] args) {
        HashMap<String,String> ename = new HashMap<String,String>();
        ename.put("1", "John");
        ename.put("2", "Jack");
        ename.put("06", "Pratham");
        ename.put("37", "Prakhar");
        ename.put("221", "Tarun");
        System.out.println(ename.get("1"));
        System.out.println(ename.get("2"));
        System.out.println(ename.get("06"));
        System.out.println(ename.get("37"));
        System.out.println(ename.get("221"));
    }
}
// John
// Jack   
// Pratham
// Prakhar
// Tarun