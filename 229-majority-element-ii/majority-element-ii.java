class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        Iterator<Map.Entry<Integer,Integer>> it=map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<Integer,Integer> entry=it.next();
            if(entry.getValue()>(nums.length/3)){
                list.add(entry.getKey());
            }
        }
        return list;
    }
}