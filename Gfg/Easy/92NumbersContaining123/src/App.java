import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

// https://practice.geeksforgeeks.org/problems/numbers-containing-1-2-and-3/0
// Execution Time:0.87

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            int n = Integer.parseInt(bi.readLine().trim());
            
            String string[] = bi.readLine().trim().split(" ");

            int numbers[] = new int[n];

            ArrayList<Integer> arrayList = new ArrayList<Integer>();
            StringBuilder output = new StringBuilder();

            for (int i = 0; i < n; i++) 
            {
                numbers[i] = Integer.parseInt(string[i]);

                int num = numbers[i];
                boolean flag = (num > 0) ? true : false;

                while (num > 0) 
                {
                    int rem = num % 10;
                    if (rem == 0 || rem > 3 ) { flag = false; break; }
                    num /= 10;
                }

                if (flag) 
                {
                    arrayList.add(numbers[i]);
                    
                }
            }

            if (arrayList.size() > 0) 
            {
                Collections.sort(arrayList);

                for (Integer integer : arrayList) 
                {
                    output.append(integer + " ");
                }    
            }

            System.out.println((arrayList.size() > 0) ? output.toString() : "-1");
		}
		
		bi.close();
    }
}
