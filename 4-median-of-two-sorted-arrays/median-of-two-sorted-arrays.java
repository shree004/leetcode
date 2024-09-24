class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length+nums2.length;
        int i=0,j=0;
        int cnt=0;
        int ele1=0,ele2=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<=nums2[j]){
                if(cnt==n/2) ele1=nums1[i];
                if(cnt==(n/2-1)) ele2=nums1[i];
                i++;cnt++;
            }
            else{
                if(cnt==n/2) ele1=nums2[j];
                if(cnt==(n/2-1)) ele2=nums2[j];
                j++;cnt++;
            }
        }
        while(i<nums1.length){
            if(cnt==n/2) ele1=nums1[i];
                if(cnt==(n/2-1)) ele2=nums1[i];
                i++;cnt++;
        }
        while(j<nums2.length){
            if(cnt==n/2) ele1=nums2[j];
                if(cnt==(n/2-1)) ele2=nums2[j];
                j++;cnt++;
        }
        
        if(n%2==0){
            return ((double)ele1+(double)ele2)/2.0;
        }
        else{
            return ele1;
        }
    }
}