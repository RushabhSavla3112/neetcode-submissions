class Solution {
    public int[] twoSum(int[] nums, int tgt) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int a = 0, b = 0;
        for (int i = 0; i < nums.length; i++) {
            
            if (hm.containsKey(tgt - nums[i])) {
                // res.add(i, hm.get(tgt - nums[i]));
                a = i;
                b = hm.get(tgt - nums[i]);
                if (a != b) {
                    break;
                }
            }
            hm.put(nums[i], i);
        }
        if (a < b) {
            int[] res = new int[] {a, b};
            return res;
        } else {
            int[] res = new int[] {b, a};
            return res;
        }
    }
}