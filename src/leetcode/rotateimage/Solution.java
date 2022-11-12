package leetcode.rotateimage;

public class Solution {
    public void rotate(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            int temp = 0;
            for (int j = 0; j < matrix.length; j++) {
                temp = matrix[i][matrix.length - 1];
                matrix[i][matrix.length - 1] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }

    }
}
