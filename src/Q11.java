public class Q11 {
    /*
    1.starting from position 0 and position n-1 of int[] with length n
    2.find the area by length*min(int[0],int[n-1];
    3.compare and see the smaller one of int[0] and int[n-1]
    4.move left or right and redo step 2
        4.1 if the new area larger than previous area replace it
        4.2 if not continue
    5. whole int[] and return the final area
     */
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int i=1;
        int maxH=Math.min(height[left], height[right])*height.length-i;
        while(left<right){
            if(height[left]<=height[right]){
                left++;
            }else{
                right--;
            }
            i++;
            if(Math.min(height[left], height[right])*height.length-i>maxH){
                maxH=Math.min(height[left], height[right])*height.length-i;
            }
        }
        return maxH;
    }
}
