class Solution {
    public boolean isValid(String str) {
        Stack<Character> s = new Stack<>();
        Map<Character, Character> map = Map.of(')', '(', '}', '{', ']', '[');
        for (char c : str.toCharArray()) {
            if (!map.containsKey(c)) {
                s.push(c);
            } else {
                if (s.isEmpty() || !s.pop().equals(map.get(c))) {
                    return false;
                }
            }
        }
        return s.isEmpty();
    }
}