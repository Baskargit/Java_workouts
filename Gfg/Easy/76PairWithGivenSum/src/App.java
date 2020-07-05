import java.io.BufferedReader;
import java.io.InputStreamReader;

// https://practice.geeksforgeeks.org/problems/pair-with-given-sum-in-a-sorted-array/0
// Execution Time:1.65

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            int n = Integer.parseInt(bi.readLine().trim());
            
            String string[] = bi.readLine().trim().split(" ");

            int k = Integer.parseInt(bi.readLine().trim());

            int numbers[] = new int[n];
            for (int i = 0; i < n; i++) 
            {
                numbers[i] = Integer.parseInt(string[i]);    
            }

            int leftPointer = 0,rightPointer = n - 1;
            boolean isFound = false;
            StringBuilder stringBuilder = new StringBuilder();

            for (; leftPointer < rightPointer; ) 
            {
                int sum = numbers[leftPointer] + numbers[rightPointer];

                if (sum == k) 
                {
                    isFound = true;
                    stringBuilder.append(numbers[leftPointer++] + " " + numbers[rightPointer] + " " + k + "\n");    
                }
                else if(sum < k)
                {
                    leftPointer++;
                }
                else
                {
                    rightPointer--;
                }
            }

            String output = stringBuilder.toString();
            System.out.println(isFound ? output.substring(0,output.length() - 1) : "-1");
		}
		
		bi.close();
    }
}
