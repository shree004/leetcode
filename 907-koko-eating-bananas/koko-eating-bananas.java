class Solution {
    public int noOfHours(int n,int[] arr){
        int count=0;
        for(int i:arr) count+=Math.ceil((double)i/(double)n);
        return count;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low=0;
        int high=1000000000;
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