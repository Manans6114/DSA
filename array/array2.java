



//                                            MAXsUBAAYA:





//

// public class array2 {

//     public static int MaxSubarraySum(int numbers[]){

//         int currSum=0;
//         int maxSum =   Integer.MIN_VALUE;

//         for(int i=0; i<numbers.length; i++){

//             int start = i;

//             for(int j = i; j<numbers.length; j++){

//                 int end = j;
//                 currSum = 0;

//                 for(int k=start; k<=end; k++){  //print
//                     currSum  += numbers[k];

//                 }
//                 System.out.println(currSum);
//                 if(maxSum < currSum){
//                     maxSum = currSum;
//                 }

//             }

//         }
//         System.out.println("max sum = "+ maxSum);
//         return -1;

//     }
//         public static void main(String args[]){
//             int numbers[] = {1,-2,6,-1,3};
//             MaxSubarraySum(numbers);
//         }
// }




// public class array2 {

//     public static int MaxSubarraySum(int numbers[]){ 

//         int currSum=0;
//         int maxSum =   Integer.MIN_VALUE;  
//         int prefix[] = new int[numbers.length]; 

//         prefix[0] = numbers[0];

//         // Calculate prefix array
//         for(int  i = 1; i < prefix.length; i++){
//             prefix[i] = prefix[i-1] + numbers[i];
//         }

//         for(int i=0; i<numbers.length; i++){

//             int start = i;

//             for(int j = i; j<numbers.length; j++){

//                 int end = j; 
//                 currSum = start ==0 ? prefix[end] :prefix[end] - prefix[start-1];

//                 System.out.println(currSum);
//                 if(maxSum < currSum){
//                     maxSum = currSum;
//                 }

//             }

//         } 
//         System.out.println("max sum = "+ maxSum);
//         return -1;

//     }
//         public static void main(String args[]){
//             int numbers[] = {1,-2,6,-1,3};
//             MaxSubarraySum(numbers);
//         }
// }





//      Sum of maximum subarray:




// public class array2{
//     public static void kadanes(int numbers[]){
//         int ms = Integer.MIN_VALUE;
//         int cs = 0;

//         for(int i=0; i<numbers.length; i++){

//             cs = cs + numbers[i];

//             if(cs < 0) {
//                 cs = 0;
//             }
//             ms = Math.max( cs , ms);
//         }
//         System.out.println("Our max subarray sum i : " + ms);

//     }
//     public static void main(String args[]){
//         int numbers[] = {-2,-3,4,-1,-2,1,5,-3};

//         kadanes(numbers);

//     }

// }








//              Kadane's Algorithm:




// public class array2{

//     public static void kadanes(int numbers[]){
//         int ms = Integer.MIN_VALUE;
//         int cs = 0;

//         for(int i =0; i<numbers.length; i++){

//             cs = cs + numbers[i];

//             if(cs<0){
//                 cs = 0;
//             }

//         ms = Math.max(cs , ms);

//         }

//         System.out.println("Our maxsubarray sum is i : " + ms);
//     }

//     public static void main(String args[]){
//         int numbers[] = {-2,-3,4,-1,-2,1,5,-3};

//         kadanes(numbers);
//     }
// }


// public class array2{

//     public static int kadanes(int numbers[]){

//         int ms = Integer.MIN_VALUE;
//         int cs = 0;

//         for(int i =0; i< numbers.length;i++){

//             cs = cs+ numbers[i];
//             if(cs<0){
//                 cs=0;
//             }

//             ms = Math.max(cs, ms);
//         }

//         System.out.println("The sum is : " + ms);
//         return -1;
//     }

//     public static void main(String[] args) {
        
//         int numbers[] = {-2,-3,4,-1,-2,1,5,-3};

//         kadanes(numbers);
//     }
    
// }





//           final kadanes code:     WHEN ALL THE NEGATIVE NUMBERS ARE PRESENT IN AN ARRAY:





// public class array2 {

//     public static int maxSubArray(int nums[]) {
//         int ms = nums[0];
//         int cs = nums[0];

//         for (int i = 1; i < nums.length; i++) {
//             cs = Math.max(nums[i], cs + nums[i]);
//             ms = Math.max(ms, cs);
//         }

//         return ms;
//     }

//     public static void main(String[] args) {
//         int nums[] = {-4, -3, -2, -7, 9, 5};
//         System.out.println("The maximum sum of a contiguous subarray is: " + maxSubArray(nums));
//     }
// }



// public class array2{

//     public static int kadanes(int numbers[]){

//         int ms = numbers[0];
//         int cs = numbers[0];

//         for(int i = 0; i< numbers.length; i++){

//             cs = Math.max(numbers[i], cs + numbers[i]);
//             ms = Math.max(ms,cs);
//         }
//         return ms;
//     }

//     public static void main(String[] args) {
        
//         int numbers[] = {-4, -3, -2, -7, 9, 5};

