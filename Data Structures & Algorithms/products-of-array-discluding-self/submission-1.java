class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1, count = 0, n = nums.length;
        int[] pfx = new int[n];
        int[] sfx = new int[n];
        int[] rslt = new int[n];
        pfx[0] = 1;
        sfx[n - 1] = 1;
        for (int i = 1; i < n; i++) {
            pfx[i] = pfx[i - 1] * nums[i - 1];
            sfx[n - 1 - i] = sfx[n - i] * nums[n - i];
        }
        for (int i = 0; i < n; i++) {
            // System.out.println("Prefix is = " + pfx[i] + " Suffix is this = " + sfx[i]);
            rslt[i] = pfx[i] * sfx[i];
        }
        // System.out.print("Prefix is" + pfx + "Suffix is this" + sfx);
        return rslt;
    }
}
