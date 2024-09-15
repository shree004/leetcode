class Solution {
    public int findTheLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('a',1);
        map.put('e',2);
        map.put('i',4);
        map.put('o',8);
        map.put('u',16);
        int[] seen=new int[32];
        Arrays.fill(seen,-2);
        seen[0]=-1;
        int mask=0;
        int max_length=0;
        for(int i=0;i<s.length();i++){
            mask^=map.getOrDefault(s.charAt(i),0);
            int prev = seen[mask];
            if(prev==-2) seen[mask]=i;
            else max_length=Math.max(max_length,i-prev);
        }
        return max_length;
    }
}