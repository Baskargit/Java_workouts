// https://practice.geeksforgeeks.org/problems/rearrange-a-linked-list/1
// Execution Time:3.28

public class App {
    public static void main(String[] args) throws Exception 
    {
        
    }

    public static Node rearrangeEvenOdd(Node head)
    {
        Node finalNode = null;

        Node oddHead = null,oddCurrent = null;
        Node evenHead = null,evenCurrent = null;

        int counter = 1;

        while (head != null) 
        {
            Node next = head.next;

            if (counter % 2 == 0) 
            {
                if (evenHead == null) 
                {
                    evenHead = head;
                    evenCurrent = head;
                }
                else
                {
                    evenCurrent.next = head;
                    evenCurrent = evenCurrent.next;
                }
            } 
            else 
            {
                if (oddHead == null) 
                {
                    oddHead = head;
                    oddCurrent = oddHead;
                } 
                else 
                {
                    oddCurrent.next = head;
                    oddCurrent = oddCurrent.next;
                }
            }
            
            head = next;
            counter++;
        }

        if (oddHead != null) 
        {
            finalNode = oddHead;
            oddCurrent.next = evenHead;

            if (evenCurrent != null) {
                evenCurrent.next = null;
            }
        }

        return finalNode;
    }
}

class Node {

    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
