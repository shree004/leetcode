class Solution {
    public void markcolumn(int[][] nums,int n){
        for(int i=0;i<nums.length;i++){
            nums[i][n]=0;
        }
    }
    public void markrow(int[][] nums,int m){
        for(int i=0;i<nums[0].length;i++){
            nums[m][i]=0;
        }
    }
    public void setZeroes(int[][] nums) {
        int[] col=new int[nums[0].length];
        int[] row=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                if(nums[i][j]==0){
                    col[j]=-1;
                    row[i]=-1;
                }
            }
        }
        for(int i=0;i<nums.length;i++){
            if(row[i]==-1) markrow(nums,i);
        }
        for(int j=0;j<nums[0].length;j++){
            if(col[j]==-1) markcolumn(nums,j);
        }
    }

}