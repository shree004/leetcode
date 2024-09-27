class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String str=s1+" "+s2;
        String[] str1=str.split(" ");
        ArrayList<String> arr=new ArrayList<>();
        HashMap<String,Integer> map= new HashMap<>();
        for(String i:str1){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        Iterator<Map.Entry<String,Integer>> it=map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<String,Integer> entry=it.next();
            if(entry.getValue()==1) arr.add(entry.getKey());
        }
        return arr.toArray(new String[0]);
    }
}