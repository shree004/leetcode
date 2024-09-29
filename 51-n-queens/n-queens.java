class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> arr = new ArrayList<>();
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                board[i][j] = '.';
        helper(0, n, board, arr);
        return arr;
    }

    public boolean check(int row, int col, int n, char[][] board) {
        int i = 0;
        int j = col;
        while (i < n) {
            if (board[i][j] == 'Q') return false;
            i++;
        }
        i = row;
        j = col;
        while (i >= 0 && j >= 0) {
            if (board[i][j] == 'Q')
                return false;
            i--;
            j--;
        }
        i = row;
        j = col;
        while (i >= 0 && j < n) {
            if (board[i][j] == 'Q')
                return false;
            i--;
            j++;
        }
        return true;
    }

    public List<String> construct(char[][] board) {
        List<String> res = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            String s = new String(board[i]);
            res.add(s);
        }
        return res;
    }

    public void helper(int row, int n, char[][] board, List<List<String>> arr) {
        if (row == n) {
            arr.add(construct(board));
            return;
        }
        for (int i = 0; i < n; i++) {
            if (check(row, i, n, board)) {
                board[row][i]='Q';
                helper(row + 1, n, board, arr);
                board[row][i]='.';
            }
        }
    }
}