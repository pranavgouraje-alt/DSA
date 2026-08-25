class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>>ans=new ArrayList<>();

        boolean[] cols = new boolean[n];
        boolean[]upperdigo=new boolean[2*n];
        boolean[]lowerdigo=new boolean[2*n];

        char board[][]=new char[n][n];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                board[i][j]= '.';
            }
        }

        backtrack(0,n,board,ans,cols,upperdigo,lowerdigo);
        
        return ans;
        
    }

    private void backtrack(int col, int n, char[][] board, List<List<String>> results, boolean[] cols, boolean[] upperdigo, boolean[] lowerdigo) {

        if(col==n)
        {
           results.add(construct(board));
           return;
        }

        for(int row=0;row<n;row++)
        {
            int upperindex=row - col + n;
            int lowerindex=row+col;
            if(!cols[row]&&!upperdigo[upperindex]&&!lowerdigo[lowerindex])
            {
                board[row][col]='Q';
                cols[row]=true;
                upperdigo[upperindex]=true;
                lowerdigo[lowerindex]=true;

                backtrack(col+1,n,board,results,cols,upperdigo,lowerdigo);
                board[row][col]='.';
                cols[row]=false;
                upperdigo[upperindex]=false;
                lowerdigo[lowerindex]=false;
        

            }
        }

    }
    private List<String> construct(char[][] board) 
    {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            list.add(new String(board[i]));
        }
        return list;
    }
}