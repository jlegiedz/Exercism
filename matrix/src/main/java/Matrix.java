import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by asia on 07/08/17.
 */
public class Matrix {
    int[][] mat;

    public Matrix(String matrixString){
        if((matrixString == null) || (matrixString.isEmpty())){
         throw new IllegalArgumentException("String of numbers has to be given");
        }
        stringToMatrix(matrixString);
    }


    public void stringToMatrix(String matrixString){
        String[] rows = matrixString.split("\n");
        // output {"9 8 7", "5 3 2", "6 6 7"}

        mat = new int[rows.length][];
        for (int i = 0; i < rows.length ; i++) {
            String[] cells = (rows[i].split(" "));
            // 9,8,7
            mat[i] = new int[cells.length];
            for (int j = 0; j < cells.length; j++) {
                mat[i][j] = Integer.parseInt(cells[j]);
                // [9,8,7]
            }
        }

    }

    public int getRowsCount(){
          return mat.length;
    }
    public int getColumnsCount(){
        return mat[0].length;
    }
    public int[] getRow(int index){
        return mat[index];
    }
    public int[] getColumn(int index){
        int[] column = new int[mat.length];
        for (int i = 0; i < mat.length ; i++) {
            column[i] = mat[i][index];
        }
        return column;
    }



}
