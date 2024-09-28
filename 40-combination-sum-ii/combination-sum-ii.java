class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> arr=new ArrayList<>();
        Arrays.sort(candidates);
        helper(candidates,0,target,new ArrayList(),arr);
        return arr;
    }
    public void helper(int[]candidates,int index,int sum, List<Integer> list,List<List<Integer>> arr){
        if(sum<=0 || index>=candidates.length){
                if(sum==0) arr.add(new ArrayList<>(list));
                return;
        }
        for(int i=index;i<candidates.length;i++){
            if(i>index && candidates[i]==candidates[i-1]) continue;
            if(candidates[i]>sum) break;
            list.add(candidates[i]);
            helper(candidates,i+1,sum-candidates[i],list,arr);
            list.remove(list.size()-1);
        }
    }
}