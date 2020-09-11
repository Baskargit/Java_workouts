// https://practice.geeksforgeeks.org/problems/sum-of-binary-tree/1
// Execution Time:0.51

public class App {
    public static void main(String[] args) throws Exception 
    {
        
    }

    public static int sumBT(Node head)
    {
        return (head == null) ? 0 : head.data + sumBT(head.left) + sumBT(head.right);
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
