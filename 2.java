import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.print("Enter a : ");
        a = sc.nextInt();
        System.out.print("Enter b : ");
        b = sc.nextInt();
        System.out.print("Enter c : ");
        c = sc.nextInt();

        if(a > b && a > c){
            System.out.println(a + " is max");
        }
        else if(a > b && a > c){
            System.out.println(b + " is max");
        }
        else{
            System.out.println(c + " is max");
        }
    }
}
