class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> arr=new ArrayList<>();
        helper(candidates,0,target,new ArrayList(),arr);
        return arr;
    }
    public void helper(int[]candidates,int index,int sum, List<Integer> list,List<List<Integer>> arr){
        if(index==candidates.length){
            if(sum==0){
                arr.add(new ArrayList<>(list));
            }
            return;
        }
        if(candidates[index]<=sum){
            list.add(candidates[index]);
            helper(candidates,index,sum-candidates[index],list,arr);
            list.remove(list.size()-1);
        }
        helper(candidates,index+1,sum,list,arr);
    }
}