//         System.out.println("The max subbarray sum is : " + kadanes(numbers));
//     }
// }




//           //                                     TRAPPING RAINWATER PROBLEM:





// public class array2{
//     public static int trappedRainwater(int height[]){

//         int n = height.length;

//         //calculate left max boundary - array
//         int leftMax[] = new int[n];
//         leftMax[0] = height[0];                //there will be no bar from the left index of  0 index

//         for(int idx = 1; idx < n; idx++){

//             leftMax[idx] = Math.max(height[idx],leftMax[idx-1]);
            
//         }

//         //calculate right max boundary - array
//         int rightMax[] = new int[n];
//         rightMax[n-1] = height[n-1];

//         for(int idx=n-2; idx>=0; idx--){

//             rightMax[idx] = Math.max(height[idx], rightMax[idx+1]);
//         }


//         int trappedWater = 0;

        
//         //loop
//         for(int idx= 0; idx<n; idx++){

//         //waterlevel = min(leftmax bound, rightmax bound)
//             int waterLevel = Math.min(leftMax[idx], rightMax[idx]);

//               //trapped water = waterlevel - height[i]
//             trappedWater += waterLevel - height[idx] ;

//         }
//         return trappedWater;

//     }
//     public static void main(String args[]){
//         int height[] = {4,2,0,6,3,2,5};
//         int trw = trappedRainwater(height);

//         System.out.println(trw);
//     }
// }



// public class array2{


//     public static int trappedRainwater(int height[]){

   
//         int n = height.length;

//         //LeftMax:

//         int LeftMax[] = new int[n];
//         LeftMax[0] = height[0];

//         for(int i =1; i<n ; i++){
//             LeftMax[i] = Math.max(height[i] , LeftMax[i-1]);
//         }

//         //RightMax:

//         int RightMax[] = new int[n];
//         RightMax[n-1] = height[n-1];

//         for(int i=n-2 ; i>=0; i--){
//             RightMax[i] = Math.max(height[i], RightMax[i+1]);
//         }

//         int trappedwater =0;

//         //loop

//         for(int i =0; i<n;i++){
//             int waterlevel = Math.min(LeftMax[i], RightMax[i]);
//             trappedwater += waterlevel - height[i];
//         }

//         return trappedwater;
//     }



//     public static void main(String args[]){
//         int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
//         int trw = trappedRainwater(height);

    
//         System.out.println(trw);
//     }
// }






// Buy and sell stocks:






// public class array2{

//     public static int buyandsellstocks(int prices[]){

//         int buyprice = Integer.MAX_VALUE;
//         int maxprofit = 0;

//         for(int i=0; i<prices.length; i++){

//             if(buyprice <prices[i]){
//                 int profit = prices[i] - buyprice;
//                 maxprofit = Math.max(maxprofit,profit);
//             }
//             else{
//                 buyprice = prices[i];
//             }
//         }
//         return maxprofit;
//     }

//     public static void main(String args[]){

//         int prices[] = {7,1,5,3,6,4};

//         System.out.println(buyandsellstocks(prices));
//     }

// }



// public class array2{
//     public static int buyandsellstocks(int prices[]){
//         int buyprice = Integer.MAX_VALUE;
//         int maxprofit = 0;

//         for(int idx = 0; idx< prices.length; idx++){

//             if(buyprice < prices[idx]){
//                 int profit = prices[idx] - buyprice;
                
//                 maxprofit = Math.max(maxprofit, profit);

//             }
//             else{
//                 buyprice = prices[idx];
//             }
//         }

//         return maxprofit;
//     }


//     public static void main (String args[]){
//         int prices[] = {7,1,5,3,6,4};

//         System.out.println(buyandsellstocks(prices));
//     }
// }










   


// public class array2{
//     public static int buyandsellstocks(int prices[]){

//         int buyPrice = Integer.MAX_VALUE;
//         int maxProfit = 0;

//         for(int i=0; i<prices.length; i++){
//             if(buyPrice < prices[i]){

//                 int profit = prices[i] - buyPrice;
//                 maxProfit = Math.max(maxProfit , profit );

//             }
//             else{
//                 buyPrice = prices[i];
//             }
//         }
//         return maxProfit;
//     }
//     public static void main(String args[]){
//         int prices[] = {7,1,5,3,6,4};
//     }
// }







// public class array2{
//     public static int buyandsellstocks(int prices[]){

//         int buyprice = Integer.MAX_VALUE;
//         int maxprofit = 0;

//         for(int i=0; i<prices.length; i++){
//             if(buyprice < prices[i]){
//                 int profit = prices[i] - buyprice;
//                 maxprofit = Math.max(profit,maxprofit);

//             }
//             else{
//                 buyprice = prices[i];
//             }
//         }
//         return maxprofit;

//     }
//     public static void main(String args[]){
//         int prices[] = {7,1,5,3,6,4};
//         System.out.println(buyandsellstocks(prices));

