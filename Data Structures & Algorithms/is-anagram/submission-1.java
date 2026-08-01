class Solution {
    public boolean isAnagram(String s, String t) {
        // if (s.length() != t.length()) {
        //     return false;
        // }
        HashMap<Character, Integer> hm1 = new HashMap<>();
        char[] carys = s.toCharArray();
        for (char c : carys) {
            hm1.put(c, hm1.getOrDefault(c, 1) + 1);
        }
        HashMap<Character, Integer> hm2 = new HashMap<>();
        char[] caryt = t.toCharArray();
        for (char c : caryt) {
            hm2.put(c, hm2.getOrDefault(c, 1) + 1);
        }
        // System.out.print(hm1+"   "+hm2);
        return hm1.equals(hm2);
    }
}
