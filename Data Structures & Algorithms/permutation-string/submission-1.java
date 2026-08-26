class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] s1a = new int[26];
        if (s1.length() > s2.length())
            return false;
        for (char s : s1.toCharArray()) {
            s1a[s - 'a']++;
        }
        int[] s2a = new int[26];
        int l = 0, r = 0;
        while (r <= s1.length() - 1) {
            s2a[s2.charAt(r) - 'a']++;
            r++;
        }
        System.out.println(Arrays.toString(s1a));
        System.out.println(Arrays.toString(s2a));
        if (Arrays.equals(s1a, s2a))
            return true;
        while (r < s2.length()) {
            System.out.println(s2.charAt(r) - 'a');
            s2a[s2.charAt(r) - 'a']++;
            r++;
            int tp = s2a[s2.charAt(l) - 'a'];
            s2a[s2.charAt(l) - 'a'] = tp > 0 ? tp-1 : 0;
            l++;
            if (Arrays.equals(s1a, s2a))
                return true;

            System.out.println(Arrays.toString(s2a));
        }
        return false;
    }
}