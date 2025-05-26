

                // CREATING A CLASS FOR A NODE:


// public class LinkedList{

//     //created single node:

//      public class Node{

//         int data;
//         Node next;

//         public Node(int data){
//             this.data = data;
//             this.next = null;
//         }
//      }
//         public static void main(String args[]){


//         }

// }


    // V-2



//                                 HEADS AND TAILS IN LL:




// public class LinkedList {
//     public class Node{
//         int data;
//         Node next;

//         public Node(int data){
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public static Node head;
//     public static Node tail;


//     //methods:

//     // add()
//     // remove()
//     // print()
//     // search()


//     public static void main(String args[]){
//         LinkedList ll = new LinkedList(); //creating a linked list.  ll is object

//     }
    
// }



// public class LinkedList{

//     public class Node{

//         int data;
//         Node next;

//         public Node(int data){

//             this.data = data;
//             this.next = null;

//         }
// }

//         public static Node head;
//         public static Node tail;

//       public static void main(String[] args) {
//      LinkedList ll = new LinkedList();
 
// }


// }


// V-3                         


//                                              ADD FIRST IN LL:




// public class LinkedList {
//     public class Node{
//         int data;
//         Node next;

//         public Node(int data){
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public static Node head;
//     public static Node tail;

    // public void addFirst(int data){
    //     // step1 = create new node
        
    //     Node newNode = new Node(data);
        
    //     if(head == null){
    //         head = tail = newNode;
    //         return;
    //     }
    //     // step-2 newNode next = head

    //     newNode.next = head; //Link

    //     //step - 3 head = newNode

    //     head = newNode;

    // }

//     public static void main(String args[]){
//         LinkedList ll = new LinkedList(); //creating a linked list.

//         ll.addFirst(1);
//         ll.addFirst(2);

//     }
    
// }

//                             V-4 (ADDLAST IN LL)





// public class LinkedList {
//     public class Node{
//         int data;
//         Node next;

//         public Node(int data){
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public static Node head;
//     public static Node tail;

//     public void addfirst(int data){
//         // step1 = create new node
        
//         Node newNode = new Node(data);
        
//         if(head == null){
//             head = tail = newNode;
//             return;
//         }
//         // step-2 newNode next = head

//         newNode.next = head; //Link

//         //step - 3 head = newNode

//         head = newNode;

//     }
    
//   public void addlast(int data){

//     // creatin new Node:

//         Node newNode = new Node(data);

//         if(head == null){
//             head = tail = newNode;
//             return;
//         }

//         // tail.next = newNode

//         tail.next = newNode;

//         //tail = newNode:

//         tail = newNode;

//     }

//     public static void main(String args[]){
//         LinkedList ll = new LinkedList();  //creating a linked list.

//         ll.addfirst(2);
//         ll.addfirst(1);
//         ll.addlast(3);
//         ll.addlast(4);

//     }
    
// }


// public class LinkedList{

//     public class Node{

//         int data;
//         Node next;

//         public Node(int data){

//             this.data = data;
//             this.next = null;
//         }
//     }

//     public static Node head;
//     public static Node tail;


//     public void addfirst(int data){

//         Node NewNode = new Node(data);

//         if(head == null){
//             head = tail = null;
//             return;
//         }

//         NewNode.next = head;
//         head = NewNode;
//     }

//     public void addlast(int data){

//         Node NewNode = new Node(data);

//         if(head ==null){

//             head = tail =null;
//             return;
//         }

//         tail.next = NewNode;
//         tail = NewNode;
//     }
//       public static void main(String[] args) {
//           LinkedList ll = new LinkedList();

//           ll.addfirst(2);
//           ll.addfirst(1);
//           ll.addlast(3);
//           ll.addlast(4);
//       }

// }



// //                  V - 5:  To print a LL





// public class LinkedList {
//     public class Node{
//         int data;
//         Node next;

//         public Node(int data){
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public static Node head;
//     public static Node tail;

//     public void addfirst(int data){
//         // step1 = create new node
        
//         Node newNode = new Node(data);
        
//         if(head == null){
//             head = tail = newNode;
//             return;
//         }
//         // step-2 newNode next = head

//         newNode.next = head; //Link

//         //step - 3 head = newNode
        // head = newNode;

//     }
    
//   public void addlast(int data){
//         Node newNode = new Node(data);

//         if(head == null){
//             head = tail = newNode;
//             return;
//         }

//         tail.next = newNode;
//         tail = newNode;

//     }

    // public void print(){
    //     if(head == null){
    //         System.out.println("LL is empty.");
    //         return;
    //     }
    //     Node temp = head;
    //     while(temp!= null){
    //         System.out.print(temp.data + "->");
    //         temp = temp.next;
    //     }
    //       System.out.println("null"); 
    // }

//     public static void main(String args[]){
//         LinkedList  ll = new LinkedList(); //creating a linked list.

//         ll.print();
//         ll.addfirst(2);
//         ll.print();
//         ll.addfirst(1);
//         ll.print();
//         ll.addlast(3);
//         ll.print();
//         ll.addlast(4);
//         ll.print();

//     }
    
// }



// public class  LinkedList{

//     public class Node {

//         int data;
//         Node next;

//         public Node(int data){

//             this.data=data;
//             this.next=null;

//         }

//     }
    
//     public static Node head;
//     public static Node tail;


//     public void addFirst(int data){

//         Node newNode = new Node(data);

//         if(head ==null){
//             head = tail =newNode;
//             return;
//         }

//         newNode.next = head;
//         head = newNode;
//     }


//     public void addLast(int data){

//         Node newNode = new Node(data);

//         if(head == null){
//             head = tail = newNode;
//             return;
//         }

//         tail.next = newNode;
//         tail = newNode;
//     }

//     public void print(){

//         if(head == null){
//             System.out.println("LL is empty.");
//             return;
//         }

//         Node temp = head;

//     while(temp != null){
//         System.out.print(temp.data + "->");
//         temp = temp.next;

//     }

//     System.out.println("null");


//     }

//     public static void main(String[] args) {

//         LinkedList ll = new LinkedList();

//         ll.print();
//         ll.addFirst(2);
//         ll.print();
//         ll.addFirst(1);
//         ll.print();
//         ll.addLast(3);
//         ll.print();
//         ll.addLast(4);
//         ll.print();
        
//     }
// }







//                       V-6  add in Middle of LL:


// public class LinkedList {
//     public class Node{
//         int data;
//         Node next;

//         public Node(int data){
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public static Node head;
//     public static Node tail;

//     public void addfirst(int data){
//         // step1 = create new node
        
//         Node newNode = new Node(data);
        
//         if(head == null){
//             head = tail = newNode;
//             return;
//         }
//         // step-2 newNode next = head

//         newNode.next = head; //Link

//         //step - 3 head = newNode
//         head = newNode;

//     }
    
//   public void addlast(int data){
//         Node newNode = new Node(data);

//         if(head == null){
//             head = tail = newNode;
//             return;
//         }

//         tail.next = newNode;
//         tail = newNode;

//     }

//     public void print(){
//         if(head == null){
//             System.out.println("LL is empty.");
//             return;
//         }
//         Node temp = head;
//         while(temp!= null){
//             System.out.print(temp.data + "->");
//             temp = temp.next;
//         }
//           System.out.println("null"); 
//     }


//     public void add(int idx , int data){

//         if(idx == 0){
//             addfirst(data);
//             return;
//         } 

//         Node NewNode = new Node(data);  
//         Node temp = head;
//         int i=0;

//         while(i < idx-1){
//            temp =  temp.next;
//            i++;

//         }

//         // NewNode.next = temp.next;
//          NewNode.next = temp.next ;
//         temp.next = NewNode;
//     }


//     public static void main(String args[]){
//         LinkedList  ll = new LinkedList(); //creating a linked list.

       
//         ll.addfirst(2);
   
//         ll.addfirst(1);
      
//         ll.addlast(3);
   
//         ll.addlast(4);

//         ll.print();

//         ll.add(2,555);

//         ll.print();

//     }
    
// }




//        V-7   To print size of LL:




// public class LinkedList {
//     public class Node{
//         int data;
//         Node next;

//         public Node(int data){
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public static Node head;
//     public static Node tail;
//     public static int size;

//     public void addfirst(int data){
//         // step1 = create new node
        
//         Node newNode = new Node(data);
//         size++;
        
//         if(head == null){
//             head = tail = newNode;
//             return;
//         }
//         // step-2 newNode next = head

//         newNode.next = head; //Link

//         //step - 3 head = newNode
//         head = newNode;

//     }
    
//   public void addlast(int data){
//         Node newNode = new Node(data);
//         size++;

//         if(head == null){
//             head = tail = newNode;
//             return;
//         }

//         tail.next = newNode;
//         tail = newNode;

//     }

//     public void print(){
//         if(head == null){
//             System.out.println("LL is empty.");
//             return;
//         }
//         Node temp = head;
//         while(temp!= null){
//             System.out.print(temp.data + "->");
//             temp = temp.next;
//         }
//           System.out.println("null"); 
//     }


//     public void add(int idx , int data){

//         if(idx ==0){
//             addfirst(data);
//             return;
//         }

//         Node NewNode = new Node(data); 
//         size++; 
//         Node temp = head;
//         int i=0;

//         while(i < idx-1){
//            temp =  temp.next;
//            i++;

//         }

//         NewNode.next = temp.next;
//         temp.next = NewNode;
//     }


//     public static void main(String args[]){
//         LinkedList  ll = new LinkedList(); //creating a linked list.

       
//         ll.addfirst(2);
   
//         ll.addfirst(1);
      
//         ll.addlast(3);
   
//         ll.addlast(4);

//         ll.add(2,1111);
//         ll.add(2,1111);

//         ll.print();
//         System.out.println(ll.size);

//     }
    
// }




//             to Remove First in LL:



// public class LinkedList {
//     public class Node{
//         int data;
//         Node next;

//         public Node(int data){
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public static Node head;
//     public static Node tail;
//     public static int size;

//     public void addfirst(int data){
//         // step1 = create new node
        
//         Node newNode = new Node(data);
//         size++;
        
//         if(head == null){
//             head = tail = newNode;
//             return;
//         }
//         // step-2 newNode next = head

//         newNode.next = head; //Link

//         //step - 3 head = newNode
//         head = newNode;

//     }
    
//   public void addlast(int data){
//         Node newNode = new Node(data);
//         size++;

//         if(head == null){
//             head = tail = newNode;
//             return;
//         }

//         tail.next = newNode;
//         tail = newNode;

//     }

//     public void print(){
//         if(head == null){
//             System.out.println("LL is empty.");
//             return;
//         }
//         Node temp = head;
//         while(temp!= null){
//             System.out.print(temp.data + "->");
//             temp = temp.next;
//         }
//           System.out.println("null"); 
//     }


//     public void add(int idx , int data){

//         if(idx ==0){
//             addfirst(data);
//             return;
//         }

