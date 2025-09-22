class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
        int d=x;
        while(x!=0){
            int pop=x%10;
            x/=10;
            rev=rev*10+pop;
        }
        if(Math.abs(d)==rev) return true;
        return false;
    }
}