public class MatricsUtil {

    static void rotatematrix(int rowEndIndex, int colEndIndex, int mat[][]) {
        int row = 0;
        int col = 0;
        int prev;
        int curr;

        while(row < rowEndIndex && col < colEndIndex) {
            if(row+1 == rowEndIndex || col +1 == colEndIndex) {
                break;
            }
            prev = mat[row+1][col];
            for(int i = col; i<colEndIndex; i++) {
                curr = mat[row][i];
                mat[row][i] = prev;
                prev = curr;
            }
            row++;
            for(int i = row; i<rowEndIndex; i++) {
                curr = mat[row][colEndIndex-1];
                mat[row][colEndIndex-1] = prev;
                prev = curr;
            }
            colEndIndex--;
            if(colEndIndex > 0) {
                curr = mat[rowEndIndex-1][colEndIndex];
                mat[rowEndIndex-1][colEndIndex] = prev;
                prev = curr;
                colEndIndex--;
            }
            if(rowEndIndex > 0) {
                curr = mat[rowEndIndex-1][0];
                mat[rowEndIndex-1][0] = prev;
                prev = curr;
            }
        }

    }
}
