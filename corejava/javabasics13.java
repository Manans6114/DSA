
//                                 FUNCTIONS AND METHODS:   reusable part of code / Bloack of code

                                              // syntax:





// public class javabasics13 {


//     public static void printhelloworld(){
//         System.out.println("Hello world");
//         System.out.println("Hello world");
//         System.out.println("Hello world");
//         return ;
//     }

    
//     public static void main(String args[]){         //main  is a function   //void is return type
//         printhelloworld();  // FUNCTION CALL
         
//     }
    
// }





                                                  //Syntax with parameters:

// eg 1
              
//  import java.util.*;
// public class javabasics13 {
//     public static void printhelloworld(){
//         System.out.println("Hello world");
//         System.out.println("Hello world");
//         System.out.println("Hello world");
        
//     }

//     public static void calculatesum(){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum = a+b;
//         System.out.print("Sum is : " + sum);
//     }
//     public static void main(String args[]){         //main  is a function   //void is return type
//         calculatesum();  // FUNCTION CALL
         
//     }
    
// }





// eg 2




              
// import java.util.*;
// public class javabasics13 {
 
//     public static void calculatesum(int a , int b){
       
//         int sum = a+b;
//         System.out.println("Sum is : " + sum);

//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();        //main  is a function   //void is return type
//         calculatesum(a,b);  // FUNCTION CALL
    
//     }
    
// }





//   eg 3




// import java.util.*;
// public class javabasics13 {
    
//     public static int calculatesum(int num1 , int num2 ){           // inside paranthesis are called PARAMETERS AND FORMAL PARAMETERS
       
//         int sum = num1 + num2;
//         return sum;
        
//     }
//     public static void main(String args[]){   //main  is a function   //void is return type
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum = calculatesum(a,b);  // FUNCTION CALL    //  INSIDE PARANTHESIS ARE CALLED ARGUEMENTS OR ACTUAL PARAMETERS
//            System.out.print("Sum is : " + sum);
//     }
//     }






                                    //   CALL STACK   (WHAT HAPPENS IN MEMORY):



//                                CALL BY VALUE / CALL REFERENCE:






// SWAP VALUE EXCHANGE:




// public class javabasics13{
//     public static void main(String args[]){

//         int a=5;
//         int b=10;
           
//         //SWAP

//         int temp = a;
//         a=b;
//         b=temp;

//         System.out.println("a = " + a);
//         System.out.print("b = " + b);
//     }
// }




//   SAME SWAPPING CODE IN A FUNCTION:



                                     
// public class javabasics13{

//     public static void swap(int a, int b){
//          //SWAP

//         int temp = a;
//         a=b;
//         b=temp;

//         System.out.println("a = " + a);
//         System.out.print("b = " + b);
    
//     }
//     public static void main(String args[]){
//         int a=5;
//         int b=10;
//         swap(a,b);
           
        
// }
// }



// Practice


// import java.util.*;
// public class javabasics13{
//     public static void swap(){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
        
//         int temp =a;
//         a=b;
//         b=temp;

//         System.out.println("a is : " + a);
//         System.out.println("b is : " + b);
 
//     }

//         public static void main(String args[]){
//             int a =5;
//             int b =6;
//             swap();
//             System.out.println("a is : " + a);
//             System.out.println("b is : " + b);
//         }



//     }








//             FIND PRODUCT OF A AND B :






// public class javabasics13{

//      public static int multiply(int a , int b){

//         int product = a * b;
//         return product;

//     }

//     public static void main(String args[]){
             
//         int prod = multiply(3,5);
//         System.out.println("a * b :" + prod);
//         prod = multiply(10,20);
//         System.out.println("a * b : " + prod);
        
//     }
// }






// public class javabasics13{

//     public static int multiply(int a , int b){
//         int product=a*b;
       
//         return product;
//     }
    
//     public static void main(String args[]){
//          int product = multiply(9,8);
//          System.out.println("Product is :"  + product);
//     }
// }





//      TO FIND THE FACTORIAL OF A GIVEN NUMBER: N = 1* 2*3*4*5* ......*N:






// public class javabasics13{


//     public static int factorial(int n){

//         int f=1;

//         for(int i=1; i<=n; i++){

//             f = f * i;
//         }

//         return f;       //factorial of n.
//     }
//     public static void main(String args[]){
             
//     //   int fact = factorial(5);
//       System.out.print(factorial(5));
        
//     }
// }






// public class javabasics13{
//     public static int factorial(int n){
      
//         int fact=1;
//         for(int i=1;i<=n;i++){
//             fact*=i;
//         }

//         return fact;
//     }
//     public static void main(String args[]){
//        System.out.println(factorial(5));

//     //    System.out.println("Factorial is: " + fact);


//     }
// }





//                  TO FIND BINOMIAL COEEFFICIENT:



// public class javabasics13{

//      public static int multiply(int a , int b){

