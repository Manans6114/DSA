
//                                  while  Loop


// public class javabasics12 {
//     public static void main(String args[]){
//         int counter = 0;

//         while(counter<10){
//         System.out.println("Hello world");

//         counter++;
//         }
//        System.out.println("printed hello world 10 times");
//     }
// }


// public class javabasics12{
//     public static void main(String args[]){
//         int counter  = 0;
//         while(counter<100){
//             System.out.println("hello Manan");
//             counter ++;
//         }
//         System.out.println("printed successfully");
//     }
// }









//                                      TO PRINT 1-10 NUMBERS:

// import java.util.*;

// public class javabasics11 {
//     public static void main(String args[]){
//         int counter = 1;

//         while(counter<=10){
//         System.out.println(counter);

//         counter++;
//         }

//         System.out.println("printed hello world 100 times");
//     }
// }

// public class javabasics12{
//     public static void main(String args[]){
//         int counter =0;
//         while(counter<10){
//             System.out.println(counter);
//             counter++;


//         }
//         System.out.println("Successfully printed");

//     }
// }





//                                  TO PRINT 1 TO n:

// import java.util.*;

// public class javabasics11 {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int counter = 0;

//         while(counter <= n){
//         System.out.println(counter);

//         counter++;
//         }

//         System.out.println("printed hello world 100 times");
//     }
// }


// import java.util.*;
// public class javabasics12{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int counter = 0;
//         int n = sc.nextInt();

//         while(counter<n){
//             System.out.println(counter);
//             counter++;
//         }

//         System.out.println("Successfully implemented");
//     }
// }





//                               TO PRINT SUM OF FIRST N NATURAL NUMBERS:

// import java.util.*;

// public class javabasics11 {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int sum = 0;
//         int i = 1;

//         while( i <= n){
//            sum+=i;
//            i++;
//         } System.out.println("Sum is : " + sum);
//     }
// }

// import java.util.*;
// public class javabasics12{
//     public static void main(String args[]){
//         Scanner sc = new Scanner (System.in);
//         int n = sc.nextInt();
//         int i = 0;
//         int sum = 0;

//         while(i<=n){
//             sum+=i;
//             i++;
//         }
//         System.out.println("Sum is :" + sum);
        

//     }
// }



//                               FOR LOOPS:


// import java.util.*;

// public class javabasics11{
//     public static void main(String args[]){
//         for( int i=1; i<=10; i++){
//             System.out.println("Hello world");
//         }
//     }
// }

// import java.util.*;
// public class javabasics12{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=0;i<=n;i++){
//             System.out.println(i);

//         }
//         System.out.println("   ");
//     }
// }

//                                To print a square pattern of *

// import java.util.*;

// public class javabasics11{
//     public static void main(String args []){
//         for(int i=1; i<=4; i++){
//             System.out.println("********");
//         }
//     }
// }

// import java.util.*;
// public class javabasic12{
//     public static void main(String args[]){
//         Scanner sc= new Scanner (System.in);
//         int n = sc.nextInt();
//         for(int i = 1;i<=n;i++){
//             System.out.println("********");
//         }
//     }

// }
//                                          to print reverse of a number:

// import java.util.*;
// public class javabasics12{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         while(n>0){
//             int lastdigit = n % 10;
//             System.out.print(lastdigit);
//             n = n/10;
           
//         }
//     }
// }

// public class javabasic12{
//     public static void main(String args[]){
//         int n = 123456;
//         while(n>0){
//             int lastdigit = n%10;
//             System.out.print(lastdigit);
//             n = n/10;
//         }


//     }
    
// }

//                                    REVRSE THE GVIEN NUMBER:

// import java.util.*;

// public class javabasics11{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         // int n = 10899;
//         int rev = 0;

//         while(n >0){
//             int lastdigit = n % 10;                //remember these two lines.
//             rev = (rev*10) + lastdigit;
//             n = n/10;    
//         }
//         System.out.print(rev);

//     }
// }

//                                             do while loop:

// import java.util.*;

// public class javabasics11{
//     public static void main(String args[]){
//         int counter = 1;
//         do{
//             System.out.println("Hello world");
//             counter++;
//         }
//         while(counter <=10);
//     }
// }

//                            break statement

// import java.util.*;

// public class javabasics11{

//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for( int i=n; i<=5; i++){
//             if(i==4){
//                 break;
//             }
//             System.out.println(i);
//         }
//         System.out.println("i am out of  the loop.");
//     }
// }


