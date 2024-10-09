class Solution {
    public int minSwaps(String s) {
        int imbalance=0;
        for(char a: s.toCharArray()){
            if(a=='[') imbalance++;
            else{
                if(imbalance>0) imbalance--;
            }
        }
        return (imbalance+1)/2;
    }
}