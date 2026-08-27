class Solution {
    public String minWindow(String s, String t) {
        if (t.length() > s.length())
            return "";
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            hm.put(t.charAt(i), hm.getOrDefault(t.charAt(i), 0) + 1);
        }
        HashMap<Character, Integer> hmw = new HashMap<>();
        int frm = 0, req = hm.size(), l = 0, r = 0, mnlen = Integer.MAX_VALUE, mnst = 0;
        for (r = 0; r < s.length(); r++) {
            Character cc = s.charAt(r);
            hmw.put(cc, hmw.getOrDefault(cc, 0) + 1);
            if (hm.containsKey(cc) && hmw.get(cc).equals(hm.get(cc)))
                frm++;
            while (frm == req) {
                if (r - l + 1 < mnlen) {
                    mnst = l;
                    mnlen = r - l + 1;
                }
                Character ccl = s.charAt(l);
                hmw.put(ccl, hmw.get(ccl) - 1);
                if (hm.containsKey(ccl) && hmw.get(ccl) < hm.get(ccl)) {
                    frm--;
                }
                l++;
            }
            // r++;
        }
        return mnlen == Integer.MAX_VALUE ? "" : s.substring(mnst, mnst + mnlen);
        // return s.substring(mnst, mnst + mnlen);
    }
}