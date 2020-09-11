import java.util.ArrayList;

// https://practice.geeksforgeeks.org/problems/inorder-traversal/1
// Execution Time:0.34

public class App {
    public static void main(String[] args) throws Exception 
    {
        
    }

    public static ArrayList<Integer> inOrder(Node root)
    {
        ArrayList<Integer> output = new ArrayList<Integer>();
        InOrderTraversal(root, output);
        return output;
    }

    public static void InOrderTraversal(Node root,ArrayList<Integer> output)
    {
        if (root == null) 
        {
            return;
        }

        InOrderTraversal(root.left, output);
        output.add(root.data);
        InOrderTraversal(root.right, output);
    }
}

class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
}
