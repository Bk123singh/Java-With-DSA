public class nqueens {
    // place N queens on an NXn chessboard such that no 2 queens can atttack each other
    // N=4
    public static void Nqueen(char board[][] , int row){
        //base
        if(row ==board.length){
            Printboard(board);
            return;
        }
        //colum loop
        for(int j=0; j<board.length;j++){
            board[row][j] = 'Q';
            Nqueen(board, row+1);//function call
            board[row][j] = 'X';//backtracking
            
        }
    }
    public static void Printboard(char board[][]){
        System.out.println("______________ chace board____________");
        for(int i=0; i<board.length;i++){
            for(int j=0; j<board.length;j++){
                System.out.print(board[i][j] + " ");
            }
        }
        System.out.println();
    }
   public static void main(String[] args) {
      int n =2;
      char board [][]= new char[n][n]; 
      // initialize 
      for(int i=0;i< n; i++){
        for(int j = 0; j<n;j++){
            board[i][j]= 'X';
        }
      }

      Nqueen(board, 0);

   } 
}