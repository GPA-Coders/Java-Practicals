import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [][] a = new int[3][3];
        int [][] b = new int[3][3];
        int [][] c = new int[3][3];

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print("Enter element at a[" + i + "][" + j + "] : ");
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print("Enter element at b[" + i + "][" + j + "] : ");
                b[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}

// Enter element at a[0][0] : 1
//            ...
// Enter element at a[2][2] : 9

// Enter element at b[0][0] : 1
//            ...
// Enter element at b[2][2] : 9
// 2 4 6 
// 8 10 12
// 14 16 18
