class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length==1) return nums[0];
        return helper(nums,0,nums.length-1);
    }
    public int helper(int[] nums, int low, int high){
        if(low>high) return -1;
        int mid=low+(high-low)/2;
        if(mid>0 && mid<nums.length-1 && nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]) return nums[mid];
        else if(mid==0 && nums[mid]!=nums[mid+1]) return nums[mid];
        else if(mid==nums.length-1 && nums[mid]!=nums[mid-1]) return nums[mid];
        int left=helper(nums,low,mid-1);
        int right=helper(nums,mid+1,high);
        return Math.max(left,right);
    }
}