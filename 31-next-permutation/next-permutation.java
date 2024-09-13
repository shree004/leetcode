class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int start=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){ 
                start=i;
                break;
            }
        }
        if(start==-1){
            nums=reverse(nums,0,n-1);
            return;
        }
        for(int i=n-1;i>start;i--){
            if(nums[i]>nums[start]){
                int temp=nums[i];
                nums[i]=nums[start];
                nums[start]=temp;
                break;
            }
        }
        nums=reverse(nums,start+1,n-1);
    }
    public int[] reverse(int[]arr, int low, int high){
        while(low<high){
            int temp=arr[low];
            arr[low++]=arr[high];
            arr[high--]=temp;
        }
        return arr;
    }
}