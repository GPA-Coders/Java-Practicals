import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int r = 0;
        while(n > 0) {
            int sd = n % 10;
            r = (r * 10) + sd;
            n = n / 10;
        }
        System.out.println("Reversed number : " + r);
    }
}

// Enter number : 7143
// Reversed number : 3417
