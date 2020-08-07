
// https://practice.geeksforgeeks.org/problems/reverse-a-doubly-linked-list/1
// Execution Time:0.46

public class App {
    public static void main(String[] args) throws Exception 
    {
        
    }

    public static Node reverseDLL(Node head)
    {
        Node node = head;

        while (node != null) 
        {
            Node temp = node.next;

            if (temp == null) {
                head = node;
            }

            node.next = node.prev;
            node.prev = temp;

            node = temp;
        }

        return head;
    }
}

class Node
{
    int data;
    Node next, prev;
    Node(int data)
    {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
