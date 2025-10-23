public class prjoctie{

    public static void printmatrix(int matrix[][]){
        System.out.println("the matrix is:");
      for (int i = 0; i < matrix.length; i++) {
        for(int j = 0 ; j <matrix[0].length;j++){
            System.out.println(matrix[i][j] + " ");
        }
        System.out.println();
          
      }
    }
    public static void main(String[] args) {
      int row = 2,coloum =3;
      int matrix[][] = {{2,3,7,}, {5,6,7}};
      //Display the original matrix
    printmatrix(matrix); 
      
      int transpose[][] = new int[coloum] [row];
      for(int i = 0 ; i <row; i++){
        for(int j = 0; j <coloum; j++){
            transpose[j][i]=matrix[i][j];
        }
      }

    printmatrix(transpose);
    }
}