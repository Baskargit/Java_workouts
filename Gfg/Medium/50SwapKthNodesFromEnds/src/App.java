// https://practice.geeksforgeeks.org/problems/swap-kth-node-from-beginning-and-kth-node-from-end-in-a-singly-linked-list/1/?difficulty[]=1&page=3&query=difficulty[]1page3#
// Execution Time:0.62

// Expected Time Complexity: O(n) => Met
// Expected Auxillary space Complexity: O(1) => Met

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        Node head = new Node(1);
        head.next = new Node(2);
        // head.next.next = new Node(3);
        // head.next.next.next = new Node(4);
        // head.next.next.next.next = new Node(5);

        int length = 2,K = 2;

        head = swapkthnode1(head, length, K);

        while (head != null) 
        {
            System.out.print(head.data + " ");
            head = head.next;    
        }

    }

    public static Node swapkthnode1(Node head, int num, int K)
    {
        int length = num;
        Node finalHead = head,temp = head;

        if (length == 1 || (length % 2 == 1 && (length/2) + 1 == K ) || K > length || K == 0)
        {
            return finalHead;
        }
        else if (length == 2)
        {
            finalHead = head.next;
            finalHead.next = head;
            head.next = null;
        }
        else if (K == 1 || K == length)
        {
            Node l2 = null,l1 = null;

            while (temp != null) 
            {
                l1 = l2;
                l2 = temp;
                temp = temp.next;    
            }

            finalHead = l2;
            l2.next = head.next;
            l1.next = head;
            head.next = null;
        }
        else
        {
            temp = head;

            int fwdIndex = 1, revIndex = length;
            Node fwdNode = null , fwdPrev = null, revNode = null, revPrev = null;

            Node prev = null;

            while(temp != null)
            {
                if (fwdIndex == K) 
                {
                    fwdNode = temp;
                    fwdPrev = prev;
                }

                if (revIndex == K) 
                {
                    revNode = temp;
                    revPrev = prev;
                }

                fwdIndex++;revIndex--;
                prev = temp;
                temp = temp.next;
            }

            // Ex 1 2 3 4 => If K = 2 {2 and 3 need to be swapped}
            if (revPrev.equals(fwdNode)) 
            {
                fwdPrev.next = revNode;
                fwdNode.next = revNode.next;

                revNode.next = fwdNode;
            }
            else
            {
                // Ex 1 2 3 4 5 => If K = 2 {2 and 4 need to be swapped}
                fwdPrev.next = revNode;
                revPrev.next = fwdNode;

                temp = fwdNode.next;

                fwdNode.next = revNode.next;
                revNode.next = temp;
            }
        }

        return finalHead;
    }

}

class Node  
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
