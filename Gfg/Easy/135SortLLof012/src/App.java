// https://practice.geeksforgeeks.org/problems/given-a-linked-list-of-0s-1s-and-2s-sort-it/1
// Execution Time:1.35

public class App {
    public static void main(String[] args) throws Exception 
    {
        
    }

    public static Node segregate(Node head)
    {
        Node zerosNode=null,zerosNodeCurrent = null;
        Node onesNode = null,onesNodeCurrent = null;
        Node twosNode = null,twosNodeCurrent = null;

        while (head != null)
        {
            if (head.data == 0) 
            {
                if (zerosNode == null) 
                {
                    zerosNode = new Node(0);
                    zerosNodeCurrent = zerosNode;
                }
                else
                {
                    zerosNodeCurrent.next = new Node(0);
                    zerosNodeCurrent = zerosNodeCurrent.next;
                }
            }    
            else if (head.data == 1) 
            {
                if (onesNode == null) 
                {
                    onesNode = new Node(1);
                    onesNodeCurrent = onesNode;
                }
                else
                {
                    onesNodeCurrent.next = new Node(1);
                    onesNodeCurrent = onesNodeCurrent.next;
                }
            }
            else
            {
                if (twosNode == null) 
                {
                    twosNode = new Node(2);
                    twosNodeCurrent = twosNode;
                }
                else
                {
                    twosNodeCurrent.next = new Node(2);
                    twosNodeCurrent = twosNodeCurrent.next;
                }
            }

            head = head.next;
        }

        Node finalNode = null;

        if (zerosNode == null) 
        {
            if (onesNode == null) 
            {
                finalNode = twosNode;
            }
            else if (twosNode == null) 
            {
                finalNode = onesNode;
            }
            else
            {
                finalNode = onesNode;
                onesNodeCurrent.next = twosNode;
            }
        }
        else if (onesNode == null) 
        {
            if (zerosNode == null) 
            {
                finalNode = twosNode;
            }
            else if (twosNode == null) 
            {
                finalNode = zerosNode;
            }
            else
            {
                finalNode = zerosNode;
                zerosNodeCurrent.next = twosNode;
            }
        }
        else if (twosNode == null) 
        {
            if (zerosNode == null) 
            {
                finalNode = onesNode;
            }
            else if (onesNode == null) 
            {
                finalNode = zerosNode;
            }
            else
            {
                finalNode = zerosNode;
                zerosNodeCurrent.next = onesNode;
            }
        }
        else
        {
            finalNode = zerosNode;
            zerosNodeCurrent.next = onesNode;
            onesNodeCurrent.next = twosNode;
        }

        return finalNode;
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
