class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int l = 0, r = 0, ct = 0, mxf = 0;
        while (r < s.length()) {
            Character c = s.charAt(r);
            hm.put(c, hm.getOrDefault(c, 0) + 1);
            mxf = Integer.max(mxf, hm.get(c));
            int wl = r - l + 1;
            if (wl - mxf > k) {
                Character ll = s.charAt(l);
                l++;
                int tt = hm.get(ll);
                if (tt == 1) {
                    hm.remove(ll);
                } else {
                    hm.put(ll, tt - 1);
                }
                mxf--;
            }
            r++;
        }
        return r - l;
    }
}