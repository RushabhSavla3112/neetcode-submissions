class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length, n2 = nums2.length;
        int[] join = new int[n1 + n2];
        int a1 = 0, a2 = 0;
        for (int i = 0; i < (n1 + n2); i++) {
            // System.out.println(i + " " + n1 + " " + n2);
            if (a1 >= n1) {
                join[i] = nums2[a2++];
            } else if (a2 >= n2) {
                join[i] = nums1[a1++];
            } else if (nums1[a1] < nums2[a2]) {
                join[i] = nums1[a1++];
            } else {
                join[i] = nums2[a2++];
            }
        }
        int total = n1 + n2;
        if (total % 2 != 0) {
            return join[total / 2];
        } else {
            return (join[total / 2 - 1] + join[total / 2]) / 2.0;
        }
    }
}