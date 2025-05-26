
// import java.lang.classfile.attribute.SourceIDAttribute;



//  To find a target in the 2d array

// import java.util.*;
// public class twodarray {

//     public static boolean Search(int matrix[][], int target){

//         for(int i =0; i<matrix.length; i++){
//             for(int j=0; j<matrix[0].length; j++){
//                 if(matrix[i][j] == target){
//                     System.out.println("FOUND AT INDEX AT (" + i +"," + j + ")");
//                     return true;
//                 }
//             }
//         }
//         System.out.println("Key not fOUND.");
//         return false;
//     }




//     public static void main(String[] args) {

//         int matrix[][] = new int[3][3];

//         int n = matrix.length;
//         int m = matrix[0].length;


//         Scanner sc = new Scanner(System.in);
//         for(int i =0;i<n;i++){
//             for(int j =0;j<m;j++){
//                 matrix[i][j] = sc.nextInt();
              
//             }

//         }
        
//         for(int i =0;i<n;i++){
//             for(int j =0;j<m;j++){
//                 System.out.print(matrix[i][j] + " ");


        
//     }
    
//     System.out.println();
    
// }
// Search(matrix,6);

// }

// }








//        To find largest and smallest element in an 2d array:











// import java.util.*;

// public class twodarray {

//     // Function to search for an element
//     public static boolean Search(int matrix[][], int target) {

//         for (int i = 0; i < matrix.length; i++) {
//             for (int j = 0; j < matrix[0].length; j++) {

//                 if (matrix[i][j] == target) {
//                     System.out.println("FOUND AT INDEX AT (" + i + "," + j + ")");
//                     return true;
//                 }
//             }
//         }
//         System.out.println("Key not FOUND.");
//         return false;
//     }

//     // Function to find the largest element using normal for loops
//     public static int findLargest(int[][] matrix) {

//         int largest = Integer.MIN_VALUE;

//         for (int i = 0; i < matrix.length; i++) {
//             for (int j = 0; j < matrix[0].length; j++) {

//                 if (matrix[i][j] > largest) {
//                     largest = matrix[i][j];
//                 }
//             }
//         }
//         return largest;
//     }

//     // Function to find the smallest element using normal for loops
//     public static int findSmallest(int[][] matrix) {

//         int smallest = Integer.MAX_VALUE;

//         for (int i = 0; i < matrix.length; i++) {
//             for (int j = 0; j < matrix[0].length; j++) {

//                 if (matrix[i][j] < smallest) {
//                     smallest = matrix[i][j];
//                 }
//             }
//         }
//         return smallest;
//     }

//     public static void main(String[] args) {
//         int matrix[][] = new int[3][3];
//         int n = matrix.length;
//         int m = matrix[0].length;

//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter 3x3 matrix values:");

//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 matrix[i][j] = sc.nextInt();
//             }
//         }

//         System.out.println("Matrix:");
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }

//         // Search for a specific element
//         Search(matrix, 5);

//         // Find and print largest and smallest elements
//         int largest = findLargest(matrix);
//         int smallest = findSmallest(matrix);

//         System.out.println("Largest element in the matrix: " + largest);
//         System.out.println("Smallest element in the matrix: " + smallest);
//     }
// }





//                                                      Spiral Matrix code:








// public class twodarray{

//     public static void printSpiral(int matrix[][]){

//         int startRow = 0;
//         int startCol = 0;
//         int endRow = matrix.length-1;
//         int endCol = matrix[0].length-1;

//         while( startRow<=endRow && startCol<=endCol){

//             //Top
//             for( int j = startCol; j<=endCol; j++){
//                 System.out.print(matrix[startRow][j] + " ");
//             }

//             //Right:
//             for(int i = startRow+1; i<=endRow; i++){
//                 System.out.print(matrix[i][endCol] + " ");
//             }

//             //Bottom:
//             for(int j = endCol-1 ; j>= startCol ; j--){

//                 if(startRow == endRow){
//                     break;
//                 }
//                 System.out.print(matrix[endRow][j] + " ");
//             }

//             //Left:
//             for(int i = endRow-1; i>=startRow+1; i--){

//                 if(startCol == endCol){
//                     break;
//                 }
//                 System.out.print(matrix[i][startCol] + " ");
//             }

//             startCol++;
//             startRow++;
//             endCol--;
//             endRow--;
//         }
//     }


//     public static void main(String[] args) {

        // int matrix[][] = {{1,2,3,4},
        //                   {5,6,7,8},
        //                   {9,10,11,12},
        //                   {13,14,15,16}};


