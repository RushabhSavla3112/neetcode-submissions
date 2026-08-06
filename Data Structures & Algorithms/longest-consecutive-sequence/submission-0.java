class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int mxchn = 0, len = nums.length, n = 0;
        for (int i = 0; i < len; i++) {
            hs.add(nums[i]);
        }
        // System.out.print("Hi len is " + len + " ");
        for (int i = 0; i < len; i++) {
            int tpln = 0;
            // System.out.print(i + " ");
            n = nums[i];
            if (!hs.contains(n - 1)) {
                // n = n - 1;
                while (hs.contains(n)) {
                    n++;
                    tpln++;
                }
                mxchn = Math.max(tpln, mxchn);
            }
        }
        return mxchn;
    }
}