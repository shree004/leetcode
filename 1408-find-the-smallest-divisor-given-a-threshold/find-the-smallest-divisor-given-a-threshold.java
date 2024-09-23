class Solution {
    public boolean sum(int[] arr,int n,int limit){
        int sum=0;
        for(int i:arr){
            sum+=Math.ceil((double)i/(double)n);
        }
        return sum<=limit;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int maxi=Integer.MIN_VALUE;
        for(int i:nums){
            if(i>maxi) maxi=i;
        }
        int low=1;
        int high=maxi;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(sum(nums,mid,threshold)){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
}