// https://practice.geeksforgeeks.org/problems/pairwise-swap-elements-of-a-linked-list-by-swapping-data/1/
// Execution Time:1.82

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        
    }

    public Node pairwiseSwap(Node head)
    {
        int counter = 0;
        Node previous = null,pointer = head;

        while (head != null) 
        {
            if (++counter == 1) 
            {
                previous = head;
            }
            else
            {
                int temp = head.data;
                head.data = previous.data;
                previous.data = temp;

                counter = 0;
            }

            head = head.next;   
        }

        return pointer;
    }
}

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}
