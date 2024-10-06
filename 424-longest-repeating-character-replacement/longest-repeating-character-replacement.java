class Solution {
    public int characterReplacement(String s, int k) {
        int arr[]=new int[26];
        int l=0,r=0;
        int length=0;
        int max=0;
        for(r=0;r<s.length();r++){
            max=Math.max(max,++arr[s.charAt(r)-'A']);
            if(r-l+1-max>k){
                arr[s.charAt(l)-'A']--;
                l++;
            }
            length=Math.max(length,r-l+1);
        }
        return length;
    }
}