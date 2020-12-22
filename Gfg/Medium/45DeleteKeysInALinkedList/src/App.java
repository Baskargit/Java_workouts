// https://practice.geeksforgeeks.org/problems/delete-keys-in-a-linked-list/1/?difficulty[]=1&page=3&query=difficulty[]1page3#
// Execution Time:0.60

// Expected Time Complexity : O(n) met
// Expected Auxilliary Space : O(1) met

public class App 
{
    public static void main(String[] args) throws Exception
    {
        int x = 2;
        Node head = new Node(2);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next= new Node(2);
        head.next.next.next.next = new Node(2);
        head.next.next.next.next.next = new Node(2);
        head.next.next.next.next.next.next = new Node(2);

        Node result = deleteAllOccurances(head,x);

        while(result != null)
        {
            System.out.print(result.data + " ");
            result = result.next;
        }
    }

    public static Node deleteAllOccurances(Node head, int x)
    {
        Node temp = head,finalLLHead = null,finalLL = null;

        while (temp != null)
        {
            if (temp.data != x) 
            {
                if (finalLL != null) 
                {
                    finalLL.next = temp;
                    finalLL = (finalLL.next != null) ? finalLL.next : finalLL;
                }
                else
                {
                    finalLL = temp;
                    finalLLHead = finalLL;
                }
            }

            temp = temp.next;
        }

        if (finalLL != null) 
        {
            finalLL.next = null;
        }

        return finalLLHead;
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

