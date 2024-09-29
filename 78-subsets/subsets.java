class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> arr=new ArrayList<>();
        helper(0,new ArrayList(),nums,arr);
        return arr;
    }
     public void helper(int index,List<Integer> list, int[] nums,List<List<Integer>> arr){
        if(index>nums.length-1){
            arr.add(new ArrayList(list));
            return;
        }
        list.add(nums[index]);
        helper(index+1,list,nums,arr);
        list.remove(list.size()-1);
        helper(index+1,list,nums,arr);
    }
}