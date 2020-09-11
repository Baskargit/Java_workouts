// https://practice.geeksforgeeks.org/problems/minimum-element-in-bst/1
// Execution Time:0.41

public class App {
    public static void main(String[] args) throws Exception 
    {
        System.out.println("Hello, World!");
    }

    public int minValue(Node node)
    {
        return (node != null) ? Math.min(Math.min(minValue(node.left), minValue(node.right)), node.data) : Integer.MAX_VALUE;
    }
}

class Node
{
	int data;
	Node left,right;
	
	Node(int d)
	{
		data = d;
		left = right = null;		
	}
}
