class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> arr=new ArrayList<>();
        Arrays.sort(candidates);
        helper(candidates,0,target,new ArrayList(),arr);
        return arr;
    }
    public void helper(int[] nums,int index, int sum,List<Integer> list,List<List<Integer>> arr){
        if(sum<=0){
            if(sum==0){
                arr.add(new ArrayList<>(list));
            }
            return;
        }
        for(int i=index;i<nums.length;i++){
            if(i>index && nums[i]==nums[i-1]) continue;
            if(nums[i]>sum) break;
            list.add(nums[i]);
            helper(nums,i+1,sum-nums[i],list,arr);
            list.remove(list.size()-1);
        }
    }
}