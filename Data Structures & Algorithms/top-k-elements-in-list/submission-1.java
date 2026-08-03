class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }
        // Map.Entry<String, Integer> entry : map.entrySet()
        int[] res = new int[k];
        res = hm.entrySet()
                  .stream()
                  .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                  .limit(k)
                  .mapToInt(Map.Entry::getKey)
                  .toArray();
        // int c = 0;
        // for(Map.Entry<Integer, Integer> entry: hm.entrySet()){
        //     if(entry.getValue() >= k){
        //         res[c++] = entry.getKey();
        //     }
        // }
        return res;
    }
}