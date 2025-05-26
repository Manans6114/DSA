package trees;

// V-5                       BUILD TREE PREORDER CODE:         

// public class tree1 {

//     //class of NODE
//     static class Node{
//         int data;
//         Node left;
//         Node right;

//         Node(int data){
//             this.data = data;
//             this.left=null;
//             this.right=null;
//         }
//     }

//     //  class of Binry tree


//       static class BinaryTree{
//         static int idx = -1;
//         public static Node buildtree(int nodes[]){
//             idx++;
//             if(nodes[idx] == -1){
//                 return null;
//             }
//             Node newNode = new Node(nodes[idx]);
//             newNode.left = buildtree(nodes);
//             newNode.right = buildtree(nodes);

//             return newNode;

//         }
//       }
//     public static void main(String args[]){
//         int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
//             BinaryTree tree = new BinaryTree();  
//             Node root = tree.buildtree(nodes);
//             System.out.println(root.data);
//     }

// }

// V-6                       Pre order Traversal:

public class tree1 {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left=null;
            this.right=null;
        }
    }
      static class BinaryTree{
        static int idx = -1;
        public static Node buildtree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildtree(nodes);
            newNode.right = buildtree(nodes);

            return newNode;

        }
         public static void preorder(Node root){    //preorder
            if (root == null){
                return ;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
         }
      }
    public static void main(String args[]){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
            BinaryTree tree = new BinaryTree();  
            Node root = tree.buildtree(nodes);

            tree.preorder(root);
    }

}

//                      printing -1 together:

// public class tree1 {
//     static class Node{
//         int data;
//         Node left;
//         Node right;

//         Node(int data){
//             this.data = data;
//             this.left=null;
//             this.right=null;
//         }
//     }
//       static class BinaryTree{
//         static int idx = -1;
//         public static Node buildtree(int nodes[]){
//             idx++;
//             if(nodes[idx] == -1){
//                 return null;
//             }
//             Node newNode = new Node(nodes[idx]);
//             newNode.left = buildtree(nodes);
//             newNode.right = buildtree(nodes);

//             return newNode;

//         }
//          public static void preorder(Node root){   // O(n)             //preorder
//             if (root == null){
//                 System.out.print( -1 + " ");
//                 return;
//             }
//             System.out.print(root.data+" ");  // printing root
//             preorder(root.left);
//             preorder(root.right);
//          }
//       }
//     public static void main(String args[]){
//         int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
//             BinaryTree tree = new BinaryTree();  
//             Node root = tree.buildtree(nodes);

//             tree.preorder(root);
//     }

// }

// V-7                  INORDER TRAVERSAL:

// public class tree1 {
//     static class Node{
//         int data;
//         Node left;
//         Node right;

//         Node(int data){
//             this.data = data;
//             this.left=null;
//             this.right=null;
//         }
//     }
//       static class BinaryTree{
//         static int idx = -1;
//         public static Node buildtree(int nodes[]){
//             idx++;
//             if(nodes[idx] == -1){
//                 return null;
//             }
//             Node newNode = new Node(nodes[idx]);
//             newNode.left = buildtree(nodes);
//             newNode.right = buildtree(nodes);

//             return newNode;

//         }
//          public static void preorder(Node root){    //preorder
//             if (root == null){
//                 return;
//             }
//             System.out.print(root.data+" ");
//             preorder(root.left);
//             preorder(root.right);
//          }
//          public static void inorder(Node root){
//             if(root == null){
//                 // System.out.print( -1 + " ");
//                 return;
//             }
//             inorder(root.left);
//             System.out.print(root.data+" ");
//             inorder(root.right);
//          }
//       }
//     public static void main(String args[]){
//         int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
//             BinaryTree tree = new BinaryTree();  
//             Node root = tree.buildtree(nodes);
//             tree.inorder(root);
//     }

// }

// V-8                  POSTORDER TRAVERSAL:    

// public class tree1 {
//     static class Node{
//         int data;
//         Node left;
//         Node right;

//         Node(int data){
//             this.data = data;
//             this.left=null;
//             this.right=null;
//         }
//     }
//       static class BinaryTree{
//         static int idx = -1;
//         public static Node buildtree(int nodes[]){
//             idx++;
//             if(nodes[idx] == -1){
//                 return null;
//             }
//             Node newNode = new Node(nodes[idx]);
//             newNode.left = buildtree(nodes);
//             newNode.right = buildtree(nodes);

//             return newNode;

//         }
//          public static void postorder(Node root){    //postorder
//             if (root == null){
//                 return;
//             }
//             postorder(root.left);
//             postorder(root.right);
//             System.out.print(root.data+" ");

