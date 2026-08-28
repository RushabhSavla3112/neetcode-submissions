class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] res = new int[n - k + 1];
        Deque<Integer> dq = new ArrayDeque<>(); // stores indices

        for (int r = 0; r < n; r++) {
            // Step 1: remove smaller values from the back (they're useless now)
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[r]) {
                dq.removeLast();
            }
            // Step 2: add current index
            dq.addLast(r);

            // Step 3: remove front index if it's fallen out of the window
            if (dq.peekFirst() <= r - k) {
                dq.removeFirst();
            }

            // Step 4: once window is fully formed, record the max
            if (r >= k - 1) {
                res[r - k + 1] = nums[dq.peekFirst()];
            }
        }
        return res;
    }
}