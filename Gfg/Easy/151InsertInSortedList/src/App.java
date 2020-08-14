// https://practice.geeksforgeeks.org/problems/insert-in-a-sorted-list/1
// Execution Time:4.66


public class App {
    public static void main(String[] args) throws Exception 
    {
        Node head1 = new Node(50);
        head1.next = new Node(100);
        sortedInsert(head1, 75);
    }

    public static Node sortedInsert(Node head1, int key)
    {
        Node temp = head1;

        if (temp != null) 
        {
            if (key > temp.data) 
            {
                boolean isInsertDone = false;
                Node prev = null;

                while (temp != null) 
                {
                    if (key <= temp.data) 
                    {
                        Node newNode = new Node(key);
                        newNode.next = temp;
                        prev.next = newNode;

                        isInsertDone = true;
                        break;    
                    }

                    prev = temp;
                    temp = temp.next;
                }

                if (!isInsertDone) 
                {
                    prev.next = new Node(key);
                }
            }
            else
            {
                head1 = new Node(key);
                head1.next = temp;
            }
        }

        return head1;
    }
}

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

/**
Input:
8
1 11 19 26 39 52 55 64
16

Its Correct output is:
1 11 16 19 26 39 52 55 64

And Your Code's output is:
1 16 11 19 26 39 52 55 64
*/