//         int product = a * b;
//         return product;

//     }

//     public static int factorial(int n){

//         int f=1;


//         for(int i=1; i<=n; i++){
//             f = f * i;
//         }
//         return f;       //factorial of n.
//     }

//     public static int bincoeff(int n , int r) {
//            int fact_n= factorial(n);
//            int fact_r= factorial(r);
//            int fact_nmr = factorial(n-r);

//            int bincoeff = fact_n/(fact_r*fact_nmr);
//            return bincoeff;


//     }
//     public static void main(String args[]){
             
//     //   int fact = factorial(5);
//       System.out.println(bincoeff(10,2));
        
//     }
// }

// public class javabasics13{

//     public static int factorial(int n){
//         int f=1;
//         for(int i =1;i<=n;i++){
//             f*=i;
//         }
//         return f;
//     }
//     public static int binocoef(int n,int r){
//         int fact_n= factorial(n);
//         int fact_r= factorial(r);
//         int fact_nmr= factorial(n-r);

//         int bnc = fact_n/(fact_r*fact_nmr);
//         return bnc;


//     }

//     public static void main(String args[]){
//         System.out.println(binocoef(10,2));

//     }
// }




//                    CODE TO EXECUTE  AND SEE FUNCTION OVERLOADING:




// public class javabasics13{

//     public static int sum(int a , int b){
//         int sum = a+b;
//         return sum;
//     }

//     public static int sum(int a, int b ,int c){
//         return a+b+c;
//     }
//     public static void main(String args[]){
             
//         System.out.println("Sum of a and b is :");
//          System.out.println(sum(3,8));
//          System.out.println("Sum of a,b and c is :");
//          System.out.println(sum(5,2,1));
//     }
// }





//                             FUNCTION OVERLOADING USING DATA TYPES :





// public class javabasics13{

//     public static int sum(int a , int b){
//         return a+b;
//     }

//     public static float sum(float a, float b ,float c){
//         return a+b+c;
//     }
//     public static void main(String args[]){
             
//         System.out.println("Sum of a and b is :");
//          System.out.println(sum(3,5));
//          System.out.println("Sum of a,b and c is :");
//          System.out.println(sum(5.5f,2.2f,1));
//     }
// }






//                   TO CHECK A NO. IS PRIME OR NOT:




// public class javabasics13{

//     public static boolean isPrime(int n){
       
