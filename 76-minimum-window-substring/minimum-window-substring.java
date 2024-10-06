class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length() || s.length()==0 || t.length()==0) return "";
        HashMap<Character,Integer> Tmap=new HashMap<>();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<t.length();i++){
            Tmap.put(t.charAt(i),Tmap.getOrDefault(t.charAt(i),0)+1);
        }
        int ans[]={-1,0,0};
        int l=0,count=0;
        for(int r=0;r<s.length();r++){
            char rchar=s.charAt(r);
            map.put(rchar,map.getOrDefault(rchar,0)+1);
            if(Tmap.containsKey(rchar) && map.get(rchar).intValue()==Tmap.get(rchar).intValue()) count++;
            while(count==Tmap.size() && l<=r){
                if(ans[0]==-1 || ans[0]>=r-l+1){
                ans[0]=r-l+1;
                ans[1]=l;
                ans[2]=r;
                }
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                if(Tmap.containsKey(s.charAt(l)) && map.get(s.charAt(l)).intValue()<Tmap.get(s.charAt(l)).intValue()) count--;
                l++;
            }
        }
        if(ans[0]==-1)  return "";
        return s.substring(ans[1],ans[2]+1);
    }
}