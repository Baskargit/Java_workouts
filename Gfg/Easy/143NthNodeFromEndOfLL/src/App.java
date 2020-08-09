// https://practice.geeksforgeeks.org/problems/nth-node-from-end-of-linked-list/1
// Execution Time:0.8

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        
    }

    public int getNthFromLast(Node head, int n)
    {
        int num[] = new int[1001];
        int counter = 1;

        while (head != null) 
        {
            num[counter++] = head.data;
            head = head.next;
        }

        return (n < counter) ? num[counter - n] : -1;
    }
}

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
