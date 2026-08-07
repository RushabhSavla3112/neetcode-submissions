class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l = 0, n = nums.length, r = nums.length - 1, sum = 0;
        while (true) {
            sum = nums[l] + nums[r];
            if (sum > target) {
                r--;
            } else if (sum < target) {
                l++;
            } else {
                break;
            }
        }
        int[] res = new int[2];
        l++;
        r++;
        res[0] = l;
        res[1] = r;
        return res;
    }
}