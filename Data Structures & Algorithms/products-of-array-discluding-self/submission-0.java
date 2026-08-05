class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1, count = 0;
        int[] zeropstn = new int[nums.length];
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                prod *= nums[i];
            } else {
                zeropstn[count++] = i;
            }
        }
        if (count > 1) {
            for (int i = 0; i < nums.length; i++) {
                result[i] = 0;
            }
        } else if (count > 0) {
            for (int i = 0; i < nums.length; i++) {
                if (zeropstn[0] == i) {
                    result[i] = prod;
                } else {
                    result[i] = 0;
                }
            }
        } else {
            for (int i = 0; i < nums.length; i++) {
                result[i] = prod / nums[i];
            }
        }
        return result;
    }
}
