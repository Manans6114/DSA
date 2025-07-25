


// Recursion:

// 1. Recursion is a process in which a function calls itself directly or indirectly.
// 2. The function that calls itself is called a recursive function.
// 3. The recursion function must have a base case to terminate the recursive calls.
// 4. The base case is the condition under which the function stops calling itself.
// 5. The recursive case is the condition under which the function continues to call itself.






// to print no. in descending order:



// public class recursion {

//     public static void printDec(int n) {

//         if (n == 1) {
//             System.out.println(1);

//         } else {
//             System.out.print(n + " ");
//             printDec(n - 1);
//         }
//     }

//     public static void main(String[] args) {
//         int n = 10;
//         printDec(n);
//     }
// }




// printing numbers in increasing order:





// public class recursion{

//     public static void printInc(int n){

//         if(n == 1){
//             System.out.println(n + " ");
//             return;

//         }else{
//             printInc(n-1);
//             System.out.println(n + " ");
//         }
//     }

//     public static void main(String args[]){
//         printInc(10);
//     }
// }




// Factorial :



// public class Recursion {

//     public static int fact(int n) {

//         if (n == 0) {
//             return 1;
//             // First, values get stored in the call stack.
//             // When the base value (n == 0) is reached, 
//             // the real work starts — implementing the factorial formula.
//         }

//         int fnm1 = fact(n - 1);      // Recursive call: factorial of (n-1)
//         int fn = n * fnm1;           // Actual multiplication step: n * (n-1)!
//         return fn;
//     }

//     public static void main(String[] args) {
//         System.out.println(fact(5));  // Expected output: 120
//     }
// }





// sum of first n numbers:




// public class recursion{

//     public static int Calcsumm(int n){

//         if(n ==1){
//             return 1;
//         }

//         int snm1 = Calcsumm(n-1);
//         int sn = n + snm1;
//         return sn;
//     }
    
//     public static void main(String args[]){

//         System.out.println(Calcsumm(5));

//     }
// }




// fibonacci series:



// public class recursion{

//     public static int fibo(int n){

//         if(n==0 || n==1){
//             return n;
//         }
//         int fnm1  = fibo(n-1);
//         int fnm2 = fibo(n-2);

//         int fn = fnm1 +fnm2;
//         return fn;
//     }
//     public static void main (String args[]){

//         System.out.println(fibo(25));
//     }
// }






// checking if array is sorted or not:




// public class Recursion {

//     public static boolean isSorted(int arr[], int i) {
//         // Base case
//         if (i == arr.length - 1) {
//             return true;
//         }

//         if (arr[i] > arr[i + 1]) {
//             return false;
//         }

//         return isSorted(arr, i + 1);
//     }

//     public static void main(String args[]) {
//         int arr[] = {1, 2, 3, 4, 5};
//         System.out.println(isSorted(arr, 4));
//     }
// }




 

// v - 9 first occurence:



// public class Recursion {

//     public static int firstOccurrence(int[] arr, int key, int i) {
//         // Base case
//         if (i == arr.length) {
//             return -1;
//         }

//         // If the current element matches the key
//         if (arr[i] == key) {
//             return i;
//         }

//         // Recursive call to the next element
//         return firstOccurrence(arr, key, i + 1);
//     }

//     public static void main(String[] args) {
//         int[] arr = {3, 5, 2, 6, 5, 8, 3, 6};

//         System.out.println(firstOccurrence(arr, 6, 0)); // Output: 3
//     }
// }





// v -10 : last occurence: need to revise again:




// public class recursion{

// public static int lastoccurence(int arr[], int key, int i){

// if(i == arr.length){
// return -1;

// // line to call last occurence index:

// int isFound = lastoccurence(arr,key,i+1);

// if(isFound == -1 && arr[i] == key){
// return i;
// }
// return isFound;
// }

// public static void main(String args[]){

// int arr[] = {3,5,2,6,5,8,3,6};

// System.out.println(lastoccurence(arr , 5, 0));

// }
// }





// v-11: print x to the power n:






// public class Recursion {

 
//     public static int power(int x, int n) {

//         // Base case
//         if (n == 0) {
//             return 1;
//         }
 
