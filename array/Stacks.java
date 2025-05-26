


//                 sTACKS USING ARRAYLIST:


// import java.util.ArrayList;

// public class Stacks {

//     static class stack {

//         static ArrayList<Integer> list = new ArrayList<>();

//         // Empty Stack:
//         public static boolean isEmpty() {
//             return list.size() == 0;
//         }

//         // Push:
//         public static void push(int data) {
//             list.add(data);
//         }

//         // Pop:
//         public static int pop() {

//             if(isEmpty()){
//                 return -1;
//             }


//             int top = list.get(list.size() - 1);
//             list.remove(list.size() - 1);
//             return top;
//         }

//         // Peek:
//         public static int peek() {

//             if(isEmpty()){
//                 return -1;
//             }

//             return list.get(list.size() - 1);
//         }
//     }

//     public static void main(String[] args) {
//         stack s = new stack(); 
    
//         s.push(1);
//         s.push(2);
//         s.push(3);

//         while(!s.isEmpty()){
    
//         System.out.println("Top element before pop: " + s.peek());  // ✅ Print top element
//         System.out.println("Popped element: " + s.pop());           // ✅ Print popped element
//         System.out.println("Top element after pop: " + s.peek());   // ✅ Print top element after pop

//         // System.out.println(s.peek());
//         // s.pop();


//     }
//   }
// }
    



//     sTACKS USING LINKEDLIST: (Important)





// public class Stacks {

//     static class Node {
//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     static class stack {
//         static Node head = null;

//         // isEmpty:
//         public static boolean isEmpty() {
//             return head == null;
//         }

//         // Push:
        // public static void push(int data) {
        //     Node newNode = new Node(data);
        //     if (isEmpty()) {
        //         head = newNode;
        //         return;
        //     }
        //     newNode.next = head;
        //     head = newNode;
        // }

//         // Pop:
//         public static int pop() {
//             if (isEmpty()) {
//                 return -1;
//             }
//             int top = head.data;
//             head = head.next; // Remove the top node
//             return top;
//         }


//         //peek:

//         public static int peek(){
//             if(isEmpty()){
//                 return -1;
//             }

//             return head.data;

//         }
//     }

//     public static void main(String[] args) {
//         stack s = new stack();

//         s.push(1);
//         s.push(2);
//         s.push(3);

//         while(!s.isEmpty()){

        
//         System.out.println(s.peek()); 
//         System.out.println(s.pop()); // Should print 3
//         System.out.println(s.pop()); // Should print 3


//         }
//     }
// }




// Stacks using Java Collections Frameworks:




// import java.util.*;

// public class Stacks {


//     public static void main(String[] args) {
//         // stack s = new stack();

//         Stack<Integer> s = new Stack<>(); 

//         s.push(1);
//         s.push(2);
//         s.push(3);

//         while(!s.isEmpty()){

        
//         System.out.println(s.peek()); 
//         System.out.println(s.pop()); // Should print 3
//         // System.out.println(s.pop()); // Should print 3


//         }
//     }
// }





//           push at bottom of stack:   important :





