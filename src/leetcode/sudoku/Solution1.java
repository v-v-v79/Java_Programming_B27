package leetcode.sudoku;

import java.util.HashMap;
import java.util.Map;

public class Solution1 {
    public static boolean isValidSudoiteratoru(char[][] board) {

        Map<Character, Integer> map = new HashMap<>();
        int arrayIndex = 0;
        int elementIndex = 0;
        int raws = 3;
        int columns = 3;
        while (arrayIndex < raws) {
            while (elementIndex < columns) {
                if (board[arrayIndex][elementIndex] != '.') {
                    map.put(board[arrayIndex][elementIndex], map.getOrDefault(board[arrayIndex][elementIndex], 0) + 1);
                    System.out.println(map);
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
        System.out.println("arrayIndex = " + arrayIndex);
        System.out.println("elementIndex = " + elementIndex);
        map.clear();

        arrayIndex = 0;
        elementIndex = 3;
        raws = 3;
        columns = 6;
        while (arrayIndex < raws) {
            while (elementIndex < columns) {
                if (board[arrayIndex][elementIndex] != '.') {
                    map.put(board[arrayIndex][elementIndex], map.getOrDefault(board[arrayIndex][elementIndex], 0) + 1);
                    System.out.println(map);
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
        System.out.println("arrayIndex = " + arrayIndex);
        System.out.println("elementIndex = " + elementIndex);
        map.clear();

        arrayIndex = 0;
        elementIndex = 6;
        raws = 3;
        columns = 9;
        while (arrayIndex < raws) {
            while (elementIndex < columns) {
                if (board[arrayIndex][elementIndex] != '.') {
                    map.put(board[arrayIndex][elementIndex], map.getOrDefault(board[arrayIndex][elementIndex], 0) + 1);
                    System.out.println(map);
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
        System.out.println("arrayIndex = " + arrayIndex);
        System.out.println("elementIndex = " + elementIndex);
        map.clear();

        arrayIndex = 3;
        elementIndex = 0;
        raws = 6;
        columns = 3;
        while (arrayIndex < raws) {
            while (elementIndex < columns) {
                if (board[arrayIndex][elementIndex] != '.') {
                    map.put(board[arrayIndex][elementIndex], map.getOrDefault(board[arrayIndex][elementIndex], 0) + 1);
                    System.out.println(map);
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
        System.out.println("arrayIndex = " + arrayIndex);
        System.out.println("elementIndex = " + elementIndex);
        map.clear();

        arrayIndex = 3;
        elementIndex = 3;
        raws = 6;
        columns = 6;
        while (arrayIndex < raws) {
            while (elementIndex < columns) {
                if (board[arrayIndex][elementIndex] != '.') {
                    map.put(board[arrayIndex][elementIndex], map.getOrDefault(board[arrayIndex][elementIndex], 0) + 1);
                    System.out.println(map);
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
        System.out.println("arrayIndex = " + arrayIndex);
        System.out.println("elementIndex = " + elementIndex);
        map.clear();

        arrayIndex = 3;
        elementIndex = 6;
        raws = 6;
        columns = 9;
        while (arrayIndex < raws) {
            while (elementIndex < columns) {
                if (board[arrayIndex][elementIndex] != '.') {
                    map.put(board[arrayIndex][elementIndex], map.getOrDefault(board[arrayIndex][elementIndex], 0) + 1);
                    System.out.println(map);
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
        System.out.println("arrayIndex = " + arrayIndex);
        System.out.println("elementIndex = " + elementIndex);
        map.clear();

        arrayIndex = 6;
        elementIndex = 0;
        raws = 9;
        columns = 3;
        while (arrayIndex < raws) {
            while (elementIndex < columns) {
                if (board[arrayIndex][elementIndex] != '.') {
                    map.put(board[arrayIndex][elementIndex], map.getOrDefault(board[arrayIndex][elementIndex], 0) + 1);
                    System.out.println(map);
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
        System.out.println("arrayIndex = " + arrayIndex);
        System.out.println("elementIndex = " + elementIndex);
        map.clear();

        arrayIndex = 6;
        elementIndex = 3;
        raws = 9;
        columns = 6;
        while (arrayIndex < raws) {
            while (elementIndex < columns) {
                if (board[arrayIndex][elementIndex] != '.') {
                    map.put(board[arrayIndex][elementIndex], map.getOrDefault(board[arrayIndex][elementIndex], 0) + 1);
                    System.out.println(map);
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
        System.out.println("arrayIndex = " + arrayIndex);
        System.out.println("elementIndex = " + elementIndex);
        map.clear();

        arrayIndex = 6;
        elementIndex = 6;
        raws = 9;
        columns = 9;
        while (arrayIndex < raws) {
            while (elementIndex < columns) {
                if (board[arrayIndex][elementIndex] != '.') {
                    map.put(board[arrayIndex][elementIndex], map.getOrDefault(board[arrayIndex][elementIndex], 0) + 1);
                    System.out.println(map);
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
        System.out.println("arrayIndex = " + arrayIndex);
        System.out.println("elementIndex = " + elementIndex);
        map.clear();
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
        System.out.println(isValidSudoiteratoru(chars));
    }
}
/*
[
 [".",".","4",".",".",".","6","3","."]
,[".",".",".",".",".",".",".",".","."]
,["5",".",".",".",".",".",".","9","."]
,[".",".",".","5","6",".",".",".","."]
,["4",".","3",".",".",".",".",".","1"]
,[".",".",".","7",".",".",".",".","."]
,[".",".",".","5",".",".",".",".","."]
,[".",".",".",".",".",".",".",".","."]
,[".",".",".",".",".",".",".",".","."]]
 */
