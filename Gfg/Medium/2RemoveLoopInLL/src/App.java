// https://practice.geeksforgeeks.org/problems/remove-loop-in-linked-list/1/
// Execution Time:2.35

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        
    }

    public static void removeLoop(Node head)
    {
        boolean isLoopFound = false;
        Node loopPoint = null,loopPrevious = null;

        if (head != null) 
        {
            Node hare = head,tortoise = head;

            // Floyd's (or) two-pointer (or) tortoise and hare algorithm
            while (hare != null && tortoise != null && hare.next != null) 
            {
                tortoise = tortoise.next;
                loopPrevious = hare.next;
                hare = hare.next.next;
                
                if (hare == tortoise) 
                {
                    isLoopFound = true;
                    loopPoint = hare;
                    break;   
                }
            }
        }

        if (isLoopFound) 
        {
            if (loopPrevious.next == head) 
            {
                loopPrevious.next = null;
            }
            else
            {
                Node previous = loopPoint;

                while (head != loopPoint)
                {
                    previous = loopPoint;
                    
                    loopPoint = loopPoint.next;
                    head = head.next;
                }

                previous.next = null;
            }

            
        }
    }
}

class Node
{
    int data;
    Node next;
}

/**
Input:
5
7 58 36 34 16
1

Its Correct output is:
1

And Your Code's output is:
0
 */

