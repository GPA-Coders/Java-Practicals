public class practical_5 {
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
        int n = 10;
        for (int i=1;i<=n;i++) {
            if(prime(i)){
                System.out.println(i + " ");
            }
        }
    }
}