//          }
//       }
//     public static void main(String args[]){
//         int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
//             BinaryTree tree = new BinaryTree();  
//             Node root = tree.buildtree(nodes);

//             tree.postorder(root);
//     }

// }







//V-9               LEVEL ORDER TRAVERSAL:
   


// import java.util.*;              //as we created a queue

// public class tree1 {
//     static class Node {
//         int data;
//         Node left;
//         Node right;

//         Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     static class BinaryTree {
//         static int idx = -1;

//         public static Node buildtree(int nodes[]) {
//             idx++;
//             if (nodes[idx] == -1) {
//                 return null;
//             }
//             Node newNode = new Node(nodes[idx]);
//             newNode.left = buildtree(nodes);
//             newNode.right = buildtree(nodes);

//             return newNode;

//         }

//         public static void levelorder(Node root) {
//             if (root == null) {
//                 return;
//             }
//             Queue<Node> q = new LinkedList<>();
//             q.add(root);
//             q.add(null);

//             while (!q.isEmpty()) {
//                 Node currNode = q.remove();
//                 if (currNode == null) {

//                     System.out.println();

//                     if (q.isEmpty()) {
//                         break;
//                     } else {
//                         q.add(null);
//                     }
//                 } else {
//                     System.out.print(currNode.data + " ");
//                     if (currNode.left != null) {
//                         q.add(currNode.left);
//                     }

//                     if (currNode.right != null) {
//                         q.add(currNode.right);
//                     }
//                 }
//             }
//         }
//     }

//     public static void main(String args[]) {
//         int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
//         BinaryTree tree = new BinaryTree();
//         Node root = tree.buildtree(nodes);

//         tree.levelorder(root);
//     }

// }




//V-10                HEIGHT OF A TREE:




// public class tree1 {
//     static class Node{
//         int data;
//         Node left;
//         Node right;

//         Node(int data){
//             this.data = data;
//             this.left=null;
//             this.right=null;
//         }
//     } 
//        public static int height(Node root){
//         if(root == null){
//             return 0;
//         }
//          int lh = height(root.left);
//          int rh = height(root.right);
//          return Math.max(lh, rh) + 1;
//     }
    
//     public static void main(String args[]){

// /* 
//                     1
//                   /  \
//                  2    3
//                 / \  / \
//                4   5 6  7    

// */
//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.right = new Node(3);
//         root.left.left = new Node(4);
//         root.left.right = new Node(5);
//         root.right.left = new Node(6);
//         root.right.right = new Node(7);

//         System.out.println(height(root));
  
//     }

// }




//V-11                          COUNT NUMBER OF NODES:





    // public class tree1 {
    //     static class Node{
    //         int data;
    //         Node left;
    //         Node right;

    //         Node(int data){
    //             this.data = data;
    //             this.left=null;
    //             this.right=null;
    //         }
    //     } 
    //        public static int height(Node root){
    //         if(root == null){
    //             return 0;
    //         }
    //          int lh = height(root.left);
    //          int rh = height(root.right);
    //          return Math.max(lh, rh) + 1;
    //     }

    //     public static int count(Node root){
    //         if(root == null){
    //             return 0;
    //         }

    //         int leftCount = count(root.left);
    //         int rightCount = count(root.right);
    //         return leftCount + rightCount + 1;
    //     }
        
    //     public static void main(String args[]){

    // /* 
    //                     1
    //                   /  \
    //                  2    3
    //                 / \  / \
    //                4   5 6  7    

    // */
    //         Node root = new Node(1);
    //         root.left = new Node(2);
    //         root.right = new Node(3);
    //         root.left.left = new Node(4);
    //         root.left.right = new Node(5);
    //         root.right.left = new Node(6);
    //         // root.right.right = new Node(7);

    //         System.out.println(count(root));
    
    //     }

    // }




// V- 12                    SUM OF NODES:





// public class tree1 {
//     static class Node{
//         int data;
//         Node left;
//         Node right;

//         Node(int data){
//             this.data = data;
//             this.left=null;
//             this.right=null;
//         }
//     } 
//       public static int sum(Node root){
//         if(root == null){
//             return 0;
//         }

//         int leftsum = sum(root.left);
//         int rightsum = sum(root.right);
//         return leftsum + rightsum + root.data;
//       }
//     public static void main(String args[]){

// /* 
//                     1
//                   /  \
//                  2    3
//                 / \  / \
//                4   5 6  7    

// */
//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.right = new Node(3);
//         root.left.left = new Node(4);
//         root.left.right = new Node(5);
//         root.right.left = new Node(6);
//         root.right.right = new Node(7);

//         System.out.println(sum(root));
  
//     }

// }