//         // Recursive call
//         return x * power(x, n - 1);
//     }

//     public static void main(String[] args) {
//         System.out.println(power(2, 4)); // Output: 16
//     }
// }






// v -11

// optimised power




// public class Recursion {

//     public static int optimisedPower(int a, int n) {

//         if(n < 0) {

//             n = 1/n;

//             if(n == Integer.MIN_VALUE){
//                 return a * optimisedPower(a,Integer.MIN_VALUE);
//             }
//             n = -n;
//         }



//         if (n == 0) {
//             return 1;
//         }

//         int halfPower = optimisedPower(a, n / 2);
//         int halfPowerSq = halfPower * halfPower;

//         if (n % 2 != 0) {
//             halfPowerSq = a * halfPowerSq;
//         }

//         return halfPowerSq;
//     }

//     public static void main(String args[]) {
//         int a = 2;
//         int n = -10;

//         System.out.println(optimisedPower(a, n));
//     }
// }






// // Tiling problem:



// public class Recursion {

//     public static int TilingProblem(int n) { // 2 x n(Floor Size)


//         //BAse case:

//         if(n==0 || n==1){
//             return 1;
//         }


//         //kaam

//         //Vertical Choice:
//         int fnm1 = TilingProblem(n-1);

//         //horizontal Choice:
//         int fnm2 = TilingProblem(n-2);

//         //Total ways:
//         int totalWays = fnm1 + fnm2;

//         return totalWays;

// }

//     public static void main(String[] args) {

//         System.out.println(TilingProblem(4));
//     }
// }






// remove duplicates:



// public class Recursion {

//     public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean[] map) {

//         if (idx == str.length()) {
//             System.out.println(newStr);
//             return;
//         }

//         // Work
//         char currChar = str.charAt(idx);

//         if (map[currChar - 'a']) {
//             // Duplicate character
//             removeDuplicates(str, idx + 1, newStr, map);
            
//         } else {
//             map[currChar - 'a'] = true;
//             removeDuplicates(str, idx + 1, newStr.append(currChar), map);
//         }
//     }

//     public static void main(String[] args) {
//         String str = "mannaannaann";
//         removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
//     }
// }






// friernds problem:




// public class Recursion {

//     public static int friendspairing(int n) {

//         // base case
//         if (n == 1 || n == 2) {
//             return n;
//         }

//         // choice
//         // single

//         int fnm1 = friendspairing(n - 1); //first case of being single

//         // pair
//         int fnm2 = friendspairing(n - 2);

//         int pairways = (n - 1) * fnm2;   // second case of being in pairs

//         // totways
//         int totways = fnm1 + pairways;

//         return totways;
//     }

//     public static void main(String args[]) {

//         System.out.println(friendspairing(3));

//     }
// }



// public class Recursion{

//     public static int friendspairing(int n){

//         if(n==1 || n==2){
//             return n;
//         }

//         //single choice :

//         int fnm1 = friendspairing(n-1);

//         //pairchoice:

//         int fnm2 = friendspairing(n-2);

//         int pairways = (n-1)* fnm2;

//         //totways:
//         int totways = fnm1 + pairways;

//         return totways;
//     }

//     public static void main(String args[]){

//         System.out.println(friendspairing(3));

//     }
// }




// Binary String problem: for non consecutive 1:


// public class Recursion {

//     public static void BinaryString(int n, int lastPlace, String str) {

//         // Base case
//         if (n == 0) {
//             System.out.println(str);
//             return;
//         }

//         // Recursive calls
//         BinaryString(n - 1, 0, str + "0");

//         if (lastPlace == 0) {
//             BinaryString(n - 1, 1, str + "1");
//         }
//     }

//     public static void main(String[] args) {
//         BinaryString(3, 0, "");
//     }
// }





// Binary String problem : for non consecutive zeros:

// public class recursion{

// public static void BinaryString(int n, int Lastplace , String str){

// //base case:

// if(n == 0){
// System.out.println(str);
// return;
// }

// //kaam

// BinaryString(n-1,0,str+"1");

// if(Lastplace == 0){

// BinaryString(n-1,1,str+"0");
// }
// }

// public static void main(String args[]){

// BinaryString(3 , 0, "");

// }
// }

// practice: