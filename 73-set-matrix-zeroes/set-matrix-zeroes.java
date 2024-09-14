class Solution {
    public void setZeroes(int[][] nums) {
        int col0=1;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                if(nums[i][j]==0){
                    nums[i][0]=0;
                    if(j!=0){
                        nums[0][j]=0;
                    }
                    else{
                        col0=0;
                    }
                }
            }
        }
        for(int i=1;i<nums.length;i++){
            for(int j=1;j<nums[0].length;j++){
                if(nums[0][j]==0 || nums[i][0]==0){
                    nums[i][j]=0;
                }
            }
        }
        if(nums[0][0]==0){
            for(int j=0;j<nums[0].length;j++){
                nums[0][j]=0;
            }
        }
        if(col0==0){
            for(int j=0;j<nums.length;j++){
                nums[j][0]=0;
            }
        }
    }

}