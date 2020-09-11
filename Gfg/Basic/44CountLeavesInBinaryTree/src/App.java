// https://practice.geeksforgeeks.org/problems/count-leaves-in-binary-tree/1
// Execution Time:0.44

public class App {
    public static void main(String[] args) throws Exception 
    {
        
    }

    public int countLeaves(Node node) 
    {
        return (node != null)
            ? (node.left == null && node.right == null) ? 1 : countLeaves(node.left) + countLeaves(node.right)
            : 0;
    }
}


class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
