import java.util.ArrayList;
import java.util.Collections;

// https://practice.geeksforgeeks.org/problems/absolute-list-sorting/1
// Execution Time:0.46

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        // Functional problem
    }

    public static Node sortedList(Node head)
	{
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        Node iterator = head;

        while (iterator != null) 
        {
            arrayList.add(iterator.data);
            iterator = iterator.next;   
        }

        Collections.sort(arrayList);

        Node finalNode = iterator = null;

        for (Integer integer : arrayList) 
        {
            if (finalNode == null) 
            {
                finalNode = new Node(integer);
                iterator = finalNode;
            }
            else
            {
                iterator.next = new Node(integer);
                iterator = iterator.next;
            }
        }
        
        return finalNode;
	}
}

class Node
{
   int data;
   Node next;
   Node(int d) {data = d; next = null; }
 }
