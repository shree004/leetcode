class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> arr = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];
        helper(nums, new ArrayList(), arr, freq);
        return arr;
    }
    public void helper(int[] nums,List<Integer> list, List<List<Integer>> arr,boolean[] freq){
        if(list.size()==nums.length){
            arr.add(new ArrayList(list));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!freq[i]){
                freq[i]=true;
                list.add(nums[i]);
                helper(nums,list,arr,freq);
                list.remove(list.size()-1);
                freq[i]=false;
            }
        }
    }
}