package trees;

//   V-1                                       Daimeter of a tree (approach 1):

// import org.w3c.dom.Node;

// import org.w3c.dom.Node;

// public class tree2 {
    

   
//         static class Node{
//             int data;
//             Node left;
//             Node right;

//             Node(int data){
//                 this.data = data;
//                 this.left=null;
//                 this.right=null;
//             }
//         } 
//            public static int height(Node root){
//             if(root == null){
//                 return 0;
//             }
//              int lh = height(root.left);
//              int rh = height(root.right);
//              return Math.max(lh, rh) + 1;
//         }

//         public static int count(Node root){
//             if(root == null){
//                 return 0;
//             }

//             int leftCount = count(root.left);
//             int rightCount = count(root.right);
//             return leftCount + rightCount + 1;
//         }
//         public static int diameter(Node root){
//             if(root==null){
//                 return 0;
//             }
//             int ldiam = diameter(root.left);
//             int rdiam = diameter(root.right);
//             int lh = height(root.left);
//             int rh = height(root.right);
//             int selfdiam = lh+rh+1;
//             return Math.max(selfdiam, Math.max(ldiam,rdiam));
           
//         }
        
//         public static void main(String args[]){

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

//             System.out.println(diameter(root));


//         }

//     }
    




// V-2                                 Daimeter of tree (APPROACH-2) :                                 




// public class tree2 {
    

   
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
//     // public static int diameter2(Node root){
//     //     if(root==null){
//     //         return 0;
//     //     }
//     //     int ldiam = diameter(root.left);
//     //     int rdiam = diameter(root.right);
//     //     int lh = height(root.left);
//     //     int rh = height(root.right);
//     //     int selfdiam = lh+rh+1;
//     //     return Math.max(selfdiam, Math.max(ldiam,rdiam));
       
//     // }

//     static class Info{
//         int diam;
//         int ht;

//         public Info(int diam, int ht) {
//             this.diam = diam;
//             this.ht = ht;
//         }

//     }
//      public static Info diameter(Node root){
//         if(root==null){
//             return new Info(0,0);
//         }
//         Info leftInfo = diameter(root.left);
//         Info rightInfo = diameter(root.right);

//         int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam),leftInfo.ht + rightInfo.ht + 1);
//         int ht = Math.max(leftInfo.ht,rightInfo.ht) + 1;
        
//         return new Info(diam,ht);


//      }
    
//     public static void main(String args[]){

// /* 
//                 1
//               /  \
//              2    3
//             / \  / \
//            4   5 6  7    
// */
//     Node root = new Node(1);
//     root.left = new Node(2);
//     root.right = new Node(3);
//     root.left.left = new Node(4);
//     root.left.right = new Node(5);
//     root.right.left = new Node(6);
//     root.right.right = new Node(7);

//         System.out.println(diameter (root).diam);


//     }

// }





// V-3                                    Subtree of another tree:






