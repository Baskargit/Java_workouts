import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

// https://practice.geeksforgeeks.org/problems/merging-two-unsorted-arrays-in-sorted-order/0
// Execution Time:0.62

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            String dummy = bi.readLine().trim();
            
            String datas[] = (bi.readLine().trim() + " " + bi.readLine().trim()).split(" ");

            int numbers[] = new int[datas.length];

            for (int i = 0; i < numbers.length; i++) 
            {
                numbers[i] = Integer.parseInt(datas[i]);    
            }

            Arrays.sort(numbers);

            StringBuilder stringBuilder = new StringBuilder();

            for (int i = 0; i < numbers.length; i++) 
            {
                stringBuilder.append(numbers[i] + " ");
            }

            System.out.println(stringBuilder.toString().trim());
		}
		
		bi.close();
    }
}
