

public class dc {


    public static void printArr(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }





    public static void mergeSort(int arr[], int si, int ei) {

        if (si >= ei) {
            return;
        }

        // recursion ka kaam

        int mid = si + (ei - si) / 2; // mid finding (si+ei)/2

        mergeSort(arr, si, mid);// left part
        mergeSort(arr, mid + 1, ei);// right part
        merge(arr, si, mid, ei);  // merging both parts

    }

    public static void merge(int arr[], int si, int mid, int ei) {

        // left(0,3) = 4 , right(4,6) = 3 total elements = 7 (6 - 0 + 1)

        //size = ei-si+1
        
        int temp[] = new int[ei - si + 1];

        int i = si; // iterator for 1st sorted part
        int j = mid + 1;// idx for second sorted part
        int k = 0; // idx for temp;

        while (i <= mid && j <= ei) {

            if (arr[i] < arr[j]) {

                temp[k] = arr[i];
                i++; 

            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // for leftover elements of first sorted part

        while (i <= mid) {
            temp[k++] = arr[i++];
        }
 
        // for leftover elements of second sorted part

        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // copy temp to original array:

        for(k=0, i=si; k<temp.length; k++, i++){

            arr[i]  = temp[k];
        }
    }

    public static void main(String args[]) {

        int arr[] = { 6, 3, 9, 5, 2, 8 };

        mergeSort(arr, 0, arr.length - 1);
        printArr(arr);
    }

}












// Merge sort:

// public class dc {

//     public static void merge(int arr[], int si, int mid, int ei) {
//         // Create a temporary array
//         int temp[] = new int[ei - si + 1];
//         int i = si;    // Starting index of the first sorted part
//         int j = mid + 1; // Starting index of the second sorted part
//         int k = 0;     // Index for temp array

//         // Merge both parts into temp[]

//         while (i <= mid && j <= ei) {

//             if (arr[i] <= arr[j]) {

//                 temp[k++] = arr[i++];

//             } else {

//                 temp[k++] = arr[j++];
//             }
//         }
// //       
//         // For leftover elements of the first sorted part
//         while (i <= mid) {
//             temp[k++] = arr[i++];
//         }

//         // For leftover elements of the second sorted part
//         while (j <= ei) {
//             temp[k++] = arr[j++];
//         }

//         // Copy temp[] to original array arr[]
//         for (k = 0, i = si; k < temp.length; k++, i++) {
//             arr[i] = temp[k];
//         }
//     }

// //

//     public static void mergeSort(int arr[], int si, int ei) {

//         if (si >= ei) {
//             return;
//         }

//         int mid = si + (ei - si) / 2; //finding mid

//         mergeSort(arr, si, mid);//left part

//         mergeSort(arr, mid + 1, ei);//right part

//         merge(arr, si, mid, ei);
//     }}






//      // Print sorted array
// //

//      public static void printArr(int arr[]){

//      for (int i = 0; i < arr.length; i++) {
//         System.out.print(arr[i] + " ");
//     }
//     System.out.println();
// }

// //

//     public static void main(String args[]) {
//         int arr[] = {6, 3, 9, 5, 2, 8};

//         mergeSort(arr, 0, arr.length - 1);
//         printArr(arr);

//     }
// }

// /Quick sort:

// public class dc{

//     public static void printArr(int arr[]){

//         for(int i =0; i<arr.length;i++){
//         System.out.print(arr[i] + " ");
//     }
// }

//     public static void quickSort(int arr[],int si, int ei ){

//         if(si>=ei){
//             return;
//         }

//         //last element:

//         int pidx = partition(arr,si,ei);
//         quickSort(arr, si , pidx-1);  //left side elements
//         quickSort(arr, pidx+1 , ei);  //right side elements

//     }

//     public static int partition(int arr[] , int si , int ei){

//         int pivot = arr[ei];
//         int i = si-1;   //to make place for elements smaller than pivot

//         for(int j=si; j<ei; j++){
//             if(arr[j] <= pivot){
//                 i++;

//                 //swap:
//                 int temp = arr[j];
//                 arr[j] = arr[i];
//                 arr[i] = temp;

//             }
//         }

//         i++;

//          //swap:
//          int temp = pivot;
//          arr[ei] = arr[i];
//          arr[i] = temp;

//          return i;

//     }

//     public static void main(String args[]){

//         int arr[] = {6,3,9,8,2,5};
//         quickSort(arr,0,arr.length-1);
//         printArr(arr);

//     }
// }





// Search in rotated sorted array:







// public class dc {

//     public static int search(int arr[], int tar, int si, int ei) {

//         // base case:
//         if (si > ei) {
//             return -1;
//         }

//         // calculate mid:
//         int mid = si + (ei - si) / 2;



//         // case found:
//         if (arr[mid] == tar) {
//             return mid;
//         }




//         // mid on L1:


//         if (arr[si] <= arr[mid]) {                    //if 


//             // case a: left half:


//             if (arr[si] <= tar && tar <= arr[mid]) {
//                 return search(arr, tar, si, mid - 1);


//             } else {

//                 // case b: right half
//                 return search(arr, tar, mid + 1, ei);
//             }
//         } 
        
        
//         else {                                      //else




//             // mid on L2:
//             // case c: right half:


//             if (arr[mid] <= tar && tar <= arr[ei]) {
//                 return search(arr, tar, mid + 1, ei);


//             } else {

//                 // case d: left half
//                 return search(arr, tar, si, mid - 1);
//             }
//         }
//    }




//     public static void main(String[] args) {
//         int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
//         int target = 0; // output: 4

//         int taridx = search(arr, target, 0, arr.length - 1);
//         System.out.println(taridx); // Expected output: 4
//     }
// }