//         Node NewNode = new Node(data); 
//         size++; 
//         Node temp = head;
//         int i=0;

//         while(i < idx-1){
//            temp =  temp.next;
//            i++;

//         }  
//         NewNode.next = temp.next;
//         temp.next = NewNode;
//     }


//     public int removeFirst(){

//         if(size == 0){
//             System.out.println("LL is Empty");
//         }

//         else if(size == 1){
//             int val = head.data;
//             head = tail = null;
//             size =0;
//             return val;

//         }

//         int val = head.data; // upper part
//         head = head.next;    // lower part
//         size--;
//         return val;  
//     }



//     public static void main(String args[]){
//         LinkedList  ll = new LinkedList(); //creating a linked list.

       
//         ll.addfirst(2);
//         ll.addfirst(1);
//         ll.addlast(3);
//         ll.addlast(4);
//         ll.add(2,9);
//         ll.print();
//         System.out.println(ll.size);

//         ll.removeFirst();
//         ll.print();

//     }
    
// }





//                             v - 9   {Remove Last}



// public class LinkedList {
//     public class Node{
//         int data;
//         Node next;

//         public Node(int data){
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public static Node head;
//     public static Node tail;
//     public static int size;

//     public void addfirst(int data){
//         // step1 = create new node
        
//         Node newNode = new Node(data);
//         size++;
        
//         if(head == null){
//             head = tail = newNode;
//             return;
//         }
//         // step-2 newNode next = head

//         newNode.next = head; //Link

//         //step - 3 head = newNode
//         head = newNode;

//     }
    
//   public void addlast(int data){
//         Node newNode = new Node(data);
//         size++;

//         if(head == null){
//             head = tail = newNode;
//             return;
//         }

//         tail.next = newNode;
//         tail = newNode;

//     }

//     public void print(){
//         if(head == null){
//             System.out.println("LL is empty.");
//             return;
//         }
//         Node temp = head;
//         while(temp!= null){
//             System.out.print(temp.data + "->");
//             temp = temp.next;
//         }
//           System.out.println("null"); 
//     }


//     public void add(int idx , int data){

//         if(idx ==0){
//             addfirst(data);
//             return;
//         }

//         Node NewNode = new Node(data); 
//         size++; 
//         Node temp = head;
//         int i=0;

//         while(i < idx-1){
//            temp =  temp.next;
//            i++;

//         }
//         NewNode.next = temp.next;
//         temp.next = NewNode;
//     }


//     public int removeFirst(){

//         if(size == 0){
//             System.out.println("LL is Empty");
//             return Integer.MIN_VALUE;
//         }

//         else if(size == 1){
//             int val = head.data;
//             head = tail = null;
//             size =0;
//             return val;

//         }

//         int val = head.data;
//         head = head.next;
//         size--;
//         return val;
//     }



//     public int RemoveLast(){

//         if(size == 0){
//             System.out.println("LL is Empty");
//             return Integer.MIN_VALUE;
//         }
//         else if(size == 1){
//             int val = tail.data;
//             head = tail = null;
//             size = 0;
//             return val;
//         }

//         //prev = i = size-2

//         Node prev = head;
//         for(int i = 0; i<size-2; i++){
//             prev = prev.next;
//         }

//         int val = prev.next.data;   //tail data
//         prev.next = null;
//         tail = prev;
//         size--;
//         return val;

//     }

//     public int removeLast(){

//         if(size ==0){

//             System.out.print("LL is empty.");
//             return Integer.MIN_VALUE;
//         }

//         if(size ==1){

//             int val = tail.data;
//             head = tail = null;
//             size = 0;
//             return val;
//         }

//         // prev = i = size - 2

//         Node prev = head;
//         for(int i=0; i<size-2 ; i++){
//             prev = prev.next;
//         }

//         int val = prev.next.data;
//         prev.next = null;
//         tail=prev;
//         size--;
//         return val;

//     }

//     public static void main(String args[]){
//         LinkedList  ll = new LinkedList(); //creating a linked list.



//         ll.addfirst(2);
//         ll.addfirst(1);
//         ll.addlast(3);
//         ll.addlast(4);
//         ll.add(2,9);
//         ll.print();

//         ll.removeFirst();
//         ll.print();

//         ll.RemoveLast();
//         ll.print();
//         System.out.println(ll.size);

//     }
    
// }




//              v-10    (Iterative Search)

// public class LinkedList {
//     public class Node{
//         int data;
//         Node next;

//         public Node(int data){
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public static Node head;
//     public static Node tail;
//     public static int size;

//     public void addfirst(int data){
//         // step1 = create new node
        
//         Node newNode = new Node(data);
//         size++;
        
//         if(head == null){
//             head = tail = newNode;
//             return;
//         }
//         // step-2 newNode next = head

//         newNode.next = head; //Link

//         //step - 3 head = newNode
//         head = newNode;

//     }
    
//   public void addlast(int data){
//         Node newNode = new Node(data);
//         size++;

//         if(head == null){
//             head = tail = newNode;
//             return;
//         }

//         tail.next = newNode;
//         tail = newNode;

//     }

//     public void print(){
//         if(head == null){
//             System.out.println("LL is empty.");
//             return;
//         }
//         Node temp = head;
//         while(temp!= null){
//             System.out.print(temp.data + "->");
//             temp = temp.next;
//         }
//           System.out.println("null"); 
//     }


//     public void add(int idx , int data){

//         if(idx ==0){
//             addfirst(data);
//             return;
//         }

//         Node NewNode = new Node(data); 
//         size++; 
//         Node temp = head;
//         int i=0;

//         while(i < idx-1){
//            temp =  temp.next;
//            i++;

//         }
//         NewNode.next = temp.next;
//         temp.next = NewNode;
//     }


//     public int removeFirst(){

//         if(size == 0){
//             System.out.println("LL is Empty");
//             return Integer.MIN_VALUE;
//         }

//         else if(size == 1){
//             int val = head.data;
//             head = tail = null;
//             size =0;
//             return val;

//         }

//         int val = head.data;
//         head = head.next;
//         size--;
//         return val;
//     }



//     public int RemoveLast(){

//         if(size == 0){
//             System.out.println("LL is Empty");
//             return Integer.MIN_VALUE;
//         }
//         else if(size==1){
//             int val = tail.data;
//             head = tail= null;
//             size = 0;
//             return val;
//         }

//         //prev = i = size-2

//         Node prev = head;
//         for(int i = 0; i<size-2; i++){
//             prev = prev.next;
//         }

//         int val = prev.next.data;
//         prev.next = null;
//         tail = prev;
//         size--;
//         return val;

//     }


//     public int itrSearch(int key){
//         Node temp = head;
//         int i = 0;

//          while(temp != null){
//             if(temp.data == key){
//                 return i;
                
//             }

//             temp = temp.next;
//             i++;
//          }
//          //not found:
//          return -1;
//     }



//     public static void main(String args[]){
//         LinkedList  ll = new LinkedList(); //creating a linked list.

       
//         ll.addfirst(2);
//         ll.addfirst(1);
//         ll.addlast(3);
//         ll.addlast(4);
//         // ll.add(2,9);
//         ll.print();


//         // ll.removeFirst();
//         // ll.print();

//         // ll.RemoveLast();
//         // ll.print();
//         // System.out.println(ll.size);

//         System.out.println(ll.itrSearch(3));
//         System.out.println(ll.itrSearch(10));
//     }
    
// }



//     V-11              Recursive Search:



// public class LinkedList {
//     public class Node{
//         int data;
//         Node next;

//         public Node(int data){
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public static Node head;
//     public static Node tail;
//     public static int size;

//     public void addfirst(int data){
//         // step1 = create new node
        
//         Node newNode = new Node(data);
//         size++;
        
//         if(head == null){
//             head = tail = newNode;
//             return;
//         }
//         // step-2 newNode next = head

//         newNode.next = head; //Link

//         //step - 3 head = newNode
//         head = newNode;

//     }
    
//   public void addlast(int data){
//         Node newNode = new Node(data);
//         size++;

//         if(head == null){
//             head = tail = newNode;
//             return;
//         }

//         tail.next = newNode;
//         tail = newNode;

//     }

//     public void print(){
//         if(head == null){
//             System.out.println("LL is empty.");
//             return;
//         }
//         Node temp = head;
//         while(temp!= null){
//             System.out.print(temp.data + "->");
//             temp = temp.next;
//         }
//           System.out.println("null"); 
//     }


//     public void add(int idx , int data){

//         if(idx ==0){
//             addfirst(data);
//             return;
//         }

//         Node NewNode = new Node(data); 
//         size++; 
//         Node temp = head;
//         int i=0;

//         while(i < idx-1){
//            temp =  temp.next;
//            i++;

//         }
//         NewNode.next = temp.next;
//         temp.next = NewNode;
//     }


//     public int removeFirst(){

//         if(size == 0){
//             System.out.println("LL is Empty");
//             return Integer.MIN_VALUE;
//         }

//         else if(size == 1){
//             int val = head.data;
//             head = tail = null;
//             size =0;
//             return val;

//         }

//         int val = head.data;
//         head = head.next;
//         size--;
//         return val;
//     }



//     public int RemoveLast(){

//         if(size == 0){
//             System.out.println("LL is Empty");
//             return Integer.MIN_VALUE;
//         }
//         else if(size==1){
//             int val = tail.data;
//             head = tail= null;
//             size = 0;
//             return val;
//         }

//         //prev = i = size-2

//         Node prev = head;
//         for(int i = 0; i<size-2; i++){
//             prev = prev.next;
//         }

//         int val = prev.next.data;
//         prev.next = null;
//         tail = prev;
//         size--;
//         return val;

//     }


//     public int itrSearch(int key){

//         Node temp = head;
//         int i = 0;

//          while(temp != null){
//             if(temp.data == key){
//                 return i;

//             }

//             temp = temp.next;
//             i++;
//          }
//          //not found:
//          return -1;
//     }


//     public int helper(Node head , int key){

//         if(head == null){
//             return -1;
//         }

//         if( head.data == key){
//             return 0;
//         }

//         int idx = helper(head.next , key);
//         if(idx == -1){
//             return -1;
//         }
//         return idx + 1;

//     }

//     public int RecurSearch(int key){

//         return helper(head,key);

//     }

//     public static void main(String args[]){
//         LinkedList  ll = new LinkedList(); //creating a linked list.

       
//         ll.addfirst(2);
//         ll.addfirst(1);
//         ll.addlast(3);
//         ll.addlast(4);
//         // ll.add(2,9);
//         ll.print();


//         ll.removeFirst();
//         ll.print();

//         ll.RemoveLast();
//         ll.print();
//         System.out.println(ll.size);

//         System.out.println(ll.RecurSearch(3));
//         System.out.println(ll.itrSearch(10));
//     }
    
// }







 //                                Reverse a linked list:



//  public class LinkedList {
//     public class Node{
//         int data;
//         Node next;

//         public Node(int data){
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public static Node head;
//     public static Node tail;
//     public static int size;

//     public void addfirst(int data){
//         // step1 = create new node
        
//         Node newNode = new Node(data);
//         size++;
        
//         if(head == null){
//             head = tail = newNode;
//             return;
//         }
//         // step-2 newNode next = head

//         newNode.next = head; //Link

//         //step - 3 head = newNode
//         head = newNode;

//     }
    
//   public void addlast(int data){
//         Node newNode = new Node(data);
//         size++;

//         if(head == null){
//             head = tail = newNode;
//             return;
//         }

//         tail.next = newNode;
//         tail = newNode;

//     }

//     public void print(){
//         if(head == null){
//             System.out.println("LL is empty.");
//             return;
//         }
//         Node temp = head;
//         while(temp!= null){
//             System.out.print(temp.data + "->");
//             temp = temp.next;
//         }
//           System.out.println("null"); 
//     }


//     public void add(int idx , int data){

//         if(idx ==0){
//             addfirst(data);
//             return;
//         }

//         Node NewNode = new Node(data); 
//         size++; 
//         Node temp = head;
//         int i=0;

//         while(i < idx-1){
//            temp =  temp.next;
//            i++;

//         }
//         NewNode.next = temp.next;
//         temp.next = NewNode;
//     }


//     public int removeFirst(){

//         if(size == 0){
//             System.out.println("LL is Empty");
//             return Integer.MIN_VALUE;
//         }

//         else if(size == 1){
//             int val = head.data;
//             head = tail = null;
//             size =0;
//             return val;

//         }

//         int val = head.data;
//         head = head.next;
//         size--;
//         return val;
//     }



//     public int RemoveLast(){

//         if(size == 0){
//             System.out.println("LL is Empty");
//             return Integer.MIN_VALUE;
//         }
//         else if(size==1){
//             int val = tail.data;
//             head = tail= null;
//             size = 0;
//             return val;
//         }

//         //prev = i = size-2

//         Node prev = head;
//         for(int i = 0; i<size-2; i++){
//             prev = prev.next;
//         }

//         int val = prev.next.data;
//         prev.next = null;
//         tail = prev;
//         size--;
//         return val;

//     }


//     public int itrSearch(int key){

//         Node temp = head;
//         int i = 0;

//          while(temp != null){
//             if(temp.data == key){
//                 return i;

//             }

//             temp = temp.next;
//             i++;
//          }
//          //not found:
//          return -1;
//     }


//     public int helper(Node head , int key){

//         if(head == null){
//             return -1;
//         }

//         if( head.data == key){
//             return 0;
//         }

//         int idx = helper(head.next , key);
//         if(idx == -1){
//             return -1;
//         }
//         return idx + 1;

//     }

//     public int RecurSearch(int key){

//         return helper(head,key);

//     }


    // public void reverse(){

    //     Node next;
    //     Node curr = tail = head;
    //     Node prev = null;

    //     while(curr != null){

    //         next = curr.next;
    //         curr.next = prev;
    //         prev=curr;
    //         curr=next;
    //     }   
    //     head = prev;

    // }

//     public static void main(String args[]){
//         LinkedList  ll = new LinkedList(); //creating a linked list.

       
//         ll.addfirst(2);
//         ll.addfirst(1);
//         ll.addlast(3);
//         ll.addlast(4);
//         ll.addlast(5);
//         // ll.add(2,9);
//         ll.print();  // 1->2->9->3->4



//         // ll.removeFirst();
//         // ll.print();

//         // ll.RemoveLast();
//         // ll.print();
//         // System.out.println(ll.size);

//         // System.out.println(ll.RecurSearch(3));
//         // System.out.println(ll.itrSearch(10));


//         ll.reverse();

//         ll.print();

//     }
    
// }




//                   Find and Remove Nth Node from end:



//   Iterative Approach


// public class LinkedList {
//     public class Node{
//         int data;
//         Node next;

//         public Node(int data){
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public static Node head;
//     public static Node tail;
//     public static int size;

//     public void addfirst(int data){
//         // step1 = create new node
        
//         Node newNode = new Node(data);
//         size++;
        
//         if(head == null){
//             head = tail = newNode;
//             return;
//         }
//         // step-2 newNode next = head

//         newNode.next = head; //Link

//         //step - 3 head = newNode
//         head = newNode;

//     }
    
//   public void addlast(int data){
//         Node newNode = new Node(data);
//         size++;

//         if(head == null){
//             head = tail = newNode;
//             return;
//         }

//         tail.next = newNode;
//         tail = newNode;

//     }

//     public void print(){
//         if(head == null){
//             System.out.println("LL is empty.");
//             return;
//         }
//         Node temp = head;
//         while(temp!= null){
//             System.out.print(temp.data + "->");
//             temp = temp.next;
//         }
//           System.out.println("null"); 
//     }


//     public void add(int idx , int data){

//         if(idx ==0){
//             addfirst(data);
//             return;
//         }

//         Node NewNode = new Node(data); 
//         size++; 
//         Node temp = head;
//         int i=0;

//         while(i < idx-1){
//            temp =  temp.next;
//            i++;

//         }
//         NewNode.next = temp.next;
//         temp.next = NewNode;
//     }


//     public int removeFirst(){

//         if(size == 0){
//             System.out.println("LL is Empty");
//             return Integer.MIN_VALUE;
//         }

//         else if(size == 1){
//             int val = head.data;
//             head = tail = null;
//             size =0;
//             return val;

//         }

//         int val = head.data;
//         head = head.next;
//         size--;
//         return val;
//     }



//     public int RemoveLast(){

//         if(size == 0){
//             System.out.println("LL is Empty");
//             return Integer.MIN_VALUE;
//         }
//         else if(size==1){
//             int val = tail.data;
//             head = tail= null;
//             size = 0;
//             return val;
//         }

//         //prev = i = size-2

//         Node prev = head;
//         for(int i = 0; i<size-2; i++){
//             prev = prev.next;
//         }

//         int val = prev.next.data;
//         prev.next = null;
//         tail = prev;
//         size--;
//         return val;

//     }


//     public int itrSearch(int key){

//         Node temp = head;
//         int i = 0;

//          while(temp != null){
//             if(temp.data == key){
//                 return i;

//             }

//             temp = temp.next;
//             i++;
//          }
//          //not found:
//          return -1;
//     }


//     public int helper(Node head , int key){

//         if(head == null){
//             return -1;
//         }

//         if( head.data == key){
//             return 0;
//         }

//         int idx = helper(head.next , key);
//         if(idx == -1){
//             return -1;
//         }
//         return idx + 1;

//     }

//     public int RecurSearch(int key){

//         return helper(head,key);

//     }


//     public void reverse(){

//         Node next;
//         Node curr = tail = head;
//         Node prev = null;

//         while(curr != null){

//             next = curr.next;
//             curr.next = prev;
//             prev=curr;
//             curr=next;
//         }
//         head = prev;

//     }


//     public void deletenthfromend(int n){

//         //calculate size:

//         int sz=0;
//         Node temp = head;

//         while(temp!=null){
//             temp = temp.next;
//             sz++;  
//         }

//         //if i need to delete my head:

//         if(n == sz){
//             head = head.next;  //removefirst
//             return;
//         }

//         //reach sz-n:  prev node from actual node to delete:

//         int i = 1;
//         int itofind = sz-n;
//         Node prev = head;

//         while(i < itofind){
//             prev = prev.next;
//             i++;
//         }

//         prev.next = prev.next.next;
//         return;

//     }

//     public static void main(String args[]){
//         LinkedList  ll = new LinkedList(); //creating a linked list.

       
//         ll.addfirst(2);
//         ll.addfirst(1);
//         ll.addlast(3);
//         ll.addlast(4);
//         ll.addlast(5);
//         ll.print();  // 1->2->3->4->5

//         ll.deletenthfromend(3); 
//         ll.print(); //  1->2->4->5


//         // ll.removeFirst();
//         // ll.print();

//         // ll.RemoveLast();
//         // ll.print();
//         // System.out.println(ll.size);

//         // System.out.println(ll.RecurSearch(3));
//         // System.out.println(ll.itrSearch(10));


//         // ll.reverse();

//         // ll.print();

//     }
    
// }





//                                      check if a ll is palindrome:


 




//                         Cycle in a LL:



// public class LinkedList {
//     public class Node {
//         int data;
//         Node next;

//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public Node head;  // Removed static to properly reference the inner class
//     public Node tail;
//     public int size;

//     public boolean isCycle() {
//         Node slow = head;
//         Node fast = head;

//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;

//             if (slow == fast) {
//                 return true; // cycle exists
//             }
//         }
//         return false; // cycle doesn't exist
//     }

//     public static void main(String args[]) {
//         LinkedList ll = new LinkedList();

//         ll.head = ll.new Node(1);
//         ll.head.next = ll.new Node(2);
//         ll.head.next.next = ll.new Node(3);
//         ll.head.next.next.next = ll.head; // Creates a cycle

//         System.out.println(ll.isCycle()); // Should print true
//     }
// }




//                          remove a cycle


// public class LinkedList {
//     static class Node { // Made Node static so it can be used inside static methods
//         int data;
//         Node next;

//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public static Node head;
//     public static Node tail;
//     public int size;

//     public static boolean isCycle() {
//         Node slow = head;
//         Node fast = head;

//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;

//             if (slow == fast) {
//                 return true; // Cycle detected
//             }
//         }
//         return false; // No cycle
//     }

//     public static void removeCycle() {


//         //detect cycle :

//         Node slow = head;
//         Node fast = head;
//         boolean cycle = false; // Set correctly

//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;

//             if (slow == fast) {
//                 cycle = true;
//                 break;
//             }
//         }

//         if (cycle == false) {
//             return; // No cycle detected
//         }

//         // Find the meeting point
//         slow = head;
//         Node prev = null;

//         while (slow != fast) {
//             prev = fast;
//             slow = slow.next;
//             fast = fast.next;
//         }

//         // Break the cycle
//         prev.next = null;
//     }

//     public static void main(String args[]) {
//         head = new Node(1);
//         Node temp = new Node(2);
//         head.next = temp;
//         head.next.next = new Node(3);
//         head.next.next.next = temp; // Creates a cycle

//         // 1 -> 2 -> 3 -> (cycle back to 2)
//         System.out.println(isCycle()); // Should print true
//         removeCycle();
//         System.out.println(isCycle()); // Should print false
//     }
// }






//               LL is java collections framework:


// import java.util.LinkedList;

// public class LinkedListExample {
//     public static void main(String[] args) {
//         LinkedList<Integer> ll = new LinkedList<>();

//         ll.addLast(1);
//         ll.addLast(2);
//         ll.addFirst(0);

//         System.out.println("Before removal: " + ll);

//         ll.removeLast();
//         ll.removeFirst();

//         System.out.println("After removal: " + ll);
//     }
// }




