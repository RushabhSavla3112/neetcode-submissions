class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer> idxStck = new Stack();
        int len = temp.length;
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            if (idxStck.isEmpty() || temp[idxStck.peek()] > temp[i]) {
                idxStck.push(i);
                // System.out.println("HI if  "+i);
            } else {
                // System.out.println("HI else  "+i);
                while (!idxStck.isEmpty() && temp[idxStck.peek()] < temp[i]) {
                    int idx = idxStck.pop();
                    result[idx] = i-idx;
                }
                idxStck.push(i);
            }
        }
        return result;
    }
}