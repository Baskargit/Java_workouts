// https://practice.geeksforgeeks.org/problems/subtraction-in-linked-list/1
// TLE
public class App {
    public static void main(String[] args) throws Exception 
    {
        
    }

    public static Node subLinkedList(Node l1, Node l2)
    {
        Node finalList = null,finalListCurrent = null;

        StringBuilder num1 = new StringBuilder();
        StringBuilder num2 = new StringBuilder();

        while (l1 != null) 
        {
            num1.append(l1.data);
            l1 = l1.next;    
        }

        while (l2 != null) 
        {
            num2.append(l2.data);
            l2 = l2.next;    
        }

        char diff[] = new java.math.BigInteger(num1.toString()).subtract(new java.math.BigInteger(num2.toString())).abs().toString().toCharArray();

        for (int i = 0; i < diff.length; i++) 
        {
            if (finalList == null) 
            {
                finalList = new Node(diff[i] - '0');
                finalListCurrent = finalList;    
            }
            else
            {
                finalListCurrent.next = new Node(diff[i] - '0');
                finalListCurrent = finalListCurrent.next;
            }
        }

        return finalList;
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
