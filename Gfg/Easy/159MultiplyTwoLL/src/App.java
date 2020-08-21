// https://practice.geeksforgeeks.org/problems/multiply-two-linked-lists/1
// Execution Time:0.53

public class App {
    public static void main(String[] args) throws Exception 
    {
        
    }

    public long multiplyTwoLists(Node l1,Node l2)
    {
        long num1 = 0,num2 = 0,mod = 1000000007;

        while (l1 != null) 
        {
            num1 = (num1 * 10 + l1.data) % mod;
            l1 = l1.next;
        }

        while (l2 != null) 
        {
            num2 = (num2 * 10 + l2.data) % mod;
            l2 = l2.next;
        }

        return (num1%mod * num2%mod) % mod;
    }
}

class Node
{
    int data; 
    Node next;
    Node(int data) {
        this.data=data;
        this.next = null;
    }
}

/**
Input:
84
7 7 5 3 5 6 2 9 1 2 7 0 9 3 6 0 6 2 6 1 8 7 9 2 0 2 3 7 5 9 2 2 8 9 7 3 6 1 2 9 3 1 9 4 7 8 4 5 0 3 6 1 0 6 3 2 0 6 1 5 5 4 7 6 5 6 9 3 7 4 5 2 5 4 7 4 4 3 0 7 8 6 8 8
85
4 1 4 9 2 0 6 8 9 2 6 6 4 9 5 0 4 8 7 1 7 2 7 2 2 6 1 0 6 1 5 9 4 9 0 9 1 7 7 1 1 5 9 7 7 6 7 3 6 5 6 3 9 4 8 1 2 9 3 9 0 8 8 5 0 9 6 3 8 5 6 1 1 5 9 8 4 8 1 0 3 0 4 4 4

Its Correct output is:
214114287

And Your Code's output is:
104262445
 */
