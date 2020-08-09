public class App {
    public static void main(String[] args) throws Exception 
    {
        Node head = new Node(1);
        head.next = new Node(2);

        Node node = new Node(3);

        head.next.next = node;
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        deleteNode(node);

        printList(head);
    }

    public static void deleteNode(Node node) 
    {
        if (node != null && node.next != null)
        {
            node.data = node.next.data;
            node.next = node.next.next;  
        }
    }

    public static void printList(Node head)
    {
        while (head != null) 
        {
            System.out.println(head.data);
            head = head.next;
        }

        System.out.println();
    }
}

class Node
{
	int data ;
	Node next;
	Node(int d)
	{
		data = d;
		next = null;
	}
}
