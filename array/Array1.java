





//  V-2                           CREATION OF AN ARRAY:




// public class Array1 {
//     public static void main(String[] args) {
        
//         // Creating an ARRAY:
//         int marks[] = new int[50];

//         // An array is created by already giving elements; system sets size automatically
//         int numbers[] = {1, 2, 3};

//         int moreNumbers[] = {4, 5, 6};

//         // String type of array:
//         String fruits[] = {"apple", "mango", "orange"};
//     }
// }




//  V-3
//                         TAKING INPUT, OUTPUT and UPDATE FOR AN ARRAY:





// import java.util.*;

// public class Array1{
//     public static void main(String args[]){
//         int marks[] = new int[100];

//         Scanner sc = new Scanner(System.in);

//             marks[0] = sc.nextInt();//phy
//             marks[1] = sc.nextInt();//chem
//             marks[2] = sc.nextInt();//maths
        

//         System.out.println("phy : " + marks[0]);
//         System.out.println("chem : " + marks[1]);
//         System.out.println("maths : " + marks[2]);


//         float percentage = (marks[0] + marks[1] + marks[2]) / 3;
//         System.out.println("percentage is   : " + " = " + percentage );

//         marks[2] = 100;
//         marks[2] = marks[2] +1;
//         System.out.println("new maths marks  :" +  marks[2]);

//         System.out.println("Length of this array:" + "=" + marks.length );
//     }
// }







//    v-4

//                     ARRAY AS FUNCTION ARGUEMENTS:

//                     PASSING ARRAYS AS ARGUEMENT:


// public class Array1{


//     public static void update(int marks[]){
//         for(int i=0; i<marks.length; i++){
//         marks[i] = marks[i] +1;

//     }
// }

//     public static void main(String args[]){
//          int marks[] = {97,98,99};

//          update(marks);

//          // to print our marks:

//          for(int i=0; i<marks.length; i++){
//             System.out.print(marks[i] + " ");
//          }
//          System.out.println();
//     }
// }


// public class Array1{

//     public static void update(int marks[]){

//         for(int i = 0; i<marks.length; i++){
//             marks[i] = marks[i] + 1;
//         }

//     }

//     public static void main(String[] args) {

//         int marks[] = {90,91,92};

//         update(marks);

//         for(int i =0; i<marks.length;i++){
//             System.out.print(marks[i] + " ");
//         }
//         System.out.println();
//     }

// }










//                       ARRAYS VALUE GOT CHANGED BUT NOT THE NONCHANGABLE VALUE:  ARRAYS PASSED BY REFERENCE ->

// import java.util.*;

// public class array15{
//     public static void update(int marks[] , int nonChangable){
//         nonChangable = 10;
//         for(int i=0; i<marks.length; i++){
//         marks[i] = marks[i] +1;

//     }
// }

//     public static void main(String args[]){
//          int marks[] = {97,98,99};
//          int nonChangable = 5;
//          update(marks , nonChangable);
//          System.out.println(nonChangable);

//          for(int i=0; i<marks.length; i++){
//             System.out.print(marks[i] + " ");
//          }
//          System.out.println();
//     }
// }

// V-6

//                                    LINEAR SEARCH:

// public class Array1{
//     public static int linearSearch(int numbers[], int key){

//         for(int i = 0; i<numbers.length; i++){

