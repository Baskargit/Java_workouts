public class App {
    public static void main(String[] args) throws Exception 
    {
        
    }

    public boolean search(Node root, int x)
    {
        return (root != null) ? (root.data == x) ? true : search(root.left, x) || search(root.right, x) : false;
    }
}

class Node
{
	int data;
	Node left, right;
	Node(int d)
	{
		data = d;
		left = right = null;
	}
}
