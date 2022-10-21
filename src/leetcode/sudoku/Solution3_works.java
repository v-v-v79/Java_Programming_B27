package leetcode.sudoku;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class Solution {
    public static boolean isValidSudoku(char[][] board) {
        int N = 9;

        // Use hash set to record the status
        HashSet<Character>[] rows = new HashSet[N];
        HashSet<Character>[] cols = new HashSet[N];
        HashSet<Character>[] boxes = new HashSet[N];

        System.out.println("rows = " + Arrays.toString(rows));
        System.out.println("cols = " + Arrays.toString(cols));
        System.out.println("boxes = " + Arrays.toString(boxes));
        System.out.println("**********************************");

        for (int r = 0; r < N; r++) {
            rows[r] = new HashSet<Character>();
            cols[r] = new HashSet<Character>();
            boxes[r] = new HashSet<Character>();
        }
        System.out.println("rows = " + Arrays.toString(rows));
        System.out.println("cols = " + Arrays.toString(cols));
        System.out.println("boxes = " + Arrays.toString(boxes));
        System.out.println("**********************************");


        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                char val = board[r][c];

                // Check if the position is filled with number
                if (val == '.') {
                    continue;
                }

                // Check the row
                if (rows[r].contains(val)) {
                    return false;
                }
                rows[r].add(val);
                System.out.println("rows = " + Arrays.toString(rows));


                // Check the column
                if (cols[c].contains(val)) {
                    return false;
                }
                cols[c].add(val);
                System.out.println("cols = " + Arrays.toString(cols));


                // Check the box
                int idx = (r / 3) * 3 + c / 3;
                if (boxes[idx].contains(val)) {
                    return false;
                }
                boxes[idx].add(val);
                System.out.println("boxes = " + Arrays.toString(boxes));

            }
        }
        return true;
    }



    public static void main(String[] args) {
        char[][] chars = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

        char[][] chars1 = {
                {'.', '.', '4', '.', '.', '.', '6', '3', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'5', '.', '.', '.', '.', '.', '.', '9', '.'},
                {'.', '.', '.', '5', '6', '.', '.', '.', '.'},
                {'4', '.', '3', '.', '.', '.', '.', '.', '1'},
                {'.', '.', '.', '7', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '5', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'}};

        System.out.println(isValidSudoku(chars1));
    }
}
/*
[
 ['.','.','4','.','.','.','6','3','.']
,['.','.','.','.','.','.','.','.','.']
,['5','.','.','.','.','.','.','9','.']
,['.','.','.','5','6','.','.','.','.']
,['4','.','3','.','.','.','.','.','1']
,['.','.','.','7','.','.','.','.','.']
,['.','.','.','5','.','.','.','.','.']
,['.','.','.','.','.','.','.','.','.']
,['.','.','.','.','.','.','.','.','.']
]
 */
/*
[
 ['.','.','4','.','.','.','6','3','.']
,['.','.','.','.','.','.','.','.','.']
,['5','.','.','.','.','.','.','9','.']
,['.','.','.','5','6','.','.','.','.']
,['4','.','3','.','.','.','.','.','1']
,['.','.','.','7','.','.','.','.','.']
,['.','.','.','5','.','.','.','.','.']
,['.','.','.','.','.','.','.','.','.']
,['.','.','.','.','.','.','.','.','.']]
 */
