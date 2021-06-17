public class Q240 {
    /*
        since matrix is in descending order
        search from left to right to find the number smaller but closest to target
        search from top to bottom to find the number smaller but closest to target
        if the target number is find return true
        else return false
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        int col = matrix[0].length-1;
        int row = 0;
        while(col >= 0 && row <= matrix.length-1) {
            if(target == matrix[row][col]) {
                return true;
            } else if(target < matrix[row][col]) {
                col--;
            } else if(target > matrix[row][col]) {
                row++;
            }
        }
        return false;
    }
}
