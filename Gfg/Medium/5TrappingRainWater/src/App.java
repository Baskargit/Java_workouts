import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            int n = Integer.parseInt(bi.readLine().trim());
            String input[] = bi.readLine().trim().split(" ");

            // int numbers[] = new int[n];
            long trappedWater = 0,maxSoFar = -1;
            for (int i = 0; i < n; i++) 
            {
                int number = Integer.parseInt(input[i]);

                maxSoFar = (number > maxSoFar) ? number : maxSoFar;

                trappedWater += (number < maxSoFar) ? maxSoFar - number : 0;

                //numbers[i] = Integer.parseInt(input[i]);    
            }

            System.out.println(trappedWater);
		}
		
		bi.close();
    }
}
