// package corejava;


 
//                               PRINTING HOLLOW RECTANGLE:



// public class pattern2 {

//     public static void hollowrectangle(int totrow, int totcol){
//         //outer loop
//         for(int i=1;i<=totrow;i++){
//             //inner loop
//             for( int j = 1; j<=totcol;j++){

//                 if(i==1 || i==totrow || j==1  || j == totcol){
//                     System.out.print("*");
//                 }
//                 else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         hollowrectangle(5,5);
//     }
    
// }




//                     PRINTING INVERTED AND ROTATED HALF PYRAMID:
public class pattern2{

   


    public static void invertedpyramid(int n){


        for(int i =1;i<=n;i++){
            for(int j =1; j<=n-i;j++){
                System.out.print(" ");
            }
        
        for(int j =1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}

    
    public static void  main(String args[]){

        invertedpyramid(7);
     
    }
}