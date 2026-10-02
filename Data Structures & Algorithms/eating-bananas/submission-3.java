class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0, l = 1, k = 0;
        for (int pile : piles) {
            max = Math.max(pile, max);
        }
        if (piles.length == h) {
            return max;
        }
        int r = max, ans = 0;
        System.out.println(r);
        while (l <= r) {
            k = (l + r) / 2;
            int sum = 0;
            for (int j = 0; j < piles.length; j++) {
                int temp = (int) Math.ceil((double) piles[j] / k);
                sum += temp;
            }
            if (sum <= h) {
                ans = k; // k works — record it, but try smaller k
                r = k - 1;
            } else {
                l = k + 1;
            }
        }
        return ans;
    }
}
