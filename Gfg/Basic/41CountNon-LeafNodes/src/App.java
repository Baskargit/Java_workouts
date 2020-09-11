// https://practice.geeksforgeeks.org/problems/count-non-leaf-nodes-in-tree/1/
// Execution Time:0.35

public class App {
    public static void main(String[] args) throws Exception 
    {
        
    }

    public int countNonLeafNodes(Node root)
	{
        return (root == null || (root.left == null && root.right == null))
        ? 0
        : 1 + countNonLeafNodes(root.left) + countNonLeafNodes(root.right);
	}
}

class Node
{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
