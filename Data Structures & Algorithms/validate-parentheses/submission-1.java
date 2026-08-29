class Solution {
    public boolean isValid(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            if (c.equals('(') || c.equals('{') || c.equals('[')) {
                s.push(c);
            } else {
                if (c.equals(')')) {
                    if (!s.isEmpty() && s.peek().equals('(')) {
                        s.pop();
                    } else {
                        return false;
                    }
                } else if (c.equals('}')) {
                    if (!s.isEmpty() && s.peek().equals('{')) {
                        s.pop();
                    } else {
                        return false;
                    }
                } else if (c.equals(']')) {
                    if (!s.isEmpty() && s.peek().equals('[')) {
                        s.pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        if (s.isEmpty())
            return true;
        return false;
    }
}