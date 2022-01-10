public class Q59 {
    public int[][] generateMatrix(int n) {
        int[][] result=new int[n][n];
        int count=1;
        int row=0,column=0;
        int dir=1;
        while(count<=n*n){
            result[row][column]=count++;
            if(dir==1&column+1<n){
                if(result[row][column+1]==0){
                    column++;
                }
            }else{
                dir=2;
            }
            if(dir==2&row+1<n){
                if(result[row+1][column]==0){
                    row++;
                }
            }else{
                dir=3;
            }
            if(dir==3&column-1>=0){
                if(result[row][column-1]==0){
                    column--;
                }
            }else{
                dir=4;
            }
            if(dir==4&row-1>=0){
                if(result[row-1][column]==0){
                    row--;
                }
            }else{
                dir=1;
            }
        }
        return result;
    }
}
