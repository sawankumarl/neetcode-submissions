class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right=heights.length-1;
        int maxArea =0;

        while(left < right){

            int distance =  right -left;
            int minPole = Math.min(heights[left],heights[right]);
            int area = distance * minPole;
            if(heights[left] <heights[right]){
                left++;
            }else{
                right--;
            }    
            maxArea = Math.max(area,maxArea);
        }
        return maxArea;
    }
}
