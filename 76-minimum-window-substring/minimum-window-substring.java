class Solution {
    public String minWindow(String s, String t) {
        char[] str=s.toCharArray();
        int tmap[]=new int[128];
        for(int i=0;i<t.length();i++){
            tmap[t.charAt(i)]++;
        }
        int required=t.length();
        int start=0,min=Integer.MAX_VALUE;
        int l=0;
        for(int r=0;r<s.length();r++){
            if(tmap[str[r]]>0){
                required--;
            }
            tmap[str[r]]--;
            while(required==0){
                if(r-l+1<min){
                    min=r-l+1;
                    start=l;
                }
                if(tmap[str[l]]==0){
                    required++;
                }
                tmap[str[l]]++;
                l++;
            }
        }
        return min==Integer.MAX_VALUE?"":new String(str,start,min);
    }
}