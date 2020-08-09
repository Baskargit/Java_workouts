import java.util.ArrayList;
import java.util.Collections;

// https://practice.geeksforgeeks.org/problems/linked-list-that-is-sorted-alternatingly/1/
// Execution Time:0.8

public class App {
    public static void main(String[] args) throws Exception 
    {
        Node node = new Node(1);
        node.next = new Node(9);
        node.next.next = new Node(2);
        node.next.next.next = new Node(8);
        node.next.next.next.next = new Node(3);
        node.next.next.next.next.next = new Node(7);

        // Wrong test cases in dataset for the below call method 
        sort(node);
    }

    // Submitted method
    public static Node sort1(Node head)
    {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        Node temp = head;

        while (temp != null) 
        {
            arrayList.add(temp.data);
            temp = temp.next;
        }

        Collections.sort(arrayList);

        int counter = 0;
        temp = head;
        while (temp != null) 
        {
            temp.data = arrayList.get(counter++);
            temp = temp.next;
        }

        return head;
    }

    public static Node sort(Node head)
    {
        Node primary = null,primaryCurrent = null;
        Node secondary = null;

        int counter = 0;
        while (head != null) 
        {
            if (++counter == 1) 
            {
                if (primary == null) 
                {
                    primary = head;
                    primaryCurrent = primary;

                    head = head.next;
                }
                else
                {
                    Node temp = head.next;
                    primaryCurrent.next = head;
                    primaryCurrent = primaryCurrent.next;

                    head = temp;
                }
            }
            else
            {
                if (secondary == null) 
                {
                    secondary = head;
                    Node temp = head.next;
                    secondary.next = null;
                    head = temp;
                }
                else
                {
                    Node temp = head.next;
                    head.next = secondary;
                    secondary = head;

                    // Mandatory step
                    head = temp;
                }

                counter = 0;
            }

            
        }

        if (primaryCurrent != null) 
        {
            primaryCurrent.next = secondary;
        }

        while (primary != null) 
        {
            System.out.print(primary.data + " ");
            primary = primary.next;  
        }

        return primary;
    }
}

class Node {
    int data;
    Node next;
    
    public Node (int data){
        this.data = data;
        this.next = null;
    }
}