//     }
// }







//                  ASSIGNMENT PRATICE QUESTIONS:


// An Array nums is monotonic if it is either monotone increasing or monotone decreasing.

// An Array nums is monotone increasing if for all i <= j, nums.get(i) <= nums.get(j). An Array nums is monotone decreasing if for all i <= j, nums.get(i) >= nums.get(j).

// Given an integer ArrayList nums, return true if the given list is monotonic, or false otherwise.




// Question :            for Monotonic: true    ,   for non monotonic : false

public class array2{

    public static boolean isIncreasingmonotonic(int arr[] , int n){

        for(int i = 1; i<n-1; i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }

    public static boolean isDecreasingmonotonic(int arr[] , int n){

        for(int i = 1; i<n-1; i++){
            if(arr[i] < arr[i+1]){
                return false;
            }
        }
        return true;
    }

    public static boolean isMonotonic(int[] arr,int n){

        boolean isIncreasingmonotonic = isIncreasingmonotonic(arr, n);
        boolean isDecreasingmonotonic = isDecreasingmonotonic(arr, n);

        return isIncreasingmonotonic || isDecreasingmonotonic;
    }

    public static void main (String args[]){

        int arr[] = {1,2,2,3,44,5,6,7,4,3,5,6,1};

        // System.out.println(isIncreasingmonotonic(arr,5));
        // System.out.println(isDecreasingmonotonic(arr,5));

        System.out.println(isMonotonic(arr,5));

    }
}












// //  Question :   Printing lonely numbers:







// import java.util.Arrays;

// public class array2 {

//     public static int lonelynumbers(int arr[], int n) {

//         Arrays.sort(arr); // sorting array

//         for (int i = 0; i < n; i++) {
//             if (i == 0) {
//                 if (arr[i + 1] - arr[i] > 1) {
//                     System.out.println(arr[i]);
//                 }
//             }
            
//             // i==0 and i ==n-1 are written seperatly because for first number previous no.
//               // is not present and for last number next number is not present
//             else if (i == n - 1) {

//                 if (arr[i] - arr[i - 1] > 1) {
//                     System.out.println(arr[i]);
//                 }
//             }

//                    else {
//                 if (arr[i + 1] - arr[i] > 1 && arr[i] - arr[i - 1] > 1) {
//                     System.out.println(arr[i]);
//                 }
//             }
//         }
//         return n;

//     }

//     public static void main(String args[]) {

//         int arr[] = { 10, 6, 5, 8 };

//         lonelynumbers(arr, 4);

//     }
// }








// import java.util.Arrays;

// public class array2{

//     public static int lonelynumbers(int arr[] , int n){
         
//         Arrays.sort(arr);

//         for(int i=0; i<n;i++){
//             if(i==0){
//                 if( arr[i+1] - arr[i] >1){
//                     System.out.println(arr[i]);
//                 }
//             }

//                 else if(i == n-1){
//                     if(arr[i] - arr[i  - 1] > 1){
//                         System.out.println(arr[i]);
//                     }
//                 }
//                 else{
//                     if(arr[i+1] - arr[i] >1 && arr[i] - arr[i-1] > 1){
//                         System.out.println(arr[i]);
//                     }

//                 }

            
//         } return n;
        
//     }






//     public static void main(String args[]){
//         int arr[] = {10,6,5,8};

//         lonelynumbers(arr,4);
        
//     }
// }









// QUES 1:

// Question 1:
// Given an integer array nums, return true if any value appears at least twice
// in the array, and return false if every element is distinct



// public class array2{

//     public static Boolean duplicate(int arr[]){

//         for(int i = 0; i<arr.length-1; i++){
//             for(int j = 0; j<arr.length; j++){
//                 if(arr[i] == arr[j]){
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
//     public static void main(String args[]){

//         int arr[] = {1,2,3,4,5,6,6};

//         Boolean ram = duplicate(arr);

//         System.out.println(ram);
//     }
// }



// ques 3,4 : done in previous lectures



//ques 2 :There is an integer array nums sorted in ascending order (with distinct values).Prior to being
//  passed to your function, nums is possibly rotated at an unknown pivot  index k (1  <=  k  <  nums.length)
//  such  that  the  resulting  array  is [nums[k], nums[k+1],   ...,   nums[n-1], nums[0],   nums[1],   ...,
//    nums[k-1]] (0-indexed).   For   example, [0,1,2,4,5,6,7] might        be        rotated        at
//       pivot        index 3   and become [4,5,6,7,0,1,2].Given the array nums after the possible rotation
//       and an integer target, returnthe index oftarget if it is in nums, or -1   if it is not in nums.You must
//        write an algorithm with O(log n) runtime complexity



//   Based on Binary search.








//                   Three Sum Problem




public class array2{



    public static void main(String[] args) {

        int arr[] = { }
    
    }
}