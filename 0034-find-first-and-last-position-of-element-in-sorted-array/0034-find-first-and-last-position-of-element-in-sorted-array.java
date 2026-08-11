class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1, -1};
        if (nums == null || nums.length == 0) {
            return result;
        }

        result[0] = findBound(nums, target, true);   
        if (result[0] == -1) {
            return result; 
        }
        result[1] = findBound(nums, target, false);  

        return result;
    }

    private int findBound(int[] nums, int target, boolean isFirst) {
        int l = 0, r = nums.length - 1;
        int bound = -1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (nums[mid] == target) {
                bound = mid; 
                if (isFirst) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return bound;
    }
}