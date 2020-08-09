import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

// https://practice.geeksforgeeks.org/problems/intersection-of-two-linked-list/1/
// Execution Time:2.89

public class App {
    public static void main(String[] args) throws Exception 
    {
        
    }

    public static Node findIntersection(Node head1, Node head2)
    {
        Node finalList = null;
        
        HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();
        TreeMap<Integer,Integer> treeMap = new TreeMap<Integer,Integer>();

        int pos = 1;
        while (head1 != null) 
        {  
            hashMap.put(head1.data, pos);
            head1 = head1.next; 
            pos++;
        }

        while (head2 != null) 
        {
            if (hashMap.containsKey(head2.data) && !treeMap.containsValue(head2.data)) 
            {
                treeMap.put(hashMap.get(head2.data), head2.data);
            }

            head2 = head2.next;
        }

        Node pointer = null;
        for (Map.Entry<Integer,Integer> entry : treeMap.entrySet()) 
        {
            if (finalList == null) 
            {
                pointer = finalList = new Node(entry.getValue());
            }
            else
            {
                pointer.next = new Node(entry.getValue());
                pointer = pointer.next;
            }
        }

        return finalList;
    }
}

class Node 
{
    int data;
    Node next;
    
    Node(int a)
        {
            data = a;
            next = null;
        }
}
