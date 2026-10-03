class Solution {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1, mid = 0;
        while (l <= r) {
            mid = (l + r) / 2;
            if (nums[mid] == target)
                return mid;
            if (nums[mid] < nums[r]) { // right sorted
                // System.out.println(mid + " right sort");
                if (nums[mid] < target && target <= nums[r]) { // go right
                    l = mid + 1;
                    // System.out.println(" go right");
                } else { // go left
                    r = mid - 1;
                    // System.out.println(" go left");
                }
            } else { // left sorted
                // System.out.println(mid + " left sort");
                // if (target < nums[l]) { // go right
                //     l = mid + 1;
                //     System.out.println(" go right");
                // } else { // go left
                //     r = mid - 1;
                //     System.out.println(" go left");
                // }
                if (nums[l] <= target && target < nums[mid]) { // go left
                    r = mid - 1;
                    // System.out.println(" go left");
                } else { // go right
                    l = mid + 1;
                    // System.out.println(" go right");
                }
            }
        }
        return -1;
    }
}
