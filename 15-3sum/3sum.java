class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> list=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            HashSet<Integer> set=new HashSet<>();
            for(int j=0;j<nums.length && j!=i;j++){
                int third=-(nums[i]+nums[j]);
                if(set.contains(third)){
                    List<Integer> arr=new ArrayList<>();
                    arr.add(nums[i]);
                    arr.add(nums[j]);
                    arr.add(-(nums[i]+nums[j]));
                    arr.sort(Comparator.naturalOrder());
                    if(!list.contains(arr)){
                        list.add(arr);
                    }
                }
                set.add(nums[j]);
            }
        }
        List<List<Integer>> list1=new ArrayList(list);
        return list1;
    }
}