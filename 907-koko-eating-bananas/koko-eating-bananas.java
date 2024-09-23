class Solution {
    public int max(int[]arr){
        int max=Integer.MIN_VALUE;
        for(int i:arr){
            if(max<i) max=i;
        }
        return max;
    }
    public int noOfHours(int n,int[] arr){
        int count=0;
        for(int i:arr) count+=Math.ceil((double)i/(double)n);
        return count;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low=0;
        int high=max(piles);
        while(low<=high){
            int mid=(low+high)/2;
            if(noOfHours(mid,piles)<=h){
                high=mid-1;
            }
            else low=mid+1;
        }    
        return low;
    }
}