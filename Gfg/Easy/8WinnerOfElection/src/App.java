import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            int n = Integer.parseInt(bi.readLine());
            
            String array[] = bi.readLine().split(" ");

            HashMap<String,Integer> hashMap = new HashMap<String,Integer>();

            for (int i = 0; i < array.length; i++) 
            {
                if (hashMap.containsKey(array[i])) {
                    hashMap.replace(array[i], hashMap.get(array[i]) + 1);
                }
                else
                {
                    hashMap.put(array[i], 1);
                }
            }

            System.out.println();
		}
		
		bi.close();
    }
}
