// non-recursive java program for inorder traversal 
import java.util.Stack; 
  
/* Class containing left and right child of 
current node and key value*/
class Node 
{ 
    int data; 
    Node left, right; 
  
    public Node(int item) 
    { 
        data = item; 
        left = right = null; 
    } 
} 
  
/* Class to print the inorder traversal */
class BinaryTree
{ 
    Node root; 
    void inorder() 
    { 
        if (root == null) 
            return; 
  
  
        Stack<Node> st = new Stack<Node>(); 
        Node curr = root; 
        while(curr!=null && st.size()>0)
        {
            while(curr!=null){
                st.push(curr);
                curr = curr.left;
            } 
            Node temp = st.pop();
            System.out.println(temp.data+" ");
            st.push(temp.right);
        }
  
       
    } 
  
    public static void main(String args[]) 
    { 
  
        /* creating a binary tree and entering 
        the nodes */
        BinaryTree tree = new BinaryTree(); 
        tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
        tree.inorder(); 
    } 
} 