//                     Merge sort on a LL:



// this one is for array:


// public class LinkedList{


//     public static void printArr(int arr[]){
//         for(int i =0; i<arr.length; i++){
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();

//     }


//     public static void mergeSort(int arr[], int si, int ei){


//         if(si >= ei){
//             return;
//         }




//         int mid = si + (ei-si)/2;

//         mergeSort(arr,si, mid);
//         mergeSort(arr,mid+1,ei);
//         merge(arr,si,mid,ei);

//     }

//     public static void merge(int arr[] , int si , int mid, int ei){

//         int temp[] = new int[ei-si +1];

//         int i = si;
//         int j = mid +1;
//         int k = 0;

//         while( i<= mid && j<= ei){

//             if(arr[i] < arr[j]){
//                 temp[k] = arr[i];
//                 i++;
//             }
//             else{
//                 temp[k] = arr[j];
//                 j++;
//             }
//             k++;
//         }


//         //leftover:

//         while( i <= mid ){
//             temp[k++] = arr[i++];
//         }

//         //rightover:

//         while(j <= ei){
//             temp[k++] = arr[j];
//         }
    

//         for( k=0, i=si; k<temp.length; k++, i++){
//             arr[i] = temp[k];
//         }


//     }


//     public static void main(String[] args) {

//         int arr[] = {9,8,7,6,5,4,3,2,1};

//         mergeSort(arr , 0 , arr.length-1);

//         printArr(arr);
        
//     }
// }






// for LL:



// public class LinkedList{

//     public class Node {

//         int data;
//         Node next;

//         public Node(int data){

//             this.data = data;
//             this.next = null;
//         }
//     }
//         public static Node head;
//         public static Node tail;

    

//     // add first:
//     public void addFirst(int data){
//         // step1 = create new node
        
//         Node newNode = new Node(data);
        
//         if(head == null){
//             head = tail = newNode;
//             return;
//         }
//         // step-2 newNode next = head

//         newNode.next = head; //Link

//         //step - 3 head = newNode

//         head = newNode;

//     }

//     public void print(){
//         if(head == null){
//             System.out.println("LL is empty.");
//             return;
//         }

//         Node temp = head;
//         while(temp!= null){
//             System.out.print(temp.data + "->");
//             temp = temp.next;
//         }
//           System.out.println("null"); 
//     }


//     // Getting Mid:


//     private Node getMid(Node head){

//         Node slow  = head;
//         Node fast = head.next;

//         while(fast != null && fast.next != null){

//             slow = slow.next;
//             fast = fast.next.next;
//         }
//         return slow;
//     }
    
   
//     // MergeingSort:


//     public Node mergeSort(Node head){

//         //base case:

//         if(head == null  || head.next == null){
//             return head;
//         }

//         //Finding mid:  

//         Node mid  = getMid(head);


//         //left and right mergeSort;
//         Node righthead = mid.next;
//         mid.next = null;

//         Node newLeft = mergeSort(head);
//         Node newRight = mergeSort(righthead);


//         //merge:
//         return Merge(newLeft, newRight);

//     }


     
//         //Merge function:

//         private Node Merge(Node head1 , Node head2){

//             Node mergedLL  = new Node(-1);
//             Node temp = mergedLL;

//             while(head1 != null  && head2!=null){

//                 if(head1.data  <= head2.data){
//                     temp.next = head1;
//                     head1 = head1.next;
//                     temp = temp.next;
//                 }
//                 else{
//                     temp.next = head2;
//                     head2 = head2.next;
//                     temp = temp.next;
//                 }

//             }


//             while(head1 != null){

//                 temp.next = head1;
//                 head1 = head1.next;
//                 temp = temp.next;
//             }


//             while(head2 != null){

//                 temp.next = head2;
//                 head2 = head2.next;
//                 temp = temp.next;
//             }

//             return mergedLL.next;

//         }

   
//     public static void main(String[] args) {
        
//         LinkedList ll = new LinkedList();

//         ll.addFirst(1);
//         ll.addFirst(2);
//         ll.addFirst(3);
//         ll.addFirst(4);
//         ll.addFirst(5);
//         ll.addFirst(6);

//         ll.print();
//         ll.head = ll.mergeSort(ll.head);
//         ll.print();

//     }
// }





// public class LinkedList{


//     //node class

//     public class Node{
//         int data;
//         Node next;

//         public Node(int data){

//             this.data = data;
//             this.next = null;
//         }
//     }

//     public static Node head;
//     public static Node tail;


//     //addfirst

//     public void addFirst(int data){

//         Node newNode = new Node(data);

//         if(head == null){
//             head = tail = newNode;
//             return;
//         }

//         newNode.next = head;
//         head = newNode;
//     }

//     //printing LL:

//     public void print(){

//         if(head == null){
//             System.out.println("LL is Empty.");
//             return;
//         }

//         Node temp = head;
//         while(temp != null){
//             System.out.print(temp.data + "->");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }

//     //getting mid:

//     private Node getMid(Node head){

//         Node slow = head;
//         Node fast = head.next;

//         while(fast != null && fast.next != null){
//             slow = slow.next;
//             fast = fast.next.next;
//         }
//         return slow;
//     }


//     //mergeSort function:

//     public Node mergeSort(Node head){

//         //base class:

//         if(head == null || head.next == null){
//             return head;
//         }

//         //mid:

//         Node mid = getMid(head);


//         //mergeing left and right part:
//         Node righthead = mid.next;
//         mid.next = null;

//         Node newLeft = mergeSort(head);
//         Node newRight = mergeSort(righthead);

