class Solution {
    public boolean isValidSudoku(char[][] board) {
        ArrayList<HashSet<Character>> als = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            HashSet<Character> hs = new HashSet<>();
            als.add(hs);
        }
        for (int i = 0; i < 9; i++) {
            HashSet<Character> hsr = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                // HashSet<Character> hsc = new HashSet<>();
                // if(i==0){System.out.print(board[i][j]);};
                // System.out.print((i/3)*3+" "+j/3);
                if ((board[i][j] != '.')
                    && (!hsr.add(board[i][j])
                        || !(als.get((i / 3) * 3 + j / 3).add(board[i][j])))) {
                    return false;
                };
                // als.get((i/3)*3+j/3).add(board[i][j]);
                // System.out.println();
            }
        }
        for (int i = 0; i < 9; i++) {
            HashSet<Character> hsr = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if ((board[j][i] != '.')
                    && (!hsr.add(board[j][i]))){
                    return false;
                };
            }
        }

        return true;
    }
}
