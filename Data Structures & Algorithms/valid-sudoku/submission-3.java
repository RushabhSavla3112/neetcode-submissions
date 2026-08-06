class Solution {
    public boolean isValidSudoku(char[][] board) {
        ArrayList<HashSet<Character>> rows = new ArrayList<>();
        ArrayList<HashSet<Character>> cols = new ArrayList<>();
        ArrayList<HashSet<Character>> boxes = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            rows.add(new HashSet<>());
            cols.add(new HashSet<>());
            boxes.add(new HashSet<>());
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.')
                    continue;
                char c = board[i][j];
                int boxIdx = (i / 3) * 3 + j / 3;
                if (!rows.get(i).add(c) || !cols.get(j).add(c) || !boxes.get(boxIdx).add(c)) {
                    return false;
                }
            }
        }
        return true;
    }
}
