class Solution {
    public int maxWidthRamp(int[] nums) {
        int[] rightmax=new int[nums.length];
        int rmax=nums[nums.length-1];
        for(int i=nums.length-1;i>=0;i--){
            if(rmax<nums[i]) rmax=nums[i];
            rightmax[i]=rmax;
        }
        int left=0;
        int right=0;
        int maxwidth=0;
        while(right<nums.length){
            while(left<right && nums[left]>rightmax[right]) left++;
            maxwidth=Math.max(right-left,maxwidth);
            right++;
        }
        return maxwidth;
    }
}