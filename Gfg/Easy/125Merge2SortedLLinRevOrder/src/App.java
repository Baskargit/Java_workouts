import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// https://practice.geeksforgeeks.org/problems/merge-2-sorted-linked-list-in-reverse-order/1/
// Execution Time:0.75

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        
    }

    public static Node mergeResult(Node node1, Node node2)
    {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        while (node1 != null || node2 != null) 
        {
            if (node1 != null) {
                arrayList.add(node1.data);
            }

            if (node2 != null) {
                arrayList.add(node2.data);
            }
            
            node1 = (node1 != null) ? node1.next : null;
            node2 = (node2 != null) ? node2.next : null;
        }

        Collections.sort(arrayList,Comparator.reverseOrder());
        
        Node finalList = null;
        Node head = null;

        for (Integer integer : arrayList) 
        {
            if (finalList != null) 
            {
                finalList.next = new Node(integer);
                finalList = finalList.next;
            }
            else
            {
                finalList = new Node(integer);
                head = finalList;
            }
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