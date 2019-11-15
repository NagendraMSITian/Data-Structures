import java.util.*;

/*Given a Binary Tree, print Left view of it. 
Left view of a Binary Tree is set of nodes visible when tree is visited from Left side.
*/

public class LeftViewOfBT
{
    int max=0;
    void leftView(Node root)
    {
      // Your code here
      int max=0;
      if(root == null) return;
      leftView(root,1);
    }
    void leftView(Node root,int i)
    {
        if(max<i)
        {
            System.out.print(root.data+" ");
            max=i;
        }
        if(root.left!=null) leftView(root.left,i+1);
        if(root.right !=null) leftView(root.right,i+1);
    }
}