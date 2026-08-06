class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] cary = str.toCharArray();
        int l = 0, r = cary.length - 1;
        System.out.println(str);

        while (l < r) {
            System.out.println(l + "  " + r);
            if (cary[l++] != cary[r--]) {
                return false;
            }
        }
        return true;
    }
}
