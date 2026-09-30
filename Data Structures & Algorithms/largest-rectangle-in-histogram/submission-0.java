class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> idxStck = new Stack<>();
        int area = 0;
        int n = heights.length;
        for (int i = 0; i < n; i++) {
            while (!idxStck.isEmpty() && heights[idxStck.peek()] >= heights[i]) {
                int rb = idxStck.pop();
                int lb = idxStck.isEmpty() ? -1 : idxStck.peek();
                int width = i - lb - 1;
                area = Math.max(area, heights[rb] * width);
            }
            idxStck.push(i);
        }
        while (!idxStck.isEmpty()) {
            int rb = idxStck.pop();
            int lb = idxStck.isEmpty() ? -1 : idxStck.peek();
            int width = n - lb - 1;
            area = Math.max(area, heights[rb] * width);
        }
        return area;
    }
}