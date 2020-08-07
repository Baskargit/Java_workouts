import java.util.Arrays;

// https://practice.geeksforgeeks.org/problems/merge-list-alternatingly/1/
// Unsolved

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        App app = new App();

        Node head1 = app.new Node(9);
        head1.next = app.new Node(10);

        Node head2 = app.new Node(5);
        head2.next = app.new Node(4);
        head2.next.next = app.new Node(3);
        head2.next.next.next = app.new Node(2);
        head2.next.next.next.next = app.new Node(1);
        head2.next.next.next.next.next = app.new Node(6);

        mergeAlt(head1, head2);
    }

    public static void mergeAlt(Node head1, Node head2)
    {
        Node a = head1;
        Node b = head2;
        
        int head1Len = 0,head2Len = 0;
        
        while(a != null) { head1Len++; a = a.next;  }
        while(b != null) { head2Len++; b = b.next;  }
        
        int totalLength = head1Len + head2Len;
        
        Node mergeSimulated[] = new Node[totalLength];
        int counter = totalLength - 1;
        
        for(int i=(head1Len >= head2Len) ? head1Len : head2Len; i>0; i--)
        {
            if(head2Len == head1Len)
            {
                mergeSimulated[counter--] = head2;
                mergeSimulated[counter--] = head1;
                
                head2 = head2.next;
                head1 = head1.next;
                
                head2Len--;head1Len--;
            }
            else if(head2Len > head1Len)
            {
                mergeSimulated[counter--] = head2;
                head2Len--;

                head2 = head2.next;
            }
            else
            {
                mergeSimulated[counter--] = head1;
                head1Len--;

                head1 = head1.next;
            }
        }
        
        for(int i=0; i<totalLength; i++)
        {
            System.out.print(mergeSimulated[i].data + " ");
        }
    }

    class Node {
        int data;
        Node next;
        
        public Node(int data){
            this.data = data;
        }
    }
}

/**
Input:
2
9 10
6
5 4 3 2 1 6

Its Correct output is:
10 6 9 1
2 3 4 5

And Your Code's output is:
9 5 10 4 3 2 1 6
 */