class Solution {
    public int NoOfB(int[] arr, int n, int k){
        int total=0;
        int count=0;
        for(int i:arr){
            if(i<=n) count++;
            else{
                total+=(count/k);
                count=0;
            }
        }
        total+=count/k;
        return total;
    }
    public int[] func(int[] arr){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max) max=arr[i];
            if(arr[i]<min) min=arr[i];
        }
        return new int[]{min,max};
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int size=m*k;
        if(size>bloomDay.length) return -1;
        int low=func(bloomDay)[0];
        int high=func(bloomDay)[1];
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(NoOfB(bloomDay,mid,k)>=m){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
}