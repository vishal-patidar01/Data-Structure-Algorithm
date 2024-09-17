public class SpiralMatrix {

    // public static void spiralMatrix(int matrix[][]) {
    //     int startRow = 0;
    //     int endRow = matrix.length-1;
    //     int startCol = 0;
    //     int endCol = matrix[0].length-1;


    //     while(startRow <= endRow && startCol <= endCol) {
    //         for(int j=startCol; j<=endCol; j++) {
    //             System.out.print(matrix[startRow][j]);
    //         }

    //         for(int i=startRow+1; i<=endRow; i++) {
    //             System.out.print(matrix[i][endCol]);
    //         }

    //         for(int j=endCol-1; j>=startCol; j--) {
    //             if(startCol == endRow ) {
    //                 return;
    //             }
    //             System.out.print(matrix[endRow][j]);
    //         }

    //         for(int i=endRow-1; i>=startRow; i--) {
    //             if(endRow == startRow) {
    //               return;
    //             }
    //             System.out.print(matrix[i][startCol]);
    //         }
    //         startRow++;
    //         startCol++;
    //         endRow--;
    //         endCol--;
    //     }
    // }
    // public static void main(String args[]) {
    //     int matrix[][] = {{1, 2, 3, 4},
    //                       {5, 6, 7, 8},
    //                       {9, 10, 11, 12},
    //                       {13, 14, 15, 16}
    //                     };
    //     spiralMatrix(matrix);
    // }


  

        public static void spiralMatrix(int matrix[][]) {
            int startRow = 0;
            int endRow = matrix.length - 1;    // Corrected: matrix.length gives the number of rows
            int startCol = 0;
            int endCol = matrix[0].length - 1; // matrix[0].length gives the number of columns
    
            while (startRow <= endRow && startCol <= endCol) {
                // Traverse right
                for (int j = startCol; j <= endCol; j++) {
                    System.out.print(matrix[startRow][j] + " ");
                }
    
                // Traverse down
                for (int i = startRow + 1; i <= endRow; i++) {
                    System.out.print(matrix[i][endCol] + " ");
                }
    
                // Traverse left, only if there are more than one row remaining
                if (startRow < endRow) {
                    for (int j = endCol - 1; j >= startCol; j--) {
                        System.out.print(matrix[endRow][j] + " ");
                    }
                }
    
                // Traverse up, only if there are more than one column remaining
                if (startCol < endCol) {
                    for (int i = endRow - 1; i > startRow; i--) {
                        System.out.print(matrix[i][startCol] + " ");
                    }
                }
    
                startRow++;
                endRow--;
                startCol++;
                endCol--;
            }
        }
    
        public static void main(String args[]) {
            int matrix[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
            };
            spiralMatrix(matrix);
        }
    }
    

