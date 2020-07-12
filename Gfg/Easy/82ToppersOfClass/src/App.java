import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

// https://practice.geeksforgeeks.org/problems/toppers-of-class/0
// Wrong test cases

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

            TreeMap<Integer,Integer> hashMap = new TreeMap<Integer,Integer>(Comparator.reverseOrder());
            StringBuilder equalK = new StringBuilder();
            StringBuilder output = new StringBuilder();

            for (int i = 0; i < n; i++) 
            {
                numbers[i] = Integer.parseInt(string[i]); 
                
                if (numbers[i] == k) 
                {
                    equalK.append(i + " ");    
                }
                else if (numbers[i] > k) 
                {
                    hashMap.put(numbers[i], i);
                }
            }

            if (hashMap.size() > 0) 
            {                
                StringBuilder higher = new StringBuilder();

                for (Map.Entry<Integer,Integer> entry : hashMap.entrySet()) 
                {
                    higher.append(entry.getValue() + " ");
                }

                output.append(higher.toString());
            }

            output.append(equalK.toString().trim());

            System.out.println(output);
		}
		
		bi.close();
    }
}
