import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// https://practice.geeksforgeeks.org/problems/bitonic-generator-sort/0
// Execution Time:0.31

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            int n = Integer.parseInt(bi.readLine().trim());
            
            String string[] = bi.readLine().trim().split(" ");

            ArrayList<Integer> evenPlacedArray = new ArrayList<Integer>();
            evenPlacedArray.add(Integer.parseInt(string[0]));

            ArrayList<Integer> oddPlacedArray = new ArrayList<Integer>();
            
            for (int i = 1; i < n; i++) 
            {
                if (i % 2 == 0) 
                {
                    evenPlacedArray.add(Integer.parseInt(string[i]));
                }
                else
                {
                    oddPlacedArray.add(Integer.parseInt(string[i]));
                }
            }

            Collections.sort(evenPlacedArray);
            Collections.sort(oddPlacedArray,Comparator.reverseOrder());

            StringBuilder stringBuilder = new StringBuilder();

            for (Integer integer : evenPlacedArray) 
            {
                stringBuilder.append(integer + " ");
            }

            for (Integer integer : oddPlacedArray) 
            {
                stringBuilder.append(integer + " ");
            }

            System.out.println(stringBuilder.toString());
		}
		
		bi.close();
    }
}
