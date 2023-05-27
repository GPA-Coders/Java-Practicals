class MyEx extends Exception {
    MyEx(String message){
        super(message);    
    }
}
public class practical_23 {
    public static void main(String[] args)  {
        int a = 10;
        int b = 0;
        try {
            if(b==0) {
                throw new MyEx("Divide by zero!");
            }
            int c = a/b;
            System.out.println("Result : " + c);
        }
        catch(MyEx m) {
            System.out.println(m.getMessage());
        }
    }
}
