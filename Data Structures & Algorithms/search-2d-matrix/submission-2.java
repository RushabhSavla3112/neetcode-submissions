class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l = 0, m = matrix.length, n = matrix[0].length, r = (m * n) - 1;
        if (matrix[m - 1][n - 1] < target)
            return false;
        System.out.println(m + " " + n);
        while (l <= r) {
            int mid = (l + r) / 2;
            if (target == matrix[mid / n][mid % n]) {
                return true;
            } else if (target <= matrix[mid / n][mid % n]) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return false;
    }
}