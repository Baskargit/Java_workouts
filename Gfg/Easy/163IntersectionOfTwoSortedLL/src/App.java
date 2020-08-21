import java.util.ArrayList;
import java.util.HashSet;

// https://practice.geeksforgeeks.org/problems/intersection-of-two-sorted-linked-lists/1
// Execution Time:1.39

public class App {
    public static void main(String[] args) throws Exception 
    {
        
    }

    public static Node findIntersection(Node head1, Node head2)
    {
        Node finalList = null,finaListCurrent = null;

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        HashSet<Integer> hashSet = new HashSet<Integer>();

        while (head1 != null) 
        {
            arrayList.add(head1.data);  
            head1 = head1.next;
        }

        while (head2 != null) 
        {
            if (arrayList.contains(head2.data) && !hashSet.contains(head2.data)) 
            {
                if (finalList == null) 
                {
                    finalList = new Node(head2.data);
                    finaListCurrent = finalList;    
                } else 
                {
                    finaListCurrent.next = new Node(head2.data);
                    finaListCurrent = finaListCurrent.next;    
                } 
                
                hashSet.add(head2.data);
            }

            head2 = head2.next;
        }
        
        return finalList;
    }
}

class Node {
    int data;
     Node next;
     Node(int d)  { data = d;  next = null; }
 }
