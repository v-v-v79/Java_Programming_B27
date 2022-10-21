package leetcode.sudoku;

import java.util.*;

public class Solution2_works {
    public static boolean isValidSudoku(char[][] board) {

        Map<Character, Integer> map = new HashMap<>();
        int arrayIndex = 0;
        int elementIndex = 0;
        int raws = 3;
        int columns = 3;
        int iterator = 0;
        while (iterator < 9) {
            while (arrayIndex < raws) {
                while (elementIndex < columns) {
                    if (board[arrayIndex][elementIndex] != '.') {
                        map.put(board[arrayIndex][elementIndex],
                                map.getOrDefault(board[arrayIndex][elementIndex], 0) + 1);
                        //System.out.println(map);
                    }
                    if (map.containsValue(2)) {
                        System.out.println(map);
                        return false;
                    }
                    elementIndex++;
                }
                arrayIndex++;
                elementIndex -= 3;
            }
            System.out.println("map = " + map);
            map.clear();
            iterator++;
            arrayIndex -= 3;
            if (iterator % 3 == 0) {
                elementIndex = 0;
                columns = 3;
                arrayIndex += 3;
                raws += 3;
            } else {
                elementIndex += 3;
                columns += 3;
            }
        }
        System.out.println("_________________________________");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] != '.') {
                    map.put(board[i][j],
                            map.getOrDefault(board[i][j], 0) + 1);
                    //System.out.println(map);
                }
                if (map.containsValue(2)) {
                    System.out.println(map);
                    return false;
                }
            }
            System.out.println(map);
            map.clear();
        }
        System.out.println("_______________________________");
        for (int c = 0; c < board.length; c++) {
            for (int r = 0; r < board.length; r++) {
                if (board[r][c] != '.') {
                    map.put(board[r][c],
                            map.getOrDefault(board[r][c], 0) + 1);
                }
                if (map.containsValue(2)) {
                    System.out.println(map);
                    return false;
                }
            }
            System.out.println(map);
            map.clear();
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
