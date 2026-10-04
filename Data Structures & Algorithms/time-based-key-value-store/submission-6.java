class TimeMap {
    HashMap<String, ArrayList<Integer>> timeMap;
    HashMap<String, ArrayList<String>> valueMap;

    public TimeMap() {
        timeMap = new HashMap<>();
        valueMap = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        timeMap.putIfAbsent(key, new ArrayList<Integer>());
        valueMap.putIfAbsent(key, new ArrayList<String>());
        timeMap.get(key).add(timestamp);
        valueMap.get(key).add(value);
    }

    public String get(String key, int timestamp) {
        ArrayList<Integer> times = timeMap.getOrDefault(key, new ArrayList<Integer>());
        int l = 0, r = times.size() - 1, m = 0, res = -1;
        // Boolean flag = false;
        while (l <= r) {
            m = (l + r) / 2;
            if (times.get(m) <= timestamp) {
                res = m;
                // flag = true;
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        // System.out.println(res);
        return res == -1 ? "" : valueMap.get(key).get(res);
    }
}