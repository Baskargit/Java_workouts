public class App 
{
    // https://practice.geeksforgeeks.org/problems/linked-list-in-zig-zag-fashion/1
    // Execution Time:3.09

    public static void main(String[] args) throws Exception
    {
        
    }

    public static Node zigZag(Node head)
    {
        if (head != null && head.next != null)
        {
            if (head.data > head.next.data) 
            {
                int temp = head.data;
                head.data = head.next.data;
                head.next.data = temp;
            }
        }

        int counter = 0;
        Node node = head,prev = null;

        while (node != null) 
        {
            if (++counter % 2 == 0) 
            {
                if (node.next != null) 
                {
                    if (node.data < prev.data) 
                    {
                        int temp = node.data;
                        node.data = prev.data;
                        prev.data = temp;
                    }

                    if (node.data < node.next.data) 
                    {
                        int temp = node.data;
                        node.data = node.next.data;
                        node.next.data = temp;
                    }
                }
                else
                {
                    if (node.data < prev.data) 
                    {
                        int temp = node.data;
                        node.data = prev.data;
                        prev.data = temp;
                    }
                }
                
                counter = 0;
            }
            
            prev = node;
            node = node.next;
        }

        return head;
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
