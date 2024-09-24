class Solution {
    public int reversePairs(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        return mergeSortAndCount(nums, 0, nums.length - 1);
    }
    public int mergeSortAndCount(int[] arr, int low,int high){
        if(low>=high) return 0;
        int count=0;
        int mid=low+(high-low)/2;
        count+=mergeSortAndCount(arr,low,mid);
        count+=mergeSortAndCount(arr,mid+1,high);
        count+=mergeAndCount(arr,low,mid,high);
        return count;
    }
    public int mergeAndCount(int[] arr, int low, int mid, int high){
        int count=0;
        int j=mid+1;
        for(int i=low;i<=mid;i++){
           while(j<=high && arr[i]>2*(long)arr[j]) j++;
           count+=(j-mid-1);
        }
        int[] temp=new int[high-low+1];
        int i=low;
        j=mid+1;
        int k=0;
        while(i<=mid && j<=high){
            if(arr[i]<arr[j]) temp[k++]=arr[i++];
            else temp[k++]=arr[j++];
        }
        while(i<=mid) temp[k++]=arr[i++];
        while(j<=high) temp[k++]=arr[j++];
        for(i=low;i<=high;i++){
            arr[i]=temp[i-low];
        }
        return count;
    }
}