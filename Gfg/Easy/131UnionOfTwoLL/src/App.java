import java.util.TreeSet;

// https://practice.geeksforgeeks.org/problems/union-of-two-linked-list/1
// Execution Time:1.68

public class App {
    public static void main(String[] args) throws Exception 
    {
        // Functional problem
    }

    public static Node findUnion(Node head1,Node head2)
	{
        Node finalList = null;
        
        TreeSet<Integer> treeSet = new TreeSet<Integer>();

        while (head1 != null) {  treeSet.add(head1.data); head1 = head1.next; }
        while (head2 != null) {  treeSet.add(head2.data); head2 = head2.next; }

        Node pointer = null;
        for (Integer integer : treeSet) 
        {
            if (finalList == null) 
            {
                pointer = finalList = new Node(integer);
            }
            else
            {
                pointer.next = new Node(integer);
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
    Node(int d) {data = d; next = null; }
}
