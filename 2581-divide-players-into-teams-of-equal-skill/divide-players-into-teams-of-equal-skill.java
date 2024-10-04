class Solution {
    public long dividePlayers(int[] skill) {
        int n= skill.length;
        int half=n/2;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=skill[i];
        }
        if(sum%half!=0) return -1;
        else sum=sum/half;
        int count=0;
        long res=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(!map.containsKey(sum-skill[i]) || map.get(sum-skill[i])==0) 
                map.put(skill[i],map.getOrDefault(skill[i],0)+1);
            else{
                res+=(skill[i]*(sum-skill[i]));
                count++;
                map.put(sum-skill[i],map.get(sum-skill[i])-1);
            }
        }
        return count==half?res:-1;
    }
}