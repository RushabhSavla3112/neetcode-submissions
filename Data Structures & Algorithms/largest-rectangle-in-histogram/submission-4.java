class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> idSt = new Stack<>();
        int area = -1, len = heights.length;
        for (int i = 0; i < len; i++) {
            while (!idSt.isEmpty() && heights[idSt.peek()] >= heights[i]) {
                int rb = idSt.pop();
                int lb = idSt.isEmpty() ? -1 : idSt.peek();
                int width = i - lb - 1;
                area = Math.max(area, width * heights[rb]);
            }
            idSt.push(i);
        }
        while (!idSt.isEmpty()) {
            int rb = idSt.pop();
            int lb = idSt.isEmpty() ? -1 : idSt.peek();
            int width = len - lb - 1;
            area = Math.max(area, width * heights[rb]);
            // System.out.println(area+" "+width+" "+rb+" "+lb);
        }
        return area;
    }
}