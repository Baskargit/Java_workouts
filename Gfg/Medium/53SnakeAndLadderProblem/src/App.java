import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

// https://practice.geeksforgeeks.org/problems/snake-and-ladder-problem/0/?difficulty[]=1&page=3&query=difficulty[]1page3
// 1:11 - 1:59
// Time Limit Exceeded
// Expected Time Limit 1.41sec

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            // Generate nodes for the board configuration(5 X 6)
            Node head = new Node(1);
            head.slPosition = -1;
            Node prev = head;

            HashMap<Integer,Node> hashmap = new HashMap<Integer,Node>();
            hashmap.put(1,head);

            for (int i = 2; i <= 30; i++) 
            {
                Node node = new Node(i);
                prev.next = node;
                node.slPosition = -1;
                prev = node;
                hashmap.put(i, node);
            }

            // Update snake and ladder configuration for the board
            int n = Integer.parseInt(bi.readLine().trim());
            String sl[] = bi.readLine().trim().split(" ");

            for (int i = 0; i < n; i = i+2) 
            {
                int num1 = Integer.parseInt(sl[i]);
                int num2 = Integer.parseInt(sl[i+1]);

                Node node = hashmap.get(num1);
                node.slPosition = num2;
            }

            // Print the MinimumThrows required to reach the destination
            System.out.println(MinimumThrows(head, hashmap, 0));
		}
		
		bi.close();
    }

    // Recursive solution
    // It considers all possibilities
    public static int MinimumThrows(Node head, HashMap<Integer,Node> hashmap,int throwsSoFar)
    {
        if (head == null || head.pos == 30)
        {
            return throwsSoFar;
        }

        if (head.slPosition == -1) 
        {
            return Math.min(MinimumThrows(hashmap.get(head.pos + 1),hashmap,throwsSoFar + 1),
            Math.min(MinimumThrows(hashmap.get(head.pos + 2),hashmap,throwsSoFar + 1),
            Math.min(MinimumThrows(hashmap.get(head.pos + 3),hashmap,throwsSoFar + 1),
            Math.min(MinimumThrows(hashmap.get(head.pos + 4),hashmap,throwsSoFar + 1),
            Math.min(MinimumThrows(hashmap.get(head.pos + 5),hashmap,throwsSoFar + 1),
            MinimumThrows(hashmap.get(head.pos + 6),hashmap,throwsSoFar + 1))))));
        }
        else if (head.slPosition > head.pos) 
        {
            // Ladder found, so move pointer to the ladder end position
            return MinimumThrows(hashmap.get(head.slPosition),hashmap,throwsSoFar);
        }

        // Snake found
        return Integer.MAX_VALUE;
    }
}

class Node
{
    public Node next;
    public int slPosition;
    int pos;

    Node(int pos)
    {
        this.pos = pos;
    }
}

