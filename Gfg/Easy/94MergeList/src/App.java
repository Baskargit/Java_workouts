import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

// https://practice.geeksforgeeks.org/problems/segregate-even-and-odd-nodes-in-a-linked-list/0
// Execution Time:0.32

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            int n = Integer.parseInt(bi.readLine().trim());
            
            String string[] = bi.readLine().trim().split(" ");

            LinkedList<Integer> evenList = new LinkedList<Integer>();
            LinkedList<Integer> oddList = new LinkedList<Integer>();

            StringBuilder even = new StringBuilder();
            StringBuilder odd = new StringBuilder();
            for (int i = 0; i < n; i++) 
            {
                int num = Integer.parseInt(string[i]);
                
                if (num % 2 == 0) {
                    evenList.add(num);
                    even.append(num + " ");
                }
                else {
                    oddList.add(num);
                    odd.append(num);
                }
            }

            evenList.addAll(oddList);

            System.out.println(even.toString() + odd.toString().trim());
		}
		
		bi.close();
    }
}
