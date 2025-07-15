






//                              Recursion:
// 1. Recursion is a process in which a function calls itself directly or indirectly.
// 2. The function that calls itself is called a recursive function.
// 3. The recursion function must have a base case to terminate the recursive calls.
// 4. The base case is the condition under which the function stops calling itself.
// 5. The recursive case is the condition under which the function continues to call itself.




// to print no. in descending order:


public class recursion {

    public static void printDec(int n) {

       if (n == 1) {
          System.out.println(1);
       }
       
       else {
          System.out.print(n + " ");
          printDec(n - 1);
       }
    }
 
    public static void main(String[] args) {
       int n =10;
       printDec(n);
    }
 }
 




//  printing numbers in increasing order:



// public class recursion{

//    public static void printInc(int n){

//    if(n==1){
//       System.out.print(n + " ");
//       return;
//    }
//       printInc(n-1);
//       System.out.print(n + " ");

//    }

//    public static void main(String args[]) {
      
//       printInc(10);
//    }
// }


// Factorial :


// public class recursion{

//     public static int  fact(int n){

//       if(n==0){
//          return 1;                  //firstly values get stored in the stack the when base value is reached then
//                                     // Real work get started of implementing the formula
//       }

//       int fnm1 = fact(n-1);
//       int  fn = n * fact(n-1);   // factorial of n
//       return fn;

//     }

//     public static void main (String args[]){
//      System.out.println( fact(5));

//     }

// }



//sum of first n numbers:




// public class recursion{
//     public static int  printsum(int n){


//         if(n==1){
//             return 1;
//         }
//         int snm1 = printsum(n-1);
//         int sn = n + printsum(n-1);
//         return sn;


//     }
//     public static void main(String args[]){

//         System.out.println(printsum(10));
//     }
// }




// fibonacci series:


// public class recursion{

//     public static int fibo(int n){

//         if(n==0 || n==1){
//             return n ;
//         }

//         int fnm1 = fibo(n-1);
//         int fnm2 = fibo(n-2);

//         int fn =  fnm1 + fnm2;

//         return fn;
//     }

//     public static void main(String args[]){
//         System.out.println(fibo(28));
//     }
// }



//checking if array is sorted or not:





// public class recursion{
//     public static boolean issorted(int arr[], int i){     //i is index

//         //base case

//         if(i == arr.length-1){
//             return true;
//         }


//         if(arr[i]>arr[i+1]){
//             return false;

//         }

//         return issorted(arr,i+1);
     
//     }

//     public static void main(String args[]){

//         int arr[] = {1,2,3,4,5};

//         System.out.println(issorted(arr,4));
//     }
// }






// v - 9    first occurence:



// public class recursion{

//     public static int firstoccurence(int arr[] , int key , int i){

//         // base case
 
//         if(i == arr.length){
//             return -1;
//         }

//         if(arr[i] == key){
//             return i;
//         }

//         return firstoccurence(arr,key,i+1);
//     }
    

//     public static void main(String args[]){

//         int arr[] = {3,5,2,6,5,8,3,6};

//         System.out.println(firstoccurence(arr , 6, 0));

//     }
// }



// v -10     : last occurence:   need to revise again:


// public class recursion{

//     public static int  lastoccurence(int arr[], int key, int i){

//         if(i == arr.length){
//             return -1;

//         // line to call last occurence index:

//         int isFound = lastoccurence(arr,key,i+1);
        
//         if(isFound == -1 && arr[i] == key){
//             return i;
//         }
//         return  isFound;
//     }


//     public static void main(String args[]){

//         int arr[] = {3,5,2,6,5,8,3,6};

//         System.out.println(lastoccurence(arr , 5, 0));

//     }
// }





// v-11:    print x to the power n:



public class recursion{

    public static int power(int x , int n){

        if(n==0){
            return 1;
        }

        // int xnm1 = power(x,n-1);
        // int xn = x * xnm1;
        // return xn;

        return x * power(x,n-1);
    }

    public static void main (String args[]){

        System.out.println(power (2,4));

    }
}



//v -11

//optimised power

// public class recursion{


//     public static int optimisedpower(int a,int n){
//         if(n==0){
//             return 1;
//         }

//         int halfpower = optimisedpower(a,n/2);
//         int halfpowersq = halfpower * optimisedpower(a,n/2);
//         if(n % 2 != 0){
//           halfpowersq = a * halfpowersq;
//         }
//         return halfpowersq;
//     }

//     public static void main (String args[]){

//         int a = 2;
//         int n=10;

//         System.out.println(optimisedpower(a,n));

//     }
// }



// // Tiling problem:


// public class recursion{

//     public static int tilingProblem(int n){   // 2* N problem same for 4*n


//                 //   base case

//         if(n==0 || n==1){
//             return 1;
//         }



//         // //   vertical choice :
//         // int fnm1 = tilingProblem(n-1);
          
//         //     // horizontal case : 
//         // int fnm2 = tilingProblem(n-2);

//         // int totalways = fnm1 + fnm2;

//         // return totalways;

//         return tilingProblem(n-1) + tilingProblem(n-2);

//     }
//     public static void main (String args[]){

//         System.out.println(tilingProblem(4));
//     }
// }




// remove duplicates:


// public class recursion{

//     public static void removeduplicates(String str, int idx ,  StringBuilder newStr , boolean map[]){

//         if( idx == str.length()){
//             System.out.println(newStr);
//             return;
//         }
//         //kaam:

//         char currChar = str.charAt(idx);

//         if(map[currChar - 'a'] == true){

//             //duplicate
//             removeduplicates(str, idx+1,newStr , map);
        
//         }

//             else{
//                 map[currChar - 'a'] = true;
//                 removeduplicates(str, idx+1,newStr.append(currChar) , map);
                
//             }
//         }


//         public static void main(String args[]){

//                 String str = "mannaannaann";
//                 removeduplicates(str ,0,new StringBuilder("") , new boolean [26]);
            
        
    
// }}




// friernds problem:


// public class recursion {

//     public static int friendspairing(int n){

//         //base case
//         if( n==1 || n==2){
//             return n;
//         }

//         //choice 
//         //single

//         int fnm1 = friendspairing(n-1);

//         //pair
//         int fnm2 = friendspairing(n-2);

//         int pairways  = (n-1) * fnm2;


//         //totways
//          int totways =  fnm1 + pairways;

//          return totways;
//     }

//     public static void main(String args[]){

//         System.out.println(friendspairing(3));

//     }
// }





 // Binary String problem: for non consecutive 1:
 
 
//  public class recursion{

//     public static void BinaryString(int n, int Lastplace ,  String str){

//         //base case:

//         if(n == 0){
//             System.out.println(str);
//             return;
//         } 

//         //kaam

//         BinaryString(n-1,0,str+"0");

//         if(Lastplace == 0){

//             BinaryString(n-1,1,str+"1");
//         }
//     } 

//     public static void main(String args[]){

//         BinaryString(3 , 0, "");

//     }
//  }



 //Binary String problem :  for non consecutive zeros:





//  public class recursion{

//     public static void BinaryString(int n, int Lastplace ,  String str){

//         //base case:

//         if(n == 0){
//             System.out.println(str);
//             return;
//         } 

//         //kaam

//         BinaryString(n-1,0,str+"1");

//         if(Lastplace == 0){

//             BinaryString(n-1,1,str+"0");
//         }
//     } 

//     public static void main(String args[]){

//         BinaryString(3 , 0, "");

//     }
//  }




//practice: