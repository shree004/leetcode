class Solution {
    public int singleNonDuplicate(int[] nums) {
        if (nums.length == 1) return nums[0];  // If there's only one element, return it
        if (nums[0] != nums[1]) return nums[0];  // Check if the first element is the single one
        if (nums[nums.length - 2] != nums[nums.length - 1]) return nums[nums.length - 1];  // Check if the last element is the single one
        
        int low = 1;  // Start just after the first element
        int high = nums.length - 2;  // End just before the last element
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) {
                return nums[mid];  // Found the single non-duplicate element
            }
            
            // Binary search logic:
            if (mid % 2 == 0) {  // If mid is even
                if (nums[mid] == nums[mid + 1]) {
                    low = mid + 2;  // The single element must be on the right
                } else {
                    high = mid - 1;  // The single element must be on the left
                }
            } else {  // If mid is odd
                if (nums[mid] == nums[mid - 1]) {
                    low = mid + 1;  // Single element is on the right
                } else {
                    high = mid - 1;  // Single element is on the left
                }
            }
        }
        return -1;  // Default case (shouldn't reach here)
    }
}