// import java.util.*;

// public class javabasic12{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         for(int i =n; i<=5;i++){
//             if(i==3){
//                 break;
//             }
//             System.out.println(i);
//         }
//         System.out.println("I AM OUT OF THE LOOP.");
//     }
    
// }



//         code for entering numebrs until user enters a multiple of 10:



// import java.util.*;

// public class javabasics12 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         do {
//             System.out.println("Enter your numebr: ");
//             int n = sc.nextInt();
//             if (n % 10 == 0) {
//                 break;
//             }
//             System.out.println(n);
//         } while (true);

//     }

// }

// import java.util.*;

// public class javabasics12{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         do{
//             System.out.println("Enter the number:");
//             int n = sc.nextInt();
//             if(n%10==0){
//                 break;
//             }
//             System.out.println(n);
//         }
//         while(true);
        

//     }
    
// }




//                        Continue Statement:  to skip an iteration :

// import java.util.*;

// public class javabasics11{

//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for( int i=n; i<=5; i++){
//             if(i==3){
//                 continue;
//             }
//             System.out.println(i);
//         }
//         System.out.println("i am out of  the loop.");
//     }
// }

//             Dispaly all numbers entered by user except multiple of 10:

// import java.util.*;

// public class javabasics12 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         do {
//             System.out.println("Enter your numebr: ");
//             long n = sc.nextLong();
//             if (n % 10 == 0) {
//                 continue;
//             }
//             System.out.println(n);
//         } while (true);

//     }

// }

//            check if a numebr is prime or not:

// import java.util.*;

// public class javabasics11 {

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         if(n==2){
//             System.out.println("n is prime.");
//         }
//         else{

//             boolean isPrime = true;
//             for(int i = 2;i<=Math.sqrt(n);i++){
//                 if(n % i == 0){
//                     isPrime = false;
//                 }
                
//             }
//             if(isPrime==true) {
//                 System.out.println("n is prime.");
//             }

//             else{
//                 System.out.println("n is not prime.");
//             }   
//         }
      
 
// }
// }

//     PENDING

// PRACTICE QUESTIONS:

// Ques 1

// public class javabasics11{

//     public static void main(String args[]){
//         for(int i = 0; i<5;i++){
//             System.out.println("Hello");
//             i+=2;
//         }
//     }
// }         

// It will be printed two times.

// Ques 2   :   PROGRAM THAT READS A SET OF INTEGERS AND THEN PRINT THE SUM OF THE EVEN AND ODD INTEGERS:

// import java.util.*;

// public class javabasics11{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int number;
//         int choice;

//         int evensum = 0;
//         int oddsum = 0;
//         do{
//             System.out.print("Enter the number :  ");
//              number = sc.nextInt();
//             if( number%2==0){ 
//                 evensum+= number;

//               }  
//               else {
//                     oddsum+= number;
//                 }
//                 System.out.print("Do you want to continue? Press 1 for yes or 0 for no :  ");
//                 choice = sc.nextInt();
//             }
//             while(choice == 1);
//             {
//                 System.out.println("Sum of even numbers:" + evensum);
//                 System.out.println("Sum of odd numbers:" + oddsum);

//             }

//     }
// }

        

// Ques 3   :   Find the factorial of any number entered by the user: without if else:

// import java.util.*;

// public class javabasics11{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
      
//         int fact = 1;

//         System.out.println("Enter a positive integer : ");
//          int num = sc.nextInt();

//          for(int i=1; i<=num; i++){
//             fact*=i;
//          } 
//              System.out.println("Factorial is : " +fact );

//     }

// }


// import java.util.*;
// public class javabasics11{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int fact =1;
            
//             System.out.println("Enter the number: ");
//             int num = sc.nextInt();
//             for(int i=1; i<=num;i++){
//                 fact*=i;
//             }
//             System.out.println("Factorial is:" + fact);
//     }

// }



// Factorial ques with if else:

// Ques 4 :  TO PRINT A MULTIPLICATION TABLE:




// import java.util.*;

// public class javabasics11 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter number:");
//         int n = sc.nextInt();
//         for (int i = 1; i <= 10; i++) {
//             System.out.println(n + "  *  " + i + " = " + n * i);
//         }

//     }

// }



// import java.util.*;
// public class javabasics11{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the no. to print table.");
//         int n = sc.nextInt();
//         for(int i=1;i<=10;i++){
//             System.out.println(n+" * "+ i +" = " + n*i);
//         }

//     }
// }