//        printSpiral(matrix);
//     }
// }




  // public class twodarray{

  //   public static void printSpiral(int matrix[][]){

  //     int startrow =0;
  //     int startcol =0;
  //     int endrow = matrix.length-1;
  //     int endcol = matrix[0].length-1;

  //     while(startrow <= endrow && startcol <=endcol){

  //       //top:

  //       for(int j = startcol; j<=endcol; j++){
  //         System.out.print(matrix[startrow][j] + " ");
  //       }

  //       //right:

  //       for(int i = startrow +1 ; i<= endrow; i++){
  //         System.out.print(matrix[i][endcol] + " ");
  //       }

  //       //bottom:

  //       for(int j = endcol-1; j>=startcol; j--){
  //         if(startrow == endrow){
  //           break;
  //         }
  //         System.out.print(matrix[endrow][j] + " ");
  //       }

  //       //left:
  //       for(int i=endrow-1;i>=startrow+1; i--){
  //         if(startcol == endcol){
  //           break;
  //         }
  //         System.out.print(matrix[i][startcol] + " ");
  //       }

  //       startrow++;
  //       startcol++;
  //       endrow--;
  //       endcol--;
  //     }

  //   }


  //   public static void main(String[] args) {

  //     int matrix[][] = {{1,2,3,4},
  //                       {5,6,7,8},
  //                       {9,10,11,12},
  //                       {13,14,15,16}};


  //     printSpiral(matrix);
      
  //   }
  // }

  


  //                               Daigonal Sum:


  // public class twodarray {

  //       public static int diagonalSum(int matrix[][]) {
  //           int sum = 0;
    
  //       //     for(int i = 0; i < matrix.length; i++) {
  //       //         for(int j = 0; j < matrix[0].length; j++) {

  //       //             if(i == j) {
  //       //                 sum += matrix[i][j];
  //       //             }
  //       //              else if(i + j == matrix.length - 1) {
  //       //                 sum += matrix[i][j];
  //       //             }
  //       //         }
  //       //     }

                         
         
  //                                 //More Optimized:

  //       for(int i =0; i<matrix.length; i++){

  //               //pd:
  //               sum += matrix[i][i];

  //               //SD
  //               if(i != matrix.length-1-i){
  //               sum += matrix[i][matrix.length-1-i];
  //                  }

  //               }
  //           return sum;
  //       }
    
  //       public static void main(String args[]) {
  //           int matrix[][] = {
  //               {1, 2, 3, 4},
  //               {5, 6, 7, 8},
  //               {9, 10, 11, 12},
  //               {13, 14, 15, 16}
  //           };
    
  //           System.out.println(diagonalSum(matrix));
  //       }
  //   }
    




// Search in Sorted 2D matrix



// public class twodarray {

//   // Top-right approach (your original one)
//   public static boolean stairCaseSearchTopRight(int matrix[][], int key) {


//     int row = 0;
//     int col = matrix[0].length - 1;



//     while (row < matrix.length && col >= 0) {

//       if (matrix[row][col] == key) {
//         System.out.println("Top-Right Search: Found key at (" + row + ", " + col + ")");
//         return true;
//       }
//        else if (key < matrix[row][col]) {
//         col--;
//       }
//        else {
//         row++;
//       }
//     }

//     System.out.println("Top-Right Search: Key Not Found");
//     return false;
//   }
  

//   // Bottom-left approach (new case)
//   public static boolean stairCaseSearchBottomLeft(int matrix[][], int key) {


//     int row = matrix.length - 1;
//     int col = 0;

//     while (row >= 0 && col < matrix[0].length) {
//       if (matrix[row][col] == key) {
//         System.out.println("Bottom-Left Search: Found key at (" + row + ", " + col + ")");
//         return true;

//       } else if (key < matrix[row][col]) {
//         row--;
//       }
//        else {
//         col++;
//       }
//     }

//     System.out.println("Bottom-Left Search: Key Not Found");
//     return false;
//   }



//   public static void main(String[] args) {
//     int matrix[][] = {
//       {10, 20, 30, 40},
//       {15, 25, 35, 45},
//       {27, 29, 37, 48},
//       {32, 33, 39, 50}
//     };

//     int key1 = 33;
//     int key2 = 100;

//     // Test both methods
//     stairCaseSearchTopRight(matrix, key1);
//     stairCaseSearchBottomLeft(matrix, key1);
                    
//     stairCaseSearchTopRight(matrix, key2);
//     stairCaseSearchBottomLeft(matrix, key2);

//   }
// }







// no. of 7's present in the 2d arry


// public class twodarray{

//   public static void main(String[] args) {
    
//     int matrix [][] = {{4,7,7},{8,8,7}};

//     int countof7 =0;

//     for(int i =0; i<matrix.length; i++){
//       for(int j=0; j<matrix[0].length; j++){
//         if(matrix[i][j] == 7){
//           countof7++;
//         }
//       }
//     }
//     System.out.println("Count of 7's : " + countof7);
//   }
    
// }








// Transpose of a matrix:






// public class twodarray {

//   public static int[][] getTranspose(int[][] matrix) {
//       int row = matrix.length;
//       int column = matrix[0].length;

//       int[][] transpose = new int[column][row];

//       for (int i = 0; i < column; i++) { // outer loop for columns
//           for (int j = 0; j < row; j++) { // inner loop for rows
//               transpose[i][j] = matrix[j][i];
//           }
//       }

//       return transpose;
//   }


//   public static void printMatrix(int[][] matrix) {
//       System.out.println("The Matrix is: ");
//       for (int i = 0; i < matrix.length; i++) {
//           for (int j = 0; j < matrix[0].length; j++) {
//               System.out.print(matrix[i][j] + " ");
//           }
//           System.out.println();
//       }
//   }

//   public static void main(String[] args) {
//       int matrix[][] = {
//           {4, 7, 8},
//           {8, 8, 7}
//       };

//       int[][] ans = getTranspose(matrix);

//       printMatrix(matrix);
//       System.out.println("The transposed matrix is :");
//       printMatrix(ans); // Print the transposed matrix
//   }
// }






//Print sum of second row elements:



// public class twodarray {

//   public static int getSumOf2ndRow(int matrix[][]) {
//       int sum = 0;
      
//       // Correct way to get the second row (index 1)
//       int oneArray[] = matrix[1];

//       for (int i = 0; i < oneArray.length; i++) {
//           sum = sum + oneArray[i];
//       }

//       return sum;
//   }

//   public static void main(String[] args) {
//       int matrix[][] = { {1, 4, 9}, {11, 4, 3}, {2, 2, 3} };

//       int sum = getSumOf2ndRow(matrix);

//       System.out.println("Sum of 2nd row: " + sum);
//   }
// }







//       Richest Customer Wealth:


public class twodarray{

  public static void main(String[] args) {
    
    int account[][] = {{}}
  }
}