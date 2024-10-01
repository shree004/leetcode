class Solution {
    public boolean canArrange(int[] arr, int k) {
        int freq[]=new int[k];
        for(int i:arr) freq[((i% k) + k) % k]++;
        if(freq[0]%2==1) return false;
        if(k%2==0){
            if(freq[k/2]%2==1) return false;
        }
        for(int i=1;i<=k/2;i++){
            if(freq[i]!=freq[k-i]) return false;
        }
        return true;
    }
}
