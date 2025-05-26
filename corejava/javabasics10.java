
//                                   CONDITIONALS IF ELSE



    




// import java.util.*;

// public class javabasics10 {
//     public static void main(String args[]){
//          Scanner sc = new Scanner(System.in);
//             int age = sc.nextInt();
//             if(age>=18){
//                 System.out.println("adult: drive, vote");
//             }
//             if(age<18 && age>16){
//                 System.out.println("you are a teen");
//             }
//             else{
//                 System.out.println("child");
//             }

//     }
// }   

//                           PRINT THE LARGEST OF TWO NUMBERS

// import java.util.*;

// public class javabasics10{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//                int A = sc.nextInt();
//                int B = sc.nextInt();
//                if(A>B){
//                 System.out.print("A is a large number");
//                }
//                else{
//                 System.out.print("B is a large number");
//                }

//     }
// }

//                      PRINT IF A NUMBER IS ODD OR EVEN

// import java.util.*;

// public class javabasics10{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int N = sc.nextInt();
//         if(N % 2 == 0) {
//             System.out.println("N is a even no.");
//         }
//         else{
//             System.out.println("N is a odd no.");
//         }

//     }
// }

//                                      else if code:

// import java.util.*;

// public class javabasics10 {
//     public static void main(String args[]){
//          Scanner sc = new Scanner(System.in);
//             int age = sc.nextInt();
//             if(age>=18){
//                 System.out.println("adult: drive, vote");
//             }
//             else if(age<18 && age>=13){
//                 System.out.println("you are a teen");
//             }
//             else{
//                 System.out.println("not an adult");
//             }

//     }
// }

//                                  INCOME TAX CALCULATOR:

// import java.util.*;

// public class javabasics10 {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int income = sc.nextInt();
//         int tax;

//         if(income < 500000){
//             tax = 0;

//         }
//         else if(income>=500000 && income < 1000000){
//             tax = (int)(income * 0.2);

//         }
//         else{
//             tax= (int)(income * 0.3);
//         }
//         System.out.println("Your tax is : " + tax);
//     }
// }

//                            PRINT THE LARGEST OF THREE NUMBERS:

// import java.util.*;

// public class javabasics10 {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//          int a = sc.nextInt();
//          int b = sc.nextInt();
//          int c = sc.nextInt();

//         if(a>b && a>c){
//             System.out.println("a is largest");

//          }
//         else if(b>a && b>c){
//             System.out.println("b is a largest no.");
//         }

//         else{
//             System.out.println("c is largest no.");
//         }

//     }

// }

//                         Ternary operator:

// import java.util.*;

// public class javabasics10 {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//            int num = sc.nextInt();

//            //TERNARY OPERATOR:

//            String type = ((num%2)==0) ? "even" : "odd" ;
//            System.out.println(type);
//     }

// }

//                               CODE TO PRINT IF A STUDENT WILL PASS OR FAIL:

// import java.util.*;

// public class javabasics10{
//     public static void main(String args[]){
//           Scanner sc = new Scanner(System.in);
//           int marks = sc.nextInt();

//           String report = (marks<=33)?" fail" : "pass";

//           System.out.print(report);

//     }

// }

//                                       SWITCH STATEMENT:

// import java.util.*;

// public class javabasics10{
//     public static void main(String args[]){
//           Scanner sc = new Scanner(System.in);
//           int num = sc.nextInt();

//           switch(num){
//             case 1 : System.out.print("manan");
//                      break;
//             case 2 : System.out.println("aakash");
//                      break;
//             case 3 : System.out.println("kaif");
//                     break;
//             case 4 : System.out.println("GOurangi");
//                     break;
//             default : System.out.println("JAI HO!!!");                          
//           }
//     }
// }

//                                           CALCULATOR:

// import java.util.*;

// public class javabasics10 {
//     public static void main(String args[]){
//           Scanner sc = new Scanner(System.in);

//               int a = sc.nextInt();
//               int b = sc.nextInt();
//               char operator = sc.next().charAt(0);           // THIS HOW WE TAKE INPUT FOR OPERATORS:

//               switch(operator)  {
//                     case  '+' :  System.out.print(a+b);
//                                 break;
//                     case '-' : System.out.print(a-b);    
//                                 break;       
//                     case '*' : System.out.print(a*b);    
//                                 break; 
//                     case '/' : System.out.print(a/b);    
//                                 break; 
//                     default : System.out.print("wrong operator");
//         }
//     }
// }

//                                                                   PRACTICE QUES

//                                 TO CHECK IF A NUMBER IS POSITIVE OR NEGATIVE

// import java.util.*;

// public class javabasics10{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         if(n<0){
//             System.out.print("the number is negative");

//         }
//         else if(n>0){
//             System.out.println("the numebr is positive");
//         }
//         else{
//             System.out.println("the number is zero");
//         }
//     }

// }

//                            TEMPERATURE QUESS:

// import java.util.*;

// public class javabasics10{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         float temp = sc.nextFloat();

//         if(temp>100){
//             System.out.print("You have a fever.");

//         }
//          else if(temp<100){
//                 System.out.print("You have a normal temperature.");
//          }

//          else{
//             System.out.print("invalid");
//          }

//     }
// }   

//                                           PRINTING WEEKDAYS;

// import java.util.*;

// public class javabasics10 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int WEEKDAY = sc.nextInt();

//         switch (WEEKDAY) {
//             case 1:
//                 System.out.println("Monday");
//                 break;
//             case 2:
//                 System.out.println("Tuesday");
//                 break;
//             case 3:
//                 System.out.println("Wednesday");
//                 break;
//             case 4:
//                 System.out.println("Thursday");
//                 break;
//             case 5:
//                 System.out.println("friday");
//                 break;
//             case 6:
//                 System.out.println("Saturday");
//                 break;

//             case 7:
//                 System.out.println("Sunday");
//                 break;
//             default:
//                 System.out.println("invalid day");
//         }

//     }

// }

//                                        TO CHECK A LEAP YEAR:  using nested if-else:



// import java.util.*;

// public class javabasics10 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int year = sc.nextInt();

//         if (year % 4 == 0) {
//             System.out.println("It is a leap year");

//             if (year % 100 == 0) {
//                 System.out.println("it is an leap year");

//                 if (year % 400 == 0) {
//                     System.out.println("It is an leap year.");
//                 }

//             }
//         } else {
//             System.out.println("Not a leap year.");
//         }
//     }
// }





