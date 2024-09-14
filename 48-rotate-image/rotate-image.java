class Solution {
    public void reverse(int [] nums){
        int start=0;
        int stop=nums.length-1;
        while(start<stop){
            int temp=nums[start];
            nums[start++]=nums[stop];
            nums[stop--]=temp;
        }    
    }
    public void rotate(int[][] nums) {
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int temp=nums[i][j];
                nums[i][j]=nums[j][i];
                nums[j][i]=temp;
            }
        }
        for(int i=0;i<n;i++){
            reverse(nums[i]);
        }
    }
}