import java.util.HashSet;

// https://practice.geeksforgeeks.org/problems/remove-duplicates-from-an-unsorted-linked-list/1
// Execution Time:1.91

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        
    }

    public Node removeDuplicates(Node head) 
    {
        HashSet<Integer> hashSet = new HashSet<Integer>();

        Node noDup = null,pointer = null;

        while (head != null) 
        {
            if (!hashSet.contains(head.data)) 
            {
                hashSet.add(head.data);

                if (pointer == null) 
                {
                    pointer = new Node(head.data);
                    noDup = pointer;
                }
                else
                {
                    pointer.next = new Node(head.data);
                    pointer = pointer.next;
                }
            }

            head = head.next;
        }

        return noDup;
    }
}

class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d; 
        next = null;
    }
}