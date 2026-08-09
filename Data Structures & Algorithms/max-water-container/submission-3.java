class Solution {
    public int maxArea(int[] hts) {
        int l = 0, r = hts.length - 1, mxwtr = 0;
        Boolean fl = true;
        while (l < r) {
            int len = r - l;
            int mxht = Math.min(hts[l], hts[r]);
            int ar = len * mxht;
            // System.out.println("len " + len + " mxht " + mxht + " area " + ar + " mxwtr " + mxwtr);
            mxwtr = Math.max(ar, mxwtr);
            if (hts[l] < hts[r]) {
                l++;
            } else if (hts[l] > hts[r]) {
                r--;
            } else {
                l++;
                r--;
            }
        }
        return mxwtr;
    }
}