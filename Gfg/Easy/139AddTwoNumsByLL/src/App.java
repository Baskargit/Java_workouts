// Add two numbers represented by linked lists 

// https://practice.geeksforgeeks.org/problems/add-two-numbers-represented-by-linked-lists/1/
// Execution Time:2.84

public class App {
    public static void main(String[] args) throws Exception 
    {
        
    }

    public static Node addLists(Node first, Node second)
    {
        Node finalList = null,pointer = null;

        StringBuilder firstNum = new StringBuilder();
        StringBuilder secondNum = new StringBuilder();

        while (first != null) 
        {
            firstNum.append(first.data);
            first = first.next;
        }

        while (second != null)
        {
            secondNum.append(second.data);
            second = second.next;
        }

        char output[] = (new  java.math.BigInteger(firstNum.toString()).add(new java.math.BigInteger(secondNum.toString()))).toString().toCharArray();

        for (int i = 0; i < output.length; i++) 
        {
            if (finalList == null) 
            {
                finalList = new Node(output[i] - '0');
                pointer = finalList;
            }
            else
            {
                pointer.next = new Node(output[i] - '0');
                pointer = pointer.next;
            }
        }

        return finalList;
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
