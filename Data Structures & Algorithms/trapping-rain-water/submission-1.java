class Solution {
    public int trap(int[] hts) {
        int n = hts.length;
        int[] pfx = new int[n];
        int[] sfx = new int[n];
        pfx[0] = hts[0];
        sfx[n - 1] = hts[n - 1];
        for (int i = 1; i < n; i++) {
            pfx[i] = Math.max(hts[i], pfx[i - 1]);
            sfx[n - i - 1] = Math.max(sfx[n - i], hts[n - i - 1]);
        }
        // System.out.print(Arrays.toString(pfx) + " " + Arrays.toString(sfx));
        int res = 0;
        for (int i = 0; i < n; i++) {
            res += Math.min(pfx[i], sfx[i]) - hts[i];
        }
        return res;
    }
}