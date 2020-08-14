import java.util.ArrayList;

// https://practice.geeksforgeeks.org/problems/modify-linked-list-1/1
// Unsolved {Input reversed}

public class App {
    public static void main(String[] args) throws Exception 
    {
        // Node head = new Node(10);
        // head.next = new Node(4);
        // head.next.next = new Node(5);
        // head.next.next.next = new Node(3);
        // head.next.next.next.next = new Node(6);

        Node head = new Node(2);
        head.next = new Node(9);
        head.next.next = new Node(8);
        head.next.next.next = new Node(12);
        head.next.next.next.next = new Node(7);
        head.next.next.next.next.next = new Node(10);

        head = modify(head);
        show(head);
    }

    public static Node modify(Node head)
    {
        Node temp = head;

        ArrayList<Node> arrayList = new ArrayList<Node>();

        while (temp != null) 
        {
            arrayList.add(temp);
            temp = temp.next;    
        }

        int n = arrayList.size();

        if (n > 1) 
        {
            int mid = n / 2;

            for (int i = 0; i < mid; i++) 
            {
                Node currentNode = arrayList.get(i);
                Node matchNode = arrayList.get(n - 1 - i);

                int num = currentNode.data;

                currentNode.data = matchNode.data - num;
                matchNode.data = num;
            }
        }

        arrayList.clear();
        return head;
    }

    public static void show(Node head) 
    {
        while (head != null) 
        {
            System.out.print(head.data + " ");
            head = head.next;
        }

        System.out.println();
    }
}

class Node {
    int data;
    Node next;
    
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
