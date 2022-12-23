import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {

        Solution solution = new Solution();

        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        solution.rotateMatrix(matrix);
    }
    boolean rotateMatrix(int[][]matrix){
        if(matrix.length==0||matrix.length!=matrix[0].length){
            return false;
        }

        int N = matrix.length;
        for (int i = 0; i < N; i++) {
            for (int j = i; j <N ; j++) {
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j]=matrix[i][N-1-j];
                matrix[i][N-1-j]=temp;
            }
        }
        System.out.println(Arrays.deepToString(matrix));
        return true;
    }
}
