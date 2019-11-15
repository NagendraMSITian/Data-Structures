import java.util.TreeMap; 
import java.util.Vector; 
import java.util.Map.Entry; 
class Tree
{
	private static class Node 
    { 
        int key; 
        Node left; 
        Node right; 
          
        // Constructor 
        Node(int data) 
        { 
            key = data; 
            left = null; 
            right = null; 
        } 
    }
    // Should print bottom view of tree with given root
    public static void printVerticalOrder(Node root)
    {
        // Your code here
        TreeMap<Integer,Vector<Integer>> treeMap = new TreeMap<Integer,Vector<Integer>>();
        verticalTraverse(root,treeMap,0);

        //print treemap
        for(Entry<Integer,Vector<Integer>> entry : treeMap.entrySet())
        {
        	System.out.println(entry.getValue());
        }
    }

    public static void verticalTraverse(Node root,TreeMap<Integer,Vector<Integer>> treeMap, int hd)
    {
    	if(root == null) return;

    	Vector<Integer> vector = treeMap.get(hd);
    	if(vector==null)
    	{
    		vector = new Vector<Integer>();
    		vector.add(root.key);
    	}
    	else
    	{
    		vector.add(root.key);
    	}
    	treeMap.put(hd,vector);

    	verticalTraverse(root.left,treeMap,hd-1);
    	verticalTraverse(root.right,treeMap, hd+1);
    }

    public static void main(String[] args) { 
  
        // TO DO Auto-generated method stub 
        Node root = new Node(1); 
        root.left = new Node(2); 
        root.right = new Node(3); 
        root.left.left = new Node(4); 
        root.left.right = new Node(5); 
        root.right.left = new Node(6); 
        root.right.right = new Node(7); 
        root.right.left.right = new Node(8); 
        root.right.right.right = new Node(9); 
        System.out.println("Vertical Order traversal is"); 
        printVerticalOrder(root); 
    } 
}