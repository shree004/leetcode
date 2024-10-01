class Solution {
    public boolean canArrange(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            int remainder = i % k;
            if (remainder < 0) {
                remainder += k;
            }
            map.put(remainder, map.getOrDefault(remainder, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int remainder = entry.getKey();
            int count = entry.getValue();
            if (remainder == 0) {
                if (count % 2 != 0) {
                    return false;
                }
            } else {
                int complement = k - remainder;
                if (map.getOrDefault(complement, 0) != count) {
                    return false;
                }
            }
        }
        return true;
    }
}
