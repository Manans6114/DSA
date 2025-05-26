
//                                     TO PRINT A STAR PATTERN:

// import java.util.*;
// public class javabasics12 {
//      public static void main(String args[]){
//         for (int line=1; line<=4;line++){

//             for(int star=1; star<=line; star++){

//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//     }

// }


// public class javabasics12{
//     public static void main(String args[]){
//         int star;
//         int line;
//         for(line=1;line<=4;line++){
//             for(star=1;star<=line;star++){
//                 System.out.print("*");
//             }
//             System.out.println("");
//         }
//     }
// }

//                          TO PRINT INVERTEDE STAR PATTERN:

// import java.util.*;

// public class javabasics12 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for (int line = 1; line <= n; line++) {

//             for (int star = 1; star <= n - line + 1; star++) {
//                 System.out.print("*");
//             }
//             System.out.println();

//         }
//     }
// }




// public class javabasics12{
//     public static void main(String args[]){
//         int n =4;
//         for(int line=1;line<=n;line++){
//             for(int star=1;star<=n-line+1;star++){
//                 System.out.print("*");
//             }
//             System.out.println("");
//         }
//     }
// }










//                          TO PRINT HALF PYRAMID PATTERN:

// import java.util.*;
// public class javabasics12{
//     public static void main(String args[]){
//         int n=4;
//         for(int line = 1; line<=n; line++){
//             for(int number =1; number<=line; number++){
//                 System.out.print(number);

//             }
//             System.out.println();
//         }

//     }
// }


// public class javabasics12{
//     public static void main(String args[]){
//         int n=5;
//         for(int line=1;line<=n;line++){
//             for(int number=1;number<=line;number++){
//                 System.out.print(number);
//             }
//             System.out.println("");
//         }
//     }
// }







                            //  CHARACTER PATTERN:

// public class javabasics12 {
//     public static void main(String args[]) {
//         int n = 4;
//         char ch = 'A';

//         for (int line = 1; line <= n; line++) {
//             for (int chars = 1; chars <= line; chars++) {

//                 System.out.print(ch);
//                 ch++;
//             }
//             System.out.println();
//         }

//     }
// }

// Pratice ques:

// 1) Hollow rectangle PATTERN

// *********
// *       *
// *       *
// *       *
// *********      

// 2) INVERTED AND ROTATED HALF PYRAMID

//     *
//    **      
//   ***      
//  ****      

// 3)  INVERTED HALF PYRAMID WITH NUMBERS PATTERN:

//  12345
//  1234
//  123
//  12
//  1

//  4)  FLOYD'S TRIANGLE PATTERN:

// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15 

//  5) 0-1 tRIANGLE PATTERN:

// 1
// 01
// 101
// 0101
// 10101

//  6) BUTTERFLY PATTERN

// 7) SOLID RHOMBUS PATTERN

// 8) HOLLOW RHOMBUS PATTERN

//  9) DIAMOND PATTERN

//  10) NUMBER PYRAMID PATTERN

//  11) PALIDROMIC PATTERN WITH NUMBER PATTERNS

//    1 
//      212
//  32123
// 4321234
//        543212345
//   

//                    TO PRINT A HOLLOW RECTANGLE:

// import java.util.*;

// public class javabasics12 {
//         public static void main(String args[]) {
//                 Scanner sc = new Scanner(System.in);
//                 int n = sc.nextInt();

//                 int row = n;
//                 int stars = n - 1;
//                 int spaces = n - 2;

//                 while (row <= n - 1) {          //printing rows:

//                         if (row == 1 || row == n - 1) {
//                                 // print n no. of stars in frst and last row

//                                 for (int i = 0; i < stars; i++) {          //printing no. of stars
//                                         System.out.print("*");
//                                 }
//                         } else {
//                                 // print one star , print n-2 spaces , print one star
//                                 System.out.print("*");                   // printing first star

//                                 for (int i = 0; i < n - 2; i++) {          //printing spaces
//                                         System.out.print(" ");

//                                 }
//                                 System.out.print("*");          // printing last star

//                         }
//                         System.out.println();  //to move to the next line.
//                         row++;

//                 }

//         }
// }







//  QUES 2                      TO PRINT A HALF PYRAMID 



