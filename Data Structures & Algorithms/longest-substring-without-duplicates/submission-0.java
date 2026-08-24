class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] c = s.toCharArray();
        HashMap<Character, Integer> lastSeen = new HashMap<>();
        int l = 0, ct = 0;
        for (int r = 0; r < c.length; r++) {
            if (lastSeen.containsKey(c[r]) && lastSeen.get(c[r]) >= l) {
                l = lastSeen.get(c[r]) + 1;
            }
            lastSeen.put(c[r], r);
            ct = Math.max(ct, r - l + 1);
        }
        return ct;
    }
}