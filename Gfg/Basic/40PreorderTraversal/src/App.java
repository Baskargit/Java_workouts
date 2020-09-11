import java.util.ArrayList;

// https://practice.geeksforgeeks.org/problems/preorder-traversal/1
// Execution Time:2.55

public class App {
    public static void main(String[] args) throws Exception 
    {
        
    }

    public static ArrayList<Integer> preorder(Node root)
    {
        ArrayList<Integer> output = new ArrayList<Integer>();
        PreOrderTraversal(root, output);
        return output;
    }

    public static void PreOrderTraversal(Node root,ArrayList<Integer> output)
    {
        if (root == null) {
            return;
        }

        output.add(root.data);
        PreOrderTraversal(root.left, output);
        PreOrderTraversal(root.right, output);
    }
}

class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
