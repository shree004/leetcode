class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> arr = new ArrayList<>();
        helper(1, 0, n, k, new ArrayList(), arr);
        return arr;
    }

    public void helper(int num, int n, int sum, int k, List<Integer> list, List<List<Integer>> arr) {
        if (n >= k || num>9) {
            if (sum == 0 && n==k) {
                arr.add(new ArrayList(list));
            }
            return;
        }
        if (sum<0) return;
        if(num<=sum){
            list.add(num);
            helper(num + 1, n + 1, sum - num, k, list, arr);
            list.remove(list.size() - 1);
        }
        helper(num + 1, n, sum, k, list, arr);
    }

}