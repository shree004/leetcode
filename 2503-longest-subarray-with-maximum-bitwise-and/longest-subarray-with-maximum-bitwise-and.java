class Solution {
    public int longestSubarray(int[] nums) {
        int count=1;
        int max_element=Integer.MIN_VALUE;
        int max=1;
        for(int i=0;i<nums.length;i++){
            if(max_element==nums[i]){
                if(nums[i-1]==max_element) count++;
                else{
                    max=Math.max(count,max);
                    count=1;
                }
            } 
            else if(nums[i]>max_element){
                max_element=nums[i];
                count=1;
            }
        }
        return max>count?max:count;
    }
}