class Solution {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            System.out.println(l + "  " + r + "  " + mid);
            if (target == nums[mid])
                return mid;
            else if (target < nums[mid])
                r = mid - 1;
            else if (target > nums[mid])
                l = mid + 1;
        }
        return -1;
    }
}
