// https://practice.geeksforgeeks.org/problems/find-length-of-loop/1
// Execution Time:2.28


public class App {
    public static void main(String[] args) throws Exception 
    {
        
    }

    public static int countNodesinLoop(Node head)
    {
        int length = 0;
        boolean isLoopFound = false;

        Node tortoise = head,hare= head,loopAtNode = null;
        int counter = 0;

        while (tortoise != null && hare != null && hare.next != null) 
        {
            counter++;

            tortoise = tortoise.next;
            hare = hare.next.next;
            
            if (tortoise == hare) 
            {
                isLoopFound = true;
                loopAtNode = tortoise;
                break;    
            }
        }

        if (isLoopFound) 
        {
            if (loopAtNode != head)
            {
                while (head != loopAtNode) 
                {
                    counter--;
                    head = head.next;
                    loopAtNode = loopAtNode.next;
                }

                counter = 0;

                do 
                {
                    counter++;
                    loopAtNode = loopAtNode.next;    
                } while (loopAtNode != head);

                length = counter;
            }
            else
            {
                length = counter;
            }
        }

        return length;
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
10
42 100 51 61 80 85 92 20 88 64
8

Its Correct output is:
3

And Your Code's output is:
9
 */
