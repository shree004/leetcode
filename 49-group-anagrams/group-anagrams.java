class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==0) return new ArrayList();
        HashMap<String,List<String>> map=new HashMap<>();
        for(String s:strs){
            char[] str=s.toCharArray();
            Arrays.sort(str);
            String st=new String(str);
            if(map.containsKey(st)){
                map.get(st).add(s);
            }
            else{
                List<String> a=new ArrayList<>();
                a.add(s);
                map.put(st,a);
            }
        }
        return new ArrayList(map.values());
    }
}