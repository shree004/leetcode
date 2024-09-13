class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        Arrays.sort(nums);
        int max=1;
        int last_s=Integer.MIN_VALUE;
        int count=0;
        for(int i=0;i<n;i++){
            if(nums[i]-1==last_s){
                count++;
                last_s=nums[i];
            }
            else if(nums[i]!=last_s){
                count=1;
                last_s=nums[i];
            }
            max=Math.max(count,max);
        }
        return max;
    }
}