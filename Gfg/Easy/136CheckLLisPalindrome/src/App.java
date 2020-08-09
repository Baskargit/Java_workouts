
// https://practice.geeksforgeeks.org/problems/check-if-linked-list-is-pallindrome/1/
// Execution Time:1.07

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
    }

    public static boolean isPalindrome(Node head) 
    {
        StringBuilder stringBuilder = new StringBuilder();

        while (head != null) 
        {
            stringBuilder.append(head.data);
            head = head.next;
        }

        return stringBuilder.toString().equals(stringBuilder.reverse().toString()); 
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

/**
Input:
11
4 5 2 5 2 5 4 4 4 1 1

Its Correct output is:
0

And Your Code's output is:
1
 */
