import java.util.ArrayList;

// https://practice.geeksforgeeks.org/problems/postorder-traversal/1
// Execution Time:0.38

public class App {
    public static void main(String[] args) throws Exception 
    {
        
    }

    public static ArrayList<Integer> postOrder(Node root)
    {
        ArrayList<Integer> output = new ArrayList<Integer>();
        PostOrderTraversal(root, output);
        return output;
    }

    public static void PostOrderTraversal(Node root,ArrayList<Integer> output)
    {
        if (root == null) {
            return;
        }

        PostOrderTraversal(root.left, output);
        PostOrderTraversal(root.right, output);
        output.add(root.data);
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
