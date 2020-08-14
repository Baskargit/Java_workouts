// https://practice.geeksforgeeks.org/problems/arrange-consonants-and-vowels/1
// Execution Time:0.36

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        Node head = new Node('a');
        head.next = new Node('e');
        head.next.next = new Node('g');
        head.next.next.next = new Node('h');
        head.next.next.next.next = new Node('i');
        head.next.next.next.next.next = new Node('m');

        arrangeCV(head);
    }

    public static Node arrangeCV(Node head)
    {
        Node finalNode = null,finalCurrent = null;
        Node nonConsonantCurrent = null,nonConsonant = null;
        Node temp = head;

        while (temp != null) 
        {
            if (temp.data == 'a' || temp.data == 'e' || temp.data == 'i' || temp.data == 'o' || temp.data == 'u') 
            {
                if (finalNode == null) 
                {
                    finalNode = temp;
                    finalCurrent = temp;    
                }
                else
                {
                    finalCurrent.next = temp;
                    finalCurrent = finalCurrent.next;
                }
            }
            else
            {
                if (nonConsonant == null) 
                {
                    nonConsonant = temp;
                    nonConsonantCurrent = nonConsonant;
                }
                else
                {
                    nonConsonantCurrent.next = temp;
                    nonConsonantCurrent = nonConsonantCurrent.next;
                }
            }
            
            temp = temp.next;
        }

        if (finalCurrent != null) 
        {
            finalCurrent.next = nonConsonant;
            
            if (nonConsonantCurrent != null) {
                nonConsonantCurrent.next = null;
            }
        }
        else
        {
            finalNode = head;
        }

        return finalNode;
    }
}

class Node {
    char data;
    Node next;
    
    public Node(char data){
        this.data = data;
        next = null;
    }
}

/**
Input:
11
a e g h i m p e r m u

Its Correct output is:
a e i e u g h m p r m

And Your Code's output is:
a e g h i m p e r m u
 */
