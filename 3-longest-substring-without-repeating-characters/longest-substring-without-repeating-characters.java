class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> map=new HashSet<>();
        int start=0;
        int maxlen=0;
        for(int i=0;i<s.length();i++){
           while(map.contains(s.charAt(i))){
                map.remove(s.charAt(start));
                start++;
           }
           map.add(s.charAt(i));
           maxlen=Math.max(maxlen,i-start+1);
        }
        return maxlen;
    }
}