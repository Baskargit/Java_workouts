import java.math.BigInteger;

// https://practice.geeksforgeeks.org/problems/add-1-to-a-number-represented-as-linked-list/1/
// Execution Time:0.95

public class App {
    public static void main(String[] args) throws Exception 
    {
        
    }

    public static Node addOne(Node head) 
    { 
        Node finalList = head;

        StringBuilder stringBuilder = new StringBuilder();

        int length = 0;
        while (head != null) 
        {
            stringBuilder.append(head.data);
            head = head.next;
            length++;
        }

        char sum[] = (new BigInteger(stringBuilder.toString()).add(new BigInteger("1"))).toString().toCharArray();
        
        int pointer = 0;

        if (length != sum.length) 
        {
            head = new Node(sum[0] - '0');
            head.next = finalList;
            finalList = head.next;
            pointer++;
        }
        else
        {
            head = finalList;
        }

        while (finalList != null) 
        {
            finalList.data = sum[pointer++] - '0';
            finalList = finalList.next;
        }

        return head;
    }
}

class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
} 