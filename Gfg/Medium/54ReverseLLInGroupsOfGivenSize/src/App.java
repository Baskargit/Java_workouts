// https://practice.geeksforgeeks.org/problems/reverse-a-linked-list-in-groups-of-given-size/1/?difficulty[]=1&page=4&query=difficulty[]1page4
// 1:45 mins taken to solve this problem
// Execution Time:1.45s

// Expected Time Complexity : O(N) => met
// Expected Auxilliary Space : O(1) => met

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        head = reverse(head, 4);
        print(head);
    }

    public static Node reverse(Node node, int k)
    {
        Node finalHead = node,currentNode = node,prevNode = null;
        Node reversedHead = null,reversedTail = null;
        int currentK = 0;
        boolean flag = false;

        if (k > 1) 
        {
            while (currentNode != null) 
            {
                Node nextNode = currentNode.next;
                currentNode.next = prevNode;

                if (reversedHead == null) 
                {
                    reversedHead = currentNode;
                }

                if (++currentK == k || nextNode == null)
                {
                    // If finalHead not modified so far
                    if (!flag) 
                    {
                        finalHead = currentNode;
                        flag = true;
                    }
                    else
                    {
                        reversedTail.next = currentNode;
                        reversedHead.next = nextNode;
                    }

                    reversedTail = reversedHead;
                    reversedHead = null;
                    currentK = 0;
                }
                
                prevNode = currentNode;
                currentNode = nextNode;
            }
        }

        return finalHead;
    }

    public static void print(Node head)
    {
        while (head != null) 
        {
            System.out.print(head.data + " ");
            head = head.next;    
        }

        System.out.println();
    }
}

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}
