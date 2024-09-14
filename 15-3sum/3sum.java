class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> list=new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int start=nums[i];
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                int sum=start+nums[left]+nums[right];
                if(sum==0){
                    List<Integer> arr=new ArrayList<>();
                    arr.add(start);
                    arr.add(nums[left]);
                    arr.add(nums[right]);
                    if(!list.contains(arr)){
                        list.add(arr);
                    }
                    left++;
                    right--;
                }
                else if(sum<0) left++;
                else right--;
            }
        }
        return new ArrayList(list);
    }
}