public class practical_4 {
    public static void main(String[] args) {
        int [][] mat1 = { {1, 2, 3} , {4, 5, 6} , {7, 8, 9} };
        int [][] mat2 = { {1, 2, 3} , {4, 5, 6} , {7, 8, 9} };
        int [][] result = new int [3][3];
        for (int i=0;i<mat1.length;i++) {
            for (int j=0;j<mat1[i].length;j++) {
                result[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