//         //merge completely:

//         return Merge(newLeft, newRight);

//     }


//         //Merge function:

//         private Node Merge(Node head1 , Node head2){

//             Node mergedLL  = new Node(-1);
//             Node temp = mergedLL;

//             while(head1 != null  && head2!=null){

//                 if(head1.data  <= head2.data){
//                     temp.next = head1;
//                     head1 = head1.next;
//                     temp = temp.next;

//                 }
//                 else{
//                     temp.next = head2;
//                     head2 = head2.next;
//                     temp = temp.next;

//                 }
//             }

//             while(head1 != null){

//                 temp.next = head1;
//                 head1 = head1.next;
//                 temp = temp.next;
//             }


//             while(head2 != null){

//                 temp.next = head2;
//                 head2 = head2.next;
//                 temp = temp.next;
//             }

//             return mergedLL.next;

//         }

   
//     public static void main(String[] args) {
        
//         LinkedList ll = new LinkedList();

//         ll.addFirst(1);
//         ll.addFirst(2);
//         ll.addFirst(3);
//         ll.addFirst(4);
//         ll.addFirst(5);
//         ll.addFirst(6);

//         ll.print();
//         ll.head = ll.mergeSort(ll.head);
//         ll.print();

//     }
// }




        //  ZigZag LL:






// public class LinkedList{

//     public class Node {

//         int data;
//         Node next;

//         public Node(int data){

//             this.data = data;
//             this.next = null;
//         }
//     }
//         public static Node head;
//         public static Node tail;

    

//     // add first:
//     public void addFirst(int data){
//         // step1 = create new node
        
//         Node newNode = new Node(data);
        
//         if(head == null){
//             head = tail = newNode;
//             return;
//         }
//         // step-2 newNode next = head

//         newNode.next = head; //Link

//         //step - 3 head = newNode

//         head = newNode;

//     }

//     public void addLast(int data){
//         Node newNode = new Node(data);
   

//         if(head == null){
//             head = tail = newNode;
//             return;
//         }

//         tail.next = newNode;
//         tail = newNode;

//     }


//     public void print(){
//         if(head == null){
//             System.out.println("LL is empty.");
//             return;
//         }

//         Node temp = head;
//         while(temp!= null){
//             System.out.print(temp.data + "->");
//             temp = temp.next;
//         }
//           System.out.println("null"); 
//     }


//     public void zigzag(){

//         //find mid:

//         Node slow = head;
//         Node fast = head.next;

//         while( fast != null && fast.next != null){

//             slow = slow.next;
//             fast = fast.next.next;

//         }
//         Node mid = slow;

    

//     // reverse second half:

//     Node curr = mid.next;
//     mid.next = null;


//     Node prev = null;
//     Node next = null;


//     while(curr !=null){

//         next = curr.next;
//         curr.next = prev;
//         prev = curr;
//         curr = next;

//     }

//     Node lefthead = head;
//     Node righthead = prev;

//     Node nextL, nextR;

//     //alter merge zig-zag merge:

//     while(lefthead != null && righthead != null){


//         //zigzag
//         nextL = lefthead.next;
//         lefthead.next = righthead;
//         nextR = righthead.next;
//         righthead.next = nextL;

//         // updation

//         righthead = nextR;
//         lefthead = nextL;

        

//     }


//     }


// }



//     public static void main(String[] args) {
        
//         LinkedList ll = new LinkedList();

//         ll.addLast(1);
//         ll.addLast(2);
//         ll.addLast(3);
//         ll.addLast(4);
//         ll.addLast(5);
//         // ll.addLast(6);

//         ll.print();
//         ll.zigzag();
//         ll.print();

//     }
// }





//    Doubly LL:




// public class LinkedList {

//     public class Node {
//         int data;
//         Node next;
//         Node prev;

//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//             this.prev = null;
//         }
//     }

//     public static Node head;
//     public static Node tail;
//     public static int size = 0; // Initialize size to 0



//     public void addFirst(int data) {
//         Node newNode = new Node(data);

//         // Base case: Empty list
//         if (head == null) {
//             head = tail = newNode;
//         } else {
//             newNode.next = head;
//             head.prev = newNode;
//             head = newNode;
//         }

//         size++; // Increment size
//     }

//     public void print() {
//         Node temp = head;

//         while (temp != null) {
//             System.out.print(temp.data + " <-> ");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }




//     public int removeFirst() {
//         // Base case: Empty list
//         if (head == null) {
//             System.out.println("DLL is empty");
//             return Integer.MIN_VALUE;
//         }

//         int val = head.data;

//         // Only one node in the list
//         if (size == 1) {
//             head = tail = null;
//         } else {
//             head = head.next;
//             head.prev = null;
//         }

//         size--; // Decrement size
//         return val;
//     }

//     public void reverse(){

//         Node next;
//         Node curr = head;
//         Node prev = null;

//         while(curr != null){

//             next = curr.next;
//             curr.next = prev;
//             curr.prev = next;

//             prev = curr;
//             curr = next;

//         }
//         head = prev;

//     }

//     public static void main(String[] args) {
//         LinkedList dll = new LinkedList();

//         dll.addFirst(3);
//         dll.addFirst(2);
//         dll.addFirst(1);

//         dll.print();
//         System.out.println("Size: " + dll.size); // Print correct size

//         // dll.removeFirst();
//         // dll.print();
//         // System.out.println("Size: " + dll.size); // Print correct size

//         dll.reverse();
//         dll.print();

//     }
// }






// Intersection of Two LinkedList: