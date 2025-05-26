


//                Binary AND:


// public class Bit {

//     public static void main(String[] args) {

//         System.out.println((5 & 6));
        
//     }
    
    
// }




//     Binary OR:

// public class Bit {

//     public static void main(String[] args) {

//         System.out.println((5 | 6));
        
//     }
    
    
// }




//                                    Binary XOR:




// public class Bit {

//     public static void main(String[] args) {

//         System.out.println((5 ^ 6));
        
//     }
// }




//      one's compliement

// public class Bit {

//     public static void main(String[] args) {

//         System.out.println((~0));
        
//     }
// }






//              Binary Left Shift:



// public class Bit {

//     public static void main(String[] args) {

//         System.out.println((5<<2));
        
//     }
// }



//            Binary Right Shift:




// public class Bit {

//     public static void main(String[] args) {

//         System.out.println((5>>2));
        
//     }
// }




//                 Check if odd or even:



// public class Bit{

//     public static void oddorEven(int n){

//         int BitMask = 1;
//         if((n & BitMask) == 0){
//             System.out.println("Even Number");
        
//     }
//         else{
//             System.out.println("Odd Number");
//         }
//     }

//     public static void main(String[] args) {


//         oddorEven(5);
//         oddorEven(6);
//         oddorEven(7);
//         oddorEven(8);
//         oddorEven(9);
//         oddorEven(10);
        
//     }
// }





// //              Get ith Bit:

// public class Bit {

//     public static int GetithBit(int n, int i) {
//         int BitMask = 1 << i;

//         if ((n & BitMask) == 0) {
//             return 0;
//         } else {
//             return 1;
//         }
//     }

//     public static void main(String[] args) {
//         System.out.println(GetithBit(3, 0)); // Should print 0 since 9 in binary is 1001
//         System.out.println(GetithBit(9, 2)); // Should print 0 since 9 in binary is 1001
//         System.out.println(GetithBit(10, 2)); // Should print 0 since 9 in binary is 1001
//         System.out.println(GetithBit(11, 2)); // Should print 0 since 9 in binary is 1001
//         System.out.println(GetithBit(12,2)); // Should print 0 since 9 in binary is 1001
//     }}






// //              Get ith Bit:

// public class Bit {

    // public static int SetithBit(int n, int i) {
    //     int BitMask = 1 << i;

    //     return n | BitMask;
    // }

//     public static void main(String[] args) {
//         System.out.println(SetithBit(10, 2)); // Should print 0 since 9 in binary is 1001
    
//     }}





//              Clear ith Bit:

// public class Bit {

//     public static int ClearithBit(int n, int i) {
//         int BitMask = ~(1 << i);

//         return n & BitMask;
//     }



//         public static int SetithBit(int n, int i) {
//         int BitMask = 1 << i;

//         return n | BitMask;
//     }



//     public static int UpdateithBit(int n, int i, int newBit) {
      
//         // if(newBit == 0) {
//         //     return ClearithBit(n, i);
//         // } else {
//         //     return SetithBit(n, i);
//         // }


//         n = ClearithBit(n, i);
//         int BitMask = newBit << i;
//         return n | BitMask;
//     }

//     public static void main(String[] args) {
//         System.out.println(UpdateithBit(10, 2, 1)); // Should print 0 since 9 in binary is 1001
    
//     }}






//              Clear Last i Bits:



public class Bit {

    public static int ClearLastIBits(int n, int i) {
        int BitMask = (~0) << i;

        return n & BitMask;
    }


    public static void main(String[] args) {
        System.out.println(ClearLastIBits(15, 2)); // Should print 0 since 9 in binary is 1001
    
    }}


