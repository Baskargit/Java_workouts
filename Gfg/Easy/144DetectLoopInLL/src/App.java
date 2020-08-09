
// https://practice.geeksforgeeks.org/problems/detect-loop-in-linked-list/1
// Execution Time:1.64

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        Node head = new Node(1);
        head.next = new Node(2);
        //head.next.next = head;
        head.next.next = new Node(3);
        System.out.println(detectLoop(head));
    }

    public static boolean detectLoop(Node head)
    {
        boolean isLoopFound = false;
        
        if (head != null) 
        {
            Node hare = head,tortoise = head;

            // Floyd's (or) two-pointer (or) tortoise and hare algorithm
            while (hare != null && tortoise != null && hare.next != null) 
            {
                tortoise = tortoise.next;
                hare = hare.next.next;
                
                if (hare == tortoise) 
                {
                    isLoopFound = true;
                    break;   
                }
            }
        }

        return isLoopFound;
    }
}

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
