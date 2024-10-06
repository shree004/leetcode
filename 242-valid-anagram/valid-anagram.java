class Solution {
    public boolean isAnagram(String s, String t) {
        int[] count = new int[26];
        for (char x : s.toCharArray()) {
            count[x - 'a']++;
        }
        for (char x : t.toCharArray()) {
            count[x - 'a']--;
        }
        for (int val : count) {
            if (val != 0) {
                return false;
            }
        }
        return true;
        // char[] sChars = s.toCharArray();
        // char[] tChars = t.toCharArray();
        // Arrays.sort(sChars);
        // Arrays.sort(tChars);
        // return Arrays.equals(sChars, tChars);

    }
    // public boolean isAnagram(String s, String t) {
    //     if(s.length()!=t.length()) return false;
    //     HashMap<Character,Integer> map=new HashMap<>();
    //     for(int i=0;i<s.length();i++){
    //         char a=s.charAt(i);
    //         if(!map.containsKey(a)){
    //             map.put(a,1);
    //         }
    //         else map.put(a,map.get(a)+1);
    //     }
    //     for(int i=0;i<t.length();i++){
    //         char a=t.charAt(i);
    //         if(map.containsKey(a)){
    //             if(map.get(a)==1) map.remove(a);
    //             else map.put(a,map.get(a)-1);
    //         }
    //         else{
    //             break;
    //         }
    //     }
    //     return map.isEmpty();
    // }
}