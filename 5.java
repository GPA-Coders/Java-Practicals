import java.util.*;

public class Main {
    static boolean prime(int n) {
        if(n <= 1) {
            return false;
        }
        for(int i=2;i<n;i++) {
            if((n%i) == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        for (int i=1;i<=n;i++) {
            if(prime(i)){
                System.out.print(i + " ");
            }
        }
    }
}

// Enter n : 10
// 2 3 5 7