//             if (numbers[i] == key){
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String args[]){
//         int numbers[] = {2,4,6,8,10,12,14,16};
//         // String menu[] ={"Dosa","chole bhature","samosa"};
//         int key = 10;

//         int index = linearSearch(numbers,key);
//         if(index == -1){
//             System.out.println("NOT FOUND");
//         }
//         else{
//         System.out.println("Key is at index :" + index);
//         }
//     }
// }

 

// public class Array1{

//     public static int LinearSearch(int numbers[] , int key){

//         for(int i =0; i<numbers.length; i++){
//             if(numbers[i] == key){
//                 return i;
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {

//         int numbers[] = {2,3,4,5,6,7,8,9,10};
//         int key = 8;

//         int index = LinearSearch(numbers,key);

//         if(index == -1){
//             System.out.println("NOT FOUND");
//         }
//         else{
//             System.out.println("Index is : " + index);
//         }
        
//     }
// }


// public class Array1{

//     public static int LinearSearch(int numbers[], int key){

//         for(int i = 0; i<numbers.length;i++){
//             if(numbers[i] == key){
//                 return i;
//             }
//         }

//         return -1;

//     }

//     public static void main(String[] args) {

//         int  numbers[] = {2,3,4,56,7,8,9};
//         int key = 56;

//         int index = LinearSearch(numbers,key);

//         if( index ==-1){
//             System.out.println();
//         }
//         else{

//             System.out.println("Index is : " + index);
//         }
        
//     }
// }













//    V-7:

//                                         TO FIND LARGEST AND SMALLEST IN AN ARRAY:





// public class Array1 {


//     public static int getLargest(int numbers[]) {
//         int largest = Integer.MIN_VALUE;  //minus infinity
//         int smallest = Integer.MAX_VALUE;   //+ infinity

//         for (int i = 0; i < numbers.length; i++) {
//             if (largest < numbers[i]) {
//                 largest = numbers[i];

//             }
//             if (smallest > numbers[i])
//                 smallest = numbers[i];
//         }

//         System.out.print("Smallest value is :  " + smallest);
//         return largest;

//     }

//     public static void main(String args[]) {
//         int numbers[] = { 2, 2, 4, 8, 6, 3, };
//         System.out.println("\nLargest value is : " + getLargest(numbers));

//     }
// }







//                          BINARY SEARCH:




// public class Array1{
//     public static int BinarySearch(int numbers[] , int key){
//         int start = 0;
//         int end = numbers.length-1;

//         while(start<=end){
                
//             int mid = (start + end)/2;

//             if(numbers[mid] == key){
//                 return mid;

//             }
//             if(numbers[mid] < key){  // right
//                 start = mid+1;

//             }
//             else{                    //left
//                 end = mid -1;
//             }

//         }
//         return -1;
//     }

//     public static void main(String args[]){
//         int  numbers[] = {2,4,6,8,10,12,14};
//         int key = 4;

//         System.out.println("index for key is : "  + BinarySearch(numbers,key));
//     }
// }








//                           REVERSE AN ARRAY:




// public class Array1 {
//     public static int reverse(int numbers[]) {
//         int first = 0;
//         int last = numbers.length - 1;

//         while (first < last) {
//             // swap
//             int temp = numbers[last];
//             numbers[last] = numbers[first];
//             numbers[first] = temp;

//             first++;
//             last--;
//         }
//         return -1;
//     }

//     public static void main(String args[]) {
//         int numbers[] = { 2, 4, 6, 8, 10, 12 };

//         reverse(numbers);
//         for (int i = 0; i < numbers.length; i++) {

//             System.out.print(numbers[i] + " ");

//         }
//         System.out.println();

//     }
// }




//                              PAIRS IN ARRAY:

// public class Array1
//  {
//     public static int printPair(int numbers[]) {
//         int tp = 0;

//         for (int i = 0; i < numbers.length; i++) {
//             int curr = numbers[i];
//             for (int j = i + 1; j < numbers.length; j++) {
//                 System.out.print("(" + curr + "," + numbers[j] + ")");
//                 tp++;
//             }
//             System.out.println();
//         }
//         System.out.print("Total pairs : " + tp );
//         return -1;

//     }

//     public static void main(String args[]) {

//         int numbers[] = { 2, 4, 6, 8, 10,12};

//         printPair(numbers);
//     }

// }





//      V-11
//                                        PRINT SUBARRAYS:




// public class Array1{

//     public static int printSubarrays(int numbers[]){
        
//         int ts=0;

//         for(int i=0; i<numbers.length; i++){
//             int start = i;
            
//             for(int j = i; j<numbers.length; j++){
//                 int end =j;
            
//                 for(int k=start; k<=end; k++){  //print
//                     System.out.print(numbers[k]+ " ");  //subarrays
            
//                 }
//                 ts++;
//                 System.out.println();
            
//             }
//               System.out.println();
//         }
//         System.out.println("Total subarrays = "+ ts);
//         return -1;

//     }
//         public static void main(String args[]){
//             int numbers[] = {2,4,6,8,10};
//             printSubarrays(numbers);
//         }
// }





  