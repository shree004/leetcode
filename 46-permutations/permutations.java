class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> arr = new ArrayList<>();
        helper(0, nums, new ArrayList(), arr);
        return arr;
    }

    public void helper(int index, int[] nums, List<Integer> list, List<List<Integer>> arr) {
        if (index == nums.length) {
            for (int i = 0; i < nums.length; i++) {
                list.add(nums[i]);
            }
            arr.add(new ArrayList(list));
            list.clear();
            return;
        }
        for (int i = index; i < nums.length; i++) {
            swap(i, index, nums);
            helper(index + 1, nums, list, arr);
            swap(i, index, nums);
        }
    }

    public void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}