class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Stack<Float> timeStck = new Stack<>();
        int n = position.length;
        int[][] cars = new int[n][2]; // each row: [position, speed]
        for (int i = 0; i < n; i++) {
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }
        Arrays.sort(cars, (a, b) -> b[0] - a[0]); // descending by position
        for(int i = 0; i<n; i++){
            Float time =(float) (target-cars[i][0])/cars[i][1];
            if(timeStck.isEmpty() || time > timeStck.peek()){
                timeStck.push(time);
            }
        }
        return timeStck.size();
    }
}