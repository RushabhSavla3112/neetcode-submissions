class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length, n2 = nums2.length;
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }
        int l = 0, r = n1, i = 0, j = 0;
        // System.out.println(n1 + " " + n2);

        while (l <= r) {
            i = (l + r) / 2;
            j = (n1 + n2 + 1) / 2 - i;
            // System.out.println(l + " " + r + " " + i + " " + j);
            int l1 = i == 0 ? Integer.MIN_VALUE : nums1[i - 1];
            int r1 = i == n1 ? Integer.MAX_VALUE : nums1[i];
            int l2 = j == 0 ? Integer.MIN_VALUE : nums2[j - 1];
            int r2 = j == n2 ? Integer.MAX_VALUE : nums2[j];

            if (l1 <= r2 && l2 <= r1) {
                // main code
                System.out.println("Pass " + l1 + " " + r1 + " " + l2 + " " + r2);

                int n = n1 + n2;
                if (n % 2 == 0) {
                    // System.out.println((l1 + r2) / 2.0);
                    return (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
                } else {
                    // System.out.println(l1);
                    return Math.max(l1, l2);
                }
            } else if (l1 > r2) {
                r = i - 1;
            } else {
                l = i + 1;
            }
        }
        return -1;
    }
}