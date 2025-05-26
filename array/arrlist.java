


// v-1

// import java.util.ArrayList;

// public class arrlist {
//     public static void main(String[] args) {

//      ArrayList<Integer>  list = new ArrayList<>();
//      ArrayList<String>  list2 = new ArrayList<>();
//      ArrayList<Boolean>  list3 = new ArrayList<>();

//      //to add element:

//      list.add(1);  //O(1)
//      list.add(2);
//      list.add(3);
//      list.add(4);
//      list.add(1,11);

//      System.out.println(list);

//     //  //To get element:  O(1)

//     //  int element = list.get(2);

//     //  System.out.println(element);

//     //  //to remove:

//     //  list.remove(2);

//     //  System.out.println(list);

//      //set:

//     //  list.set(0,10);
//     //  list.set(2,10);
//     //  System.out.println(list);
    

//     // //contains:

//     // Boolean a  = list.contains(11);
//     // Boolean b  = list.contains(1);
//     // System.out.println(a);
//     // System.out.println(b);


//     //to print size of list:
//     System.out.println(list.size());

//     //to print AL:

//     for(int i=0; i<list.size(); i++){
//         System.out.print(list.get(i) + " ");
//     }
//     System.out.println();
//     }
// }


//v-4 : to print reverse on an arraylist:



// import java.util.ArrayList;

// public class arrlist{
//     public static void main(String[] args) {

//         ArrayList<Integer>  list = new ArrayList<>();
        
//      list.add(1);  
//      list.add(2);
//      list.add(3);
//      list.add(4);
//      list.add(5);

//      System.out.println(list);

//      //Reverse print:
//      for(int i=list.size()-1; i>=0;i--){
//         System.out.print(list.get(i) + " ");
//      }
//        System.out.println();

//     }
// }



//v-5 find max in list:



// import java.util.ArrayList;

// public class arrlist{
//     public static void main(String[] args) {

//         ArrayList<Integer>  list = new ArrayList<>();
        
//      list.add(2);  
//      list.add(5);
//      list.add(9);
//      list.add(6);
//      list.add(8);

//      System.out.println(list);

//      int max = Integer.MIN_VALUE;
//      for(int i=0; i<list.size();i++){

//         //to compare and return the max value:
//         max = Math.max(max , list.get(i));
//      }
//      System.out.println("max element : " + max);

//     }
// }


//v-6 swap 2 elements:

// import java.util.*;

// public class arrlist{

//     public static void swap(ArrayList<Integer> list , int idx1, int  idx2){
//         int temp = list.get(idx1);
//         list.set(idx1, list.get(idx2));
//         list.set(idx2, temp );
//     }
//     public static void main(String[] args) {

//      ArrayList<Integer>  list = new ArrayList<>();
        
//      list.add(1);  
//      list.add(2);
//      list.add(3);
//      list.add(4);
//      list.add(5);

    
//      int idx1 = 1 ,idx2 = 3;
//        System.out.println(list);
//        swap(list ,idx1, idx2);
//        System.out.println(list);


//     }
// }


//v-7 sorting:

// import java.util.*;

// public class arrlist{

//     public static void swap(ArrayList<Integer> list , int idx1, int  idx2){
//         int temp = list.get(idx1);
//         list.set(idx1, list.get(idx2));
//         list.set(idx2, temp );
//     }
//     public static void main(String[] args) {

//      ArrayList<Integer>  list = new ArrayList<>();
        
//      list.add(1);  
//      list.add(11);
//      list.add(7);
//      list.add(8);
//      list.add(5);

    
//        System.out.println(list);
//        Collections.sort(list); //ascending
//        System.out.println(list);

//        //descending
//        Collections.sort(list, Collections.reverseOrder());
//        System.out.println(list);



//     }
// }



//v- 9 // multidimensinal arraylist: 



// import java.util.*;

// public class arrlist{


//     public static void main(String[] args) {

//         ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(1); list.add(2);
//         mainList.add(list);
        
//         ArrayList<Integer> list2 = new ArrayList<>();
//         list2.add(3); list2.add(4);
//         mainList.add(list2);


//     //printing list:-

//         for(int i=0; i<mainList.size();i++){

//             ArrayList<Integer> currList = mainList.get(i);

//             for(int j=0; j<currList.size();j++){
//                 System.out.print(currList.get(j) + " ");
//             }
//             System.out.println();
//         }

//     }
// }







// to print another list:






// import java.util.*;

// public class arrlist{


//     public static void main(String[] args) {

//         ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
//         ArrayList<Integer> list1 = new ArrayList<>();
//         ArrayList<Integer> list2 = new ArrayList<>();
//         ArrayList<Integer> list3 = new ArrayList<>();

//         for(int i=1; i<=5;i++){
//             list1.add(i*1); //1 2 3 4 5
//             list2.add(i*2); // 2 4 6 8 10
//             list3.add(i*3); // 3 6 9 12 15
//         }

//         mainList.add(list1);
//         mainList.add(list2);
//         mainList.add(list3);
//         list2.remove(3);


//         System.out.println(mainList);


//                 for(int i=0; i<mainList.size();i++){
//             ArrayList<Integer> currList = mainList.get(i);
//             for(int j=0; j<currList.size();j++){
//                 System.out.print(currList.get(j) + " ");
//             }

//             System.out.println();

//         }
//     }
// }




//Container with most water:



// import java.util.*;
// public class arrlist{

//     public static int storewater(ArrayList<Integer> height){

//         int maxWater = 0;

//         //bruteforce:

//         for(int i=0; i<height.size();i++){
//             for(int j=i+1; j< height.size();j++){

//                 //height
//                 int ht = Math.min(height.get(i), height.get(j));
//                 int width = j-i;
//                 int currwater = ht * width;
                
//                 maxWater = Math.max(maxWater , currwater);
//             }
//         }
//         return maxWater;

//     }
//     public static void main(String[] args) {
        
//         ArrayList<Integer> height = new ArrayList<>();

//         height.add(1);
//         height.add(8);
//         height.add(6);
//         height.add(2);
//         height.add(5);
//         height.add(4);
//         height.add(8);
//         height.add(3);
//         height.add(7);

//         System.out.println(storewater(height));
//     }
// }




//another approach:




import java.util.*; 
public class arrlist{

    public static int storewater(ArrayList<Integer> height){

        int maxWater = 0;

        //bruteforce:

        for(int i=0; i<height.size();i++){
            for(int j=i+1; j< height.size();j++){

                //height
                int ht = Math.min(height.get(i), height.get(j));
                int width = j-i;
                int currwater = ht * width;
                
                maxWater = Math.max(maxWater , currwater);
            }
        }
        return maxWater;

    }
    public static void main(String[] args) {
        
        ArrayList<Integer> height = new ArrayList<>();

        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(storewater(height));
    }
}

