import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

// https://practice.geeksforgeeks.org/problems/polynomial-addition/1/?difficulty[]=1&page=2&query=difficulty[]1page2#
// Execution Time:0.47
// Expected Time Complexity: O(N+M) Met
// Expected Auxiliary Space: O(1) Not met


public class App {
    public static void main(String[] args) throws Exception 
    {
        
    }

    // Functional requirement 
    // Expected Time Complexity: O(N+M) Met
    // Expected Auxiliary Space: O(1) Not met
    public static Node addPolynomial(Node p1,Node p2)
    {
        Node sumNode = null;

        TreeMap<Integer,Integer> treeMap = new TreeMap<Integer,Integer>(Collections.reverseOrder());

        while (p1 != null) 
        {
            if (treeMap.containsKey(p1.pow)) 
            {
                treeMap.replace(p1.pow ,treeMap.get(p1.pow) + p1.coeff);
            }
            else
            {
                treeMap.put(p1.pow ,p1.coeff);
            }

            p1 = p1.next;   
        }

        while (p2 != null) 
        {
            if (treeMap.containsKey(p2.pow)) 
            {
                treeMap.replace(p2.pow ,treeMap.get(p2.pow) + p2.coeff);
            }
            else
            {
                treeMap.put(p2.pow ,p2.coeff);
            }

            p2 = p2.next;   
        }

        Node tempNode = null;

        for (Map.Entry<Integer,Integer> entry : treeMap.entrySet()) 
        {
            if (sumNode == null) 
            {
                sumNode = new Node(entry.getValue(), entry.getKey());
                tempNode = sumNode;
            }
            else
            {
                tempNode.next = new Node(entry.getValue(), entry.getKey());
                tempNode = tempNode.next;
            } 
        }

        return sumNode;
    }
}

class Node
{
    int coeff;
    int pow;
    Node next;

    Node(int a,int b)
    {
        coeff=a;
        pow=b;
        next=null;
    }
}
