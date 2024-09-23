class Solution {
    public int findMin(int[] nums) {
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[low]<=nums[mid]){
                if(nums[low]>nums[high]) low=mid+1;
                else return nums[low];
            }
            else{
                if(nums[mid]<nums[mid-1]){
                    return nums[mid];
                }
                else high=mid-1;
            }
        }
        return 1;
    }
}