
//https://practice.geeksforgeeks.org/problems/split-a-circular-linked-list-into-two-halves/1
// Execution Time:0.48

public class App {
    public static void main(String[] args) throws Exception 
    {
        
    }

    void splitList(circular_LinkedList list)
    {
        Node temp = list.head;
        Node last = null;

        int counter = 0;

        do 
        {
            counter++;
            last = temp;
            temp = temp.next;
        } 
        while (temp != list.head);

        int point = (counter % 2 == 0) ? counter / 2 : counter / 2 + 1;
        int count = 0;

        temp = list.head;
        while (++count != point) 
        {
            temp = temp.next;
        }

        list.head1 = list.head;
        list.head2 = temp.next;

        temp.next = list.head;
        last.next = list.head2;
    }
}

class Node {
    int data;
     Node next;
     Node(int d)  { data = d;  next = null; }
 }


class circular_LinkedList 
{
    public Node head,head1,head2;  
}