//         for(int i=2; i<=n-1; i++){
//             if(n % i ==0){             //completey divide
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String args[]){
       
//         System.out.println(isPrime(6));
//     }
// }






//                   CORNER CASES IN PRIME NO. QUESTION:








// public class javabasics13{
//     //only for n >=2
//     public static boolean isPrime(int n){
       

//         //CORNER CASES:
//         //2

//         if(n==2){

//             return true;


//         }
//         for(int i=2; i<=n-1; i++){
//             if(n % i ==0){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String args[]){
       
//         System.out.println(isPrime(7));
//     }
// }







// v-15                      OPTIMISED WAY:      DO USE THIS CODE FOR PRIME NO. CODE




// public class javabasics13{
   
//     public static boolean isPrime(int n){

//         if(n==2){
//             return true;
//         }

    //     for(int i=2; i<=Math.sqrt(n); i++){
    //         if(n % i ==0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }

//     public static void main(String args[]){
//         System.out.println(isPrime(7));

//     }
// }






// public class fandm{

//     public static boolean isPrime(int n ){

//         if(n==2){
//             return true;
//         }

//         for(int i = 2; i<=Math.sqrt(n); i++){
//             if(n%i ==0){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String[] args) {

//         System.out.println(isPrime(5));
        
//     }
// }



//                   TO PRINT PRIMES IN RANGE:



// public class javabasics13{
//     public static  boolean isPrime(int n){
//         for(int i =2;i<=Math.sqrt(n);i++){
//             if(n%i==0){
//                 return false;

//             }
             
//         }
//         return true;
//     }


//     public static void primeinrange(int n){
//         for(int i =2;i<=n;i++){
//             if(isPrime(i)){
//                 System.out.print(i + " ");
                
//             }
//         } System.out.println();
//     }
//     public static void main(String args[]){

//         System.out.println(isPrime(5));

//         primeinrange(34);

//     }
// }







// public class javabasics13{
   
//     public static boolean isPrime(int n){
       

     
//         for(int i=2; i<=Math.sqrt(n); i++){
//             if(n % i ==0){
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static void primesinRange(int n){
//         for(int i=2; i<=n; i++){

//             if(isPrime(i)){
//                 System.out.print(i + " ");
//             }
//         }
//         System.out.println();
//     }
//     public static void main(String args[]){
       
//        primesinRange(200);
        
//     }
// }





//                           CODE TO CONVERT BINARY TO DECIMAL:





// public class javabasics13{
    
//     public static void bintodec(int binNum){
//         int mynum = binNum;
//         int pow = 0;
//         int decNum = 0;
        
//         while(binNum > 0){

//             int lastDigit = binNum % 10;
//             decNum = decNum + (lastDigit * (int)Math.pow(2, pow));

//             pow++;
//             binNum = binNum/10;
//         }
//         System.out.println("decimal of "+ mynum +" = "+ decNum);

//     }
//     public static void main(String args[]){
//             bintodec(10000);

//     }
// }





//                         CODE TO CONVERT DECIMAL TO BINARY:




 

// public class javabasics13{
    
//     // public static void bintodec(int binNum){
//     //     int mynum = binNum;
//     //     int pow = 0;
//     //     int decNum = 0;
        
//     //     while(binNum > 0){

//     //         int lastDigit = binNum % 10;
//     //         decNum = decNum + (lastDigit * (int)Math.pow(2, pow));

//     //         pow++;
//     //         binNum = binNum/10;
//     //     }
//     //     System.out.println("decimal of "+ mynum +" = "+ decNum);

//     // }

//     public static void dectobin(int n){
//         int MyNum = n;
//         int pow = 0;
//         int binNum = 0;

//         while(n>0){
//             int rem = n%2;
//             binNum = binNum + (rem *(int) Math.pow(10, pow));

//             pow++;
//             n = n/2;

//         }
//         System.out.println("binary of "+ MyNum + " = " + binNum);
//     }
//     public static void main(String args[]){
//             // bintodec(10000);
//             dectobin(15);


//     }
// }








 
//                                          METHOD SCOPE:








// public class javabasics13{
    
//     public static void printS(){

//         int s= 45;

//     }
//     public static void main(String args[]){
//         //    int s = 45;
//            System.out.println(s);

//     }
// }








//                                            BLOCK SCCOPE:







// public class javabasics13{
    
    
//     public static void main(String args[]){
//         int p = 23;
//      {
//          int s =45;
//          System.out.println(p);
//      }
       
    
//     // System.out.println(s);

//     System.out.println(p);
//    }
// }










//                                        PRACTICE:





//  QUES 1 :                        CODE FOR AVERAGE OF THREE NUMEBRS:







// import java.util.*;

// public class javabasics13{
// public static double average(double a, double b , double c){

//     return (a+b+c)/ 3;
// }

// public static void main(String args[]){

//     Scanner sc = new Scanner(System.in);

//     System.out.println("enter a no. :");
//     double a = sc.nextDouble();

    
//     System.out.println("enter b no. :");
//     double b = sc.nextDouble();

    
//     System.out.println("enter c no. :");
//     double c = sc.nextDouble();

//     System.out.println("The average value is" + " = " + average(a,b,c));
    
    
// }
// }








//    QUES 2                                        CODE FOR TRUE FOR EVEN FALSE FOR ODD:





// import java.util.*;
// public class javabasics13{

// public static boolean isEven(int number){

//     if(number % 2 ==0){
//         return true;
//     }
//     else {
//         return false;
//     }

// }

// public static void main(String args[]){

//     Scanner sc = new Scanner(System.in);
//     int num;

//     System.out.println("Enter an integer:");
//     num = sc.nextInt();


//     if(isEven(num)){
//         System.out.println("number is even.");

//     }
//     else {
//         System.out.println("Numebr is odd");
//     }

// }

// }






//    QUES 3                        CODE FOR PALIDROME FUNCTION:






// import java.util.*;

// public class javabasics13{

//     public static boolean isPalindrome(int number){
//         int palindrome = number;
//         int reverse = 0;

//         if(palindrome == 0 ){
//             System.out.println("not applicable.");
//         }

//         while(palindrome != 0){

//             int remainder = palindrome % 10;
//             reverse = reverse * 10  + remainder;
//             palindrome = palindrome / 10;

//         }

//         if (number == reverse){
//             return true;

//         }
//         else {
//             return false;
//         }

//     }
//     public static void main(String args[]){

//         Scanner sc = new Scanner(System.in);
//         int palindrome;

//         System.out.println("Enter an integer :");
//         palindrome = sc.nextInt();

//         if (isPalindrome(palindrome)){

//             System.out.println("Number : " + palindrome + " is a palindrome.");


//         }
//         else {

//             System.out.println("Number : " + palindrome + "  is not a palindrome.");
//         }
//     }
// }









//                                 CODE TO PRINT THE SUM OF THE DIGITS OF A NUMEBR:




// import java.util.*;
// public class javabasics13{
//     public static int sumdigits(int n){
//         int sumofdigits = 0;
//         while(n>0){

//             int lastdigit = n % 10;

//             sumofdigits += lastdigit;

//             n/=10;

//         }
//         return sumofdigits;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("eNTER AN INTEGER: ");

//         int digits = sc.nextInt();

//         System.out.println("The sum is :" + sumdigits(digits));


//     }
// }