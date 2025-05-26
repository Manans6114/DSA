


//                       Strings:


// public class Strings{

//     public static void main(String[] args) {

//         char arr[]  =  { 'a','b','c','d'};

//         String str = "abcd";
//         String  str2 = new String("xyz");
        
//     }
    
// }




//         Input - Output:

// import java.util.*;
// public class Strings{
    
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         String name;
//         name = sc.nextLine();
//         System.out.println(name);


        

//     }
// }




//     Printing letters using charAtmethod:




// public class Strings{

//     public static void printLetters(String str){

//         for(int i = 0; i<str.length(); i++){
//             System.out.print(str.charAt(i) + " ");
//         }
//         System.out.println();
//     }
    
//     public static void main(String[] args) {

//         String frstname = "Manan";
//         String SecondName = "Sharma";
//         String FullName = frstname + " " + SecondName;
//         // System.out.print(FullName);
//         // System.out.println(FullName.charAt(0));
//         printLetters(FullName);

//     }
// }





//               Valid Palindrome:


// public class Strings{

//     public static boolean isPalindrome(String str){

//         for(int i =0; i<str.length()/2 ; i++){
//             if(str.charAt(i) != str.charAt(str.length() -1 -i)){
//                 return false;
//             }
//         }
//         return true;
//     }
    
//     public static void main(String[] args) {

//         String str = "racecar";

//         System.out.print(isPalindrome(str));


//     }
// }





//       get Shortest Path:"



// public class Strings{

//     public static float getShortestPath(String path){
//         int x=0;
//         int y=0;

//         for(int i =0;i<path.length(); i++){
//             char dir = path.charAt(i);
 
//             //South
//             if(dir == 'S'){
//                 y--;
//             }
//             //North:
//             else if(dir == 'N'){
//                 y++;
//             }
//             //West:
//             else if(dir == 'W'){
//                 x--;
//             }
//             //East:
//             else if(dir == 'E'){
//                 x++;
//             }
//         }
//         int X2 = x*x;
//         int Y2 = y*y;
//         return (float)Math.sqrt(X2+ Y2);
//     }
//     public static void main(String[] args) {
        
//         String path = "WNEENESENNN";
//         System.out.print(getShortestPath(path));
//     }
// }




//        String substring:


// public class Strings{

//     public static String subString(String str , int si , int ei){

//         String substr = "";

//         for(int i =si; i<ei; i++){
//             substr += str.charAt(i);
//         }
//         return substr;

//     }
//     public static void main(String[] args) {
        
//         //substring:
//         String str = "HelloWorld";
//         //inbuilt
//         System.out.println(str.substring(0,5));
//         //normal
//         System.out.println(subString(str,0,5));

//     }
// }




//             For a given set of Strings print the largest String:


// public class Strings{

//     public static void main(String[] args) {
//         String fruits[] = {"apple", "mango", "Banana", "Papaya"};


//         String largest = fruits[0];
//         for(int i =1; i<fruits.length; i++){

//             if(largest.compareToIgnoreCase(fruits[i])  <  0){
//                 largest = fruits[i];

//             }
//         }
        
//        System.out.println(largest);
//     }
// }






//  String Builder:



// public class Strings{
//     public static void main(String[] args) {
        
//         StringBuilder sb = new StringBuilder("");

//         for(char ch ='a';ch<='z'; ch++){
//             sb.append(ch);
//         }

//         System.out.println(sb.length());
//         System.out.println(sb);

//     }

// }








// String Capatilization:






// public class Strings{

//     public static String toUpperCase(String str){

//         StringBuilder sb = new StringBuilder();

//         char ch = Character.toUpperCase(str.charAt(0));
//         sb.append(ch);

//         for (int i = 1; i < str.length(); i++) {
//              if(str.charAt(i) == ' '  && i<str.length() - 1){
//                 sb.append(str.charAt(i));
//                 i++;
//                 sb.append(Character.toUpperCase(str.charAt(i)));
//              }
//              else{
//                 sb.append(str.charAt(i));                                      //T.C. : O(n)
//              }
//         }

//         return sb.toString();
//     }
//     public static void main(String[] args) {
        
      
//         String str = "Hi, i am Manan";
        
//         System.out.println(toUpperCase(str));
//     }

// }





//            String Compression:





// public class Strings{


//     public static String compress(String str) {

//         String newStr = "";

//         //aaabc

//         for(int i=0; i<str.length(); i++) {
//             Integer count = 1;
//             while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
//                 count++;
//                 i++;
//             }
//             newStr += str.charAt(i);
//             if(count > 1) {
//                 newStr += count.toString();
//             }
//         }
//         return newStr;
//     }
    
//     public static void main(String[] args) {

//         String str = "aaabbbcccdddeee";


//         System.out.println(compress(str));
        
//     }
// }





//     No. of lowercase vowels:





// import java.util.*;

// public class  Strings {
//     public static void main(String[] args) {
//         String str = new Scanner(System.in).next();
//         int count = 0;

//         for(int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);

//             if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//                 count++;
//             }
//         }

//         System.out.println("count of vowels is : " + count);
//     }
// }
