class Solution {
    public boolean isValidSudoku(char[][] board) {
        char key;
        for(int i = 0; i < 9; i++){
            HashSet<Character> hashsetRow = new HashSet<>();
            for(int j = 0; j < 9; j++){
                if(!((board[i][j] >= '1' && board[i][j] <= '9') || (board[i][j] == '.'))){
                    return false;
                }
                else{
                    if(board[i][j] != '.'){
                        key = board[i][j];
                       if(hashsetRow.contains(key))
                        return false;
                       else
                        hashsetRow.add(key);
                       }
                    }
                }
            }
        for(int i = 0; i < 9; i++){
            HashSet<Character> hashsetCol = new HashSet<>();
            for(int j = 0; j < 9; j++){
                if(board[j][i] != '.'){
                    key = board[j][i];
                    if(hashsetCol.contains(key))
                        return false;
                    else
                        hashsetCol.add(key);
                }
            }
        }
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                int startRow = i * 3;
                int startCol = j * 3;
                HashSet<Character> hashsetBox = new HashSet<>();
                for(int r = startRow; r < startRow+3; r++){
                    for(int c = startCol; c < startCol+3; c++){
                        if(board[r][c] != '.'){
                            key = board[r][c];
                            if(hashsetBox.contains(key))
                                return false;
                            else
                                hashsetBox.add(key);
                        }
                    }
                }
            }
        }
        return true;
    }
}
