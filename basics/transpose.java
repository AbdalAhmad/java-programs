// What is Transpose?
// Transpose of a matrix is the process of swapping the rows to columns. For a 2x3 matrix,

public class transpose {

    public static void printMatrix(int [][] matrix){
     System.out.println("The matrix is: ");
     for(int i =0; i<matrix.length; i++){
        for(int j =0; j<matrix[0].length ; j++){
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
     }
   }
   
   public static void main (String args []){
    int row =2;
    int col =3;

    int [][] matrix = {{2,3,7},{5,6,7}};
    // display original matrix
    printMatrix(matrix);
    // transpose 
    int [][] transpose = new int[column][row];
    for(int i =0; i< row; i++){
        for(int j=0; j<cloumn ;j++){
            transpose[j][i] = matrix[i][j];

        }
    }
    // print the transposed matrix
   printMatrix(transpose);
   }
   
}