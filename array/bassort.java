



//              V-3      bubble sort




// public class bassort {

//     public static void bubblesort(int arr[]){

//         for( int turn=0; turn<arr.length-1; turn++){    // no. of turns
 
//             for(int j =0; j<arr.length-1-turn; j++){    // inner loop
//                 if(arr[j] > arr[j+1]){

//                     //swap

//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;

//                 }
//             }
//         }
//     }

//     public static void printArr(int arr[]){
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i] + " ");
//         }

//         System.out.println();
//     }

//     public static void main(String args[]){
//         int arr[] = {5,4,1,2,3};

//         bubblesort(arr);
//         printArr(arr);
//     }
    
// }


//Code for optimised bubble sort for sorted array :

// public class bassort {

//     public static void bubblesort(int arr[]) {
//         for (int turn = 0; turn < arr.length - 1; turn++) {
//             boolean swapped = false;  // flag to detect any swap
            
//             for (int j = 0; j < arr.length - 1 - turn; j++) {
//                 if (arr[j] > arr[j + 1]) {
//                     // swap
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;

//                     swapped = true;  // a swap happened
//                 }
//             }

//             if (!swapped) {
//                 // No swap happened in this entire turn -> array is already sorted
//                 break;
//             }
//         }
//     }

//     public static void printArr(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String args[]) {
//         int arr[] = {1, 2, 3, 4, 5};  // Already sorted array

//         bubblesort(arr);
//         printArr(arr);
//     }
// }


// public class bassort{

//     public static void bubblesort(int arr[]){

//         for(int turn=0; turn<arr.length-1; turn++){
//             for(int j=0; j<arr.length-1-turn; j++){

//                 if(arr[j] > arr[j+1]){

//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;

//                 }
//             }
//         }
//     }

//     public static void printarr(int arr[]){

//         for(int i =0; i<arr.length; i++){
//             System.out.print(arr[i]+ " ");
//         }
//     }

//     public static void main(String args[]){

//         int arr[] = {5,4,1,2,3};

//         bubblesort(arr);
//         printarr(arr);

//     }

// }









//  v-4   selection sort:




// public class bassort{

//     public static void bubblesort(int arr[]){

//         for(int turn=0; turn<arr.length-1; turn++){
//             for(int j = 0;j<arr.length-1-turn; j++){
//                 if(arr[j]>arr[j+1]){

//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                 }
//             }
//         }


        
//     }

//     public static int printarr(int arr[]){

//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i] + " ");

//         }
//         System.out.println();
//         return 5;
//     }




//     public static void selectionSort(int arr[]){

//         for(int i = 0; i<arr.length - 1; i++){
//             int minpos = i;
//             for(int j =i+1; j<arr.length - 1; j++){
//                 if(arr[minpos] > arr[j]){
//                     minpos = j;
//                 }
//             }
//             int temp = arr[minpos];
//             arr[minpos] = arr[i];
//             arr[i] = temp;
//         }
//     }

//     public static void main (String args[]){

//         int arr[] = {5,4,1,2,3};
//         selectionSort(arr);
//         printarr(arr);
//     }
// }










// public class bassort{

//     public static void selectionSort(int arr[]){

//         for(int i=0; i<arr.length-1; i++){         //outer loop counts turns
//             int minpos =i;
//             for(int j = i+1; j<arr.length; j++){
//                 if(arr[minpos] > arr[j]){
//                     minpos = j;

//                 }
//             }
//             //swap
//             int temp = arr[minpos];
//             arr[minpos] = arr[i];
//             arr[i] = temp;
//         }
//     }

//     public static int printArr(int arr[]){

//         for(int i =0; i<arr.length; i++){
//             System.out.print(arr[i] +" ");
//         }
//         System.out.println();
//         return 0;
        
        
//     }


//     public static void main(String args[]){

//         int arr[] = {5,4,1,2,3};
//         selectionSort(arr);
//         printArr(arr);

//     }
// }







// public class bassort{

//     public static void selectionSort(int arr[]){

//         for(int i = 0; i<arr.length-1; i++){
//             int minpos = i;

//             for(int j= i+1; j<arr.length; j++){
//                 if(arr[minpos] > arr[j]){
//                     minpos = j;
//                 }
//             }

//             //swap 
//             int temp = arr[minpos];
//             arr[minpos] = arr[i];
//             arr[i] = temp;

//         }
//     }


//     public static void printArr(int arr[]){

//         for(int i = 0; i<arr.length; i++){
//             System.out.print(arr[i] + " ");

