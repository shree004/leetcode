class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        int max=1;
        HashSet<Integer> set=new HashSet<>();
        for(int i : nums) set.add(i);
        Iterator<Integer> it=set.iterator();
        while(it.hasNext()){
            int x=it.next();
            if(!set.contains(x-1)){
                int count=1;
                while(set.contains(x+1)){
                    count++;
                    x++;
                }
                max=Math.max(max,count);
            }
        }
        return max;
    }
}