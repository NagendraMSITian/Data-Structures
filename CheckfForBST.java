CheckfForBST
{
    Stack<Integer> st = new Stack<Integer>();
    int isBST(Node root)  
    {
        validateBST(root);
        if(st.isEmpty()) return 1;
        int max=st.pop();   
        while(!st.isEmpty())
        {
            int x = st.pop();
            if(x>max) return 0;
            max =x;
        }
        return 1;
    }
    void validateBST(Node root)
    {
        if(root == null) return;
        validateBST(root.left);
        st.push(root.data);
        validateBST(root.right);
    }
}
