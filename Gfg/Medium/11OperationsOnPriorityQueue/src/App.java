import java.util.PriorityQueue;

// https://practice.geeksforgeeks.org/problems/operations-on-priorityqueue/1/?difficulty[]=1&page=1&query=difficulty[]1page1#
// Execution Time:0.25

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        
    }

    // Function to insert element into the queue
    static void insert(PriorityQueue<Integer> q, int k)
    {
        // Your code here
        //Just insert k in q and don't return anything
        q.add(k);
    }
    
    // Function to find an element k
    static boolean find(PriorityQueue<Integer> q, int k)
    {    
        // Your code here
        // If k is in q return true else return false
        return q.contains(k);
    }
    
    // Function to delete the max element from queue
    static int delete(PriorityQueue<Integer> q)
    {
        // Your code here
        //Delete the max element from q. The priority queue property might be useful here
        return q.poll();
    }
}
