// https://practice.geeksforgeeks.org/problems/rotate-a-linked-list/1
// Execution Time:2.57

public class App {
    public static void main(String[] args) throws Exception 
    {
        
    }

    public Node rotate(Node head, int k) 
    {
        Node finalList = null,prev = null,temp = head;
        int counter = 0;
        boolean flag = false;

        while (temp != null) 
        {
            if (++counter == k) 
            {
                if (temp.next != null) 
                {
                    finalList = temp.next;
                    flag = true;
                }
                else
                {
                    finalList = head;
                }

                Node t = temp.next;
                temp.next = null;

                temp = t;
            }
            else
            {
                prev = temp;
                temp = temp.next;
            }
        }

        if (prev != null && flag) 
        {
            prev.next = head;
        }

        return finalList;
    }
}

class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