//         }
//         System.out.println();
//     }
//     public static void main(String args[]){

//         int arr[] = {5,4,1,2,3};

//         selectionSort(arr);
//         printArr(arr);

//     }
// }





// public class bassort{

//     public static void selectionsort(int arr[]){

//         for(int i=0; i<arr.length-1; i++){
//             int minpos = i;

//             for(int j = i+1; j<arr.length; j++){
//                 if(arr[minpos]>arr[j]){
//                     minpos = j;
//                 }
//             }

//             //swap

//             int temp = arr[minpos];
//             arr[minpos] = arr[i];
//             arr[i] = temp;
//         }
//     }

//     public static void printarr(int arr[]){

//         for(int i = 0; i<arr.length; i++){  
//             System.out.print(arr[i] + " ");
//         }

//         System.out.println();
//     }

//     public static void main(String args[]){

//         int arr[] = {5,4,2,3,1};

//         selectionsort(arr);
//         printarr(arr);
//     }
// }




//Insertion sort:



// public class bassort{

//     public static void insertionSort(int arr[]){

//         for(int i =1; i<arr.length;i++){
//             int curr = arr[i];
//             int prev = i-1;
        

//         // finding out the correct position to insert

//         while( prev>=0 && arr[prev] > curr){
//             arr[prev+1] = arr[prev];
//             prev--;
//         }

//         //insertion

//         arr[prev+1] = curr;  
//     }
// }
//     public static void printArr(int arr[]){

//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i] + " ");

//         }
//         System.out.println();

//     }
//     public static void main(String args[]){

//         int arr[] = {5,4,1,2,3};
//         insertionSort(arr);
//         printArr(arr);
//     }
// }




// public class bassort{

//     public static void insertionsort(int arr[]){
//         for(int i =1; i<arr.length-1;i++){

//         int curr = arr[i];
//         int prev = i-1;

//         while(prev>=0 && arr[prev]> curr){           //change this condition for descending order
//             arr[prev+1] = arr[prev];
//             prev--;
//         }
//         arr[prev+1] = curr;
//     }

   
// }

// public static void printarr(int arr[]){

//     for(int i=0; i<arr.length; i++){
//         System.out.print(arr[i] + " ");
//     }

//     System.out.println();
// }
//     public static void main(String args[]){

//         int arr[] = {4,3,5,6,7};

//         insertionsort(arr);
//         printarr(arr);

//     }
// }



//  Inbuilt sort:







// import java.util.Arrays;
// public class bassort{

//     public static void printArr(int arr[]){

//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i] + " ");

//         }
//         System.out.println();

//     }
//     public static void main(String args[]){

//         int arr[] = {5,4,1,2,3};
//         // insertionSort(arr);

//         Arrays.sort(arr);
//         printArr(arr);
//     }
// }




//  sorting starting index and ending index:

// import java.util.Arrays;
// public class bassort{

//     public static void printArr(int arr[]){

//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i] + " ");

//         }
//         System.out.println();

//     }
//     public static void main(String args[]){

//         int arr[] = {5,4,1,2,3};
//         // insertionSort(arr);

//         Arrays.sort(arr,0,4);
//         printArr(arr);
//     }
// }


// 



// import java.util.Arrays;
// import java.util.Collections;
// public class bassort{

//     public static void printArr(Integer arr[]){

//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i] + " ");

//         }
//         System.out.println();

//     }
//     public static void main(String args[]){

//         Integer arr[] = {5,1,4,2,3};
//         // insertionSort(arr);

//         // Arrays.sort(arr,Collections.reverseOrder());
//         Arrays.sort(arr,0,3,Collections.reverseOrder());
//         printArr(arr);
//     }
// }




//         counting sort:



// public class bassort{
//     public static void countingsort(int arr[]){

//         int largest = Integer.MIN_VALUE;
//         for(int i=0; i<arr.length; i++){
//             largest  = Math.max(largest, arr[i]);
//         }



//         int count[] = new int[largest+1];
//         //iterating on original array
//         for(int i=0; i<arr.length; i++){
//             count[arr[i]]++;
//         }

//         //sorting: on array of frequency:
//         int j=0;

//         for(int i=0; i<count.length; i++){
//             while(count[i]>0){
//                 arr[j]= i;
//                 j++;
//                 count[i]--;
//             }

//         }
//     }

//     public static void printarr(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }
//     public static void main(String args[]){
//         int arr[] = {1,3,1,4,3,7};
//         countingsort(arr);
//         printarr(arr);
//     }
    
// }

