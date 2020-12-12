import java.util.HashMap;

// https://practice.geeksforgeeks.org/problems/intersection-point-in-y-shapped-linked-lists/1/?difficulty[]=1&page=3&query=difficulty[]1page3#
// Execution Time:1.08

// Expected Time Complexity: O(N+M) (Met)
// Expected Auxiliary Space: O(1) (NotMet)

public class App 
{
    public static void main(String[] args) throws Exception
    {
        intersectPoint(null, null);
    }

    public static int intersectPoint(Node head1, Node head2)
	{
        int isIntersection = 0;

        HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();

        while (head1 != null) 
        {
            hashMap.put(head1.hashCode(), 1);
            head1 = head1.next;
        }

        while (head2 != null) 
        {
            if (hashMap.containsKey(head2.hashCode())) 
            {
                isIntersection = head2.data;
                break;
            }
            
            hashMap.put(head2.hashCode(), 1);
            head2 = head2.next;
        }

        return isIntersection;
	}
}

class Node 
{
    int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
 }
