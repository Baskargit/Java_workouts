import java.util.LinkedList;
import java.util.Queue;

public class App {
    public static void main(String[] args) throws Exception 
    {
        int k = 3;

        Queue<Integer> q = new LinkedList<Integer>();
        q.add(1);q.add(2);q.add(3);q.add(4);q.add(5);

        q = modifyQueue(q, k);

        System.out.println(q);
    }

    public static Queue<Integer> modifyQueue(Queue<Integer> q, int k)
    {
        Integer numbers[] = new Integer[q.size()];
        numbers = q.toArray(numbers);

        Queue<Integer> modifiedQueue = new LinkedList<Integer>();

        for (int i = k - 1; i >= 0; i--) 
        {
            modifiedQueue.add(numbers[i]);
        }

        for (int i = k; i < numbers.length; i++) 
        {
            modifiedQueue.add(numbers[i]);
        }

        return modifiedQueue;
    }
}
