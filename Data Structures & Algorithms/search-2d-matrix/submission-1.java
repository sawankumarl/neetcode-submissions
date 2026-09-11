class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       
        int rowIdx = findRow(matrix,target);
        if(rowIdx !=-1){
            return searchInRow(rowIdx,matrix,target);
        }else{
            return false;
        }
    }

    int findRow(int[][] matrix, int target) {
    int top = 0;
    int bottom = matrix.length - 1;

    while (top <= bottom) {
        int mid = top + (bottom - top) / 2;

        // Check if target lies within this row
        if (target >= matrix[mid][0] && target <= matrix[mid][matrix[mid].length - 1]) {
            return mid;
        } else if ( matrix[mid][0] < target) {
             top = mid + 1;  // target is in a later row
        } else {
             bottom = mid - 1; // target is in an earlier row 
        }
     }
    return -1;
    }

     }
    boolean searchInRow(int rowIdx ,int matrix[][] ,int target){
        int left=0;
        int right=matrix[rowIdx].length -1;

        while(left <= right){
            int mid =left+(right-left)/2;
            if(matrix[rowIdx][mid] == target){
                return true;
            }

            if(matrix[rowIdx][mid] < target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return false;
    }


