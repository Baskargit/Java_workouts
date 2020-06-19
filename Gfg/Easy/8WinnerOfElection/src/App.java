import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

// https://practice.geeksforgeeks.org/problems/winner-of-an-election-where-votes-are-represented-as-candidate-names/0
// Execution Time:0.65

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));

        int testcasecount = Integer.parseInt(bi.readLine());

        while (testcasecount-- > 0) 
        {
            int n = Integer.parseInt(bi.readLine());

            String array[] = bi.readLine().split(" ");

            HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

            for (int i = 0; i < array.length; i++) {
                if (hashMap.containsKey(array[i])) {
                    hashMap.replace(array[i], hashMap.get(array[i]) + 1);
                } else {
                    hashMap.put(array[i], 1);
                }
            }

            List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(hashMap.entrySet());

            // Sort by value descending
            list.sort(new Comparator<Map.Entry<String, Integer>>() 
            {
                @Override
                public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) 
                {
                    return (o1.getValue()).compareTo(o2.getValue());
                }
            }.reversed());

            int maxValue = list.get(0).getValue();

            List<Map.Entry<String, Integer>> finalList = new LinkedList<Map.Entry<String, Integer>>();

            list.forEach(item -> {
                if (item.getValue() == maxValue) {
                    finalList.add(item);
                } else {
                    return;
                }
            });

            // Sort by key Ascending
            finalList.sort(new Comparator<Map.Entry<String, Integer>>() 
            {
                @Override
                public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) 
                {
                    return (o1.getKey().compareTo(o2.getKey()));
                }
            });

            String key = finalList.stream().findFirst().get().getKey();
            int value = finalList.stream().findFirst().get().getValue();

            System.out.println(key + " " + value);
		}
		
		bi.close();
    }
}
