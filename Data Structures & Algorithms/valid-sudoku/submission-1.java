class Solution {
    public boolean isValidSudoku(char [][] board) {
        boolean isvalid =true;
        for(int i =0;i<9;i++){
            HashSet<Character>set=new HashSet<>();
            boolean cleared = false;
            for(int j =0;j<9;j++){
                if(board[i][j]=='.'){
                    continue;
                }
               if(!set.contains(board[i][j])){
                set.add(board[i][j]);
               }
               else{
               return false;
            }


        }

        }

        for(int i =0;i<9;i++){
            HashSet<Character>set=new HashSet<>();
            boolean cleared = false;
            for(int j =0;j<9;j++){
                if(board[j][i]=='.'){
                    continue;
                }
               if(!set.contains(board[j][i])){
                set.add(board[j][i]);
               }
               else{
               return false;
               }
            
        }

        }
        for(int boxRow = 0; boxRow < 3; boxRow++){
    for(int boxCol = 0; boxCol < 3; boxCol++){
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                char c = board[boxRow*3 + i][boxCol*3 + j];
                if(c == '.') continue;
                if(set.contains(c)) return false;
                set.add(c);
            }
        }
    }
}

        
        
        return isvalid;
    }
}


