import java.util.HashSet;
import java.util.Set;

public class Q36 {
    /*
    use a hashset to keep track of the number and its position
    let a number at row 4 be (number)4
    let a number at column 4 be 4(number)
    let a number at top left corner be 0(number)0
    use two for loop to travel the array and keep track of number
    if a number's position failed to be added to a hashset(repeat exist)
    sudoku fails and return false
    else return true
     */
    public boolean isValidSudoku(char[][] board) {
        Set traveled = new HashSet();
        for (int i=0; i<9; ++i) {
            for (int j=0; j<9; ++j) {
                if (board[i][j] != '.') {
                    String b = "(" + board[i][j] + ")";
                    if (!traveled.add(b + i) || !traveled.add(j + b) || !traveled.add(i/3 + b + j/3))
                        return false;
                }
            }
        }
        return true;
    }
}
