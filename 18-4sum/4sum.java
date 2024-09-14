class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        Set<List<Integer>> list=new HashSet<>();
        for(int i=0;i<nums.length-3;i++){
            int start=nums[i];
            for(int end=nums.length-1;end>i+2;end--){
                int left=i+1;
                int right=end-1;
                while(left<right){
                    long sum=(long) start+nums[left]+nums[right]+nums[end];
                    if(sum==target){
                    List<Integer> arr=new ArrayList<>();
                    arr.add(start);
                    arr.add(nums[left]);
                    arr.add(nums[right]);
                    arr.add(nums[end]);
                    if(!list.contains(arr)){
                        list.add(arr);
                    }
                    left++;
                    right--;
                }
                else if(sum<target) left++;
                else right--;
                }
            }
        }
        return new ArrayList(list);
    }
}