class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
         int low=0;
         int n=matrix.length*matrix[0].length;
         int high=n-1;
         while(low<=high){
            int mid=(low+high)/2;
            int x=(mid/matrix[0].length);
            int y=(mid%matrix[0].length);
            if(matrix[x][y]==target) return true;
            else if(matrix[x][y]<target) low=mid+1;
            else high=mid-1;
         }
         return false;
    }
}