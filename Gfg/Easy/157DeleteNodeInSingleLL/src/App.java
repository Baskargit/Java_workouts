// https://practice.geeksforgeeks.org/problems/delete-a-node-in-single-linked-list/1
// Execution Time:0.59

public class App {
    public static void main(String[] args) throws Exception 
    {
        
    }

    public static Node deleteNode(Node head, int x)
    {
        int counter = -1;

        Node temp = head,prev = null;

        while (temp != null) 
        {
            if (++counter == x) 
            {
                if (x == 0) 
                {
                    return temp.next;    
                }
                else
                {
                    prev.next = temp.next;
                    break;
                }
            }

            prev = temp;
            temp = temp.next;
        }
        
        return head;
    }
}

class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}
