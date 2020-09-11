// https://practice.geeksforgeeks.org/problems/height-of-binary-tree/1/

public class App {
    public static void main(String[] args) throws Exception 
    {
        
    }

    // ==================> Solution 3 <=================================
    // Execution Time:0.33
    public int height(Node root) 
    {
        return (root != null) ? 1 + Math.max(height(root.left),height(root.right)) : 0;
    }

    // ==================> Solution 2 <=================================
    // Execution Time:0.28
    // public int height(Node root) 
    // {
    //     if (root == null) {
    //         return 0;
    //     }

    //     return 1 + Math.max(height(root.left),height(root.right));
    // }

    // ==================> Solution 1 <=================================
    // Execution Time:0.28
    // public int height(Node root) 
    // {
    //     return (root == null) ? 0 : Height(root) + 1;
    // }

    // public static int Height(Node root)
    // {
    //     if (root == null) {
    //         return 0;
    //     }

    //     int leftHeight = (root.left != null) ? 1 + Height(root.left) : 0;
    //     int rightHeight = (root.right != null) ? 1 + Height(root.right) : 0;

    //     return (leftHeight > rightHeight) ? leftHeight : rightHeight;
    // }
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