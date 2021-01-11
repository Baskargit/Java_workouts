import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
			int n = Integer.parseInt(bi.readLine().trim());
			
			String input[] = bi.readLine().trim().split(" ");
			int array[] = new int[n];

			long sum = 0;

			TreeMap<Integer,Integer> treeMap = new TreeMap<Integer,Integer>();

			for (int i = 0; i < n; i++) 
			{
				int key = Integer.parseInt(input[i]);
				treeMap.put(key, i);

				array[i] = key;
			}

			for (int i = 0; i < n; i++) 
			{
				Map.Entry<Integer,Integer> entry = treeMap.lowerEntry(array[i] + 1);

				if (entry != null && entry.getValue() > i) 
				{
					sum += entry.getKey() % 1000000001;
				}
			}

			System.out.println(sum);
		}
		
		bi.close();
    }
}
