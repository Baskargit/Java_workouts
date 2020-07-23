import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.TreeSet;

// https://practice.geeksforgeeks.org/problems/closest-strings/0
// Execution Time:0.62

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            int wordCount = Integer.parseInt(bi.readLine());
            String array[] = bi.readLine().trim().split(" ");
            String find[] = bi.readLine().trim().split(" ");

            HashMap<String,Data> hashMap = new HashMap<String,Data>();
            
            for (int i = 0; i < array.length; i++) 
            {
                if (hashMap.containsKey(array[i])) 
                {
                    hashMap.get(array[i]).positions.add(i+1);
                }
                else
                {
                    Data value = new Data();
                    value.index = i + 1;
                    
                    hashMap.put(array[i], value);
                }
            }

            int minDistsnace = Integer.MAX_VALUE;

            if ((hashMap.containsKey(find[0]) && hashMap.containsKey(find[1])) && !find[0].equals(find[1]))
            {
                if (hashMap.get(find[0]).positions.size() > 0 && hashMap.get(find[1]).positions.size() > 0 ) 
                {
                    if (Math.abs(hashMap.get(find[0]).index - hashMap.get(find[1]).index) > 1) 
                    {
                        for (Integer fromPos : hashMap.get(find[0]).positions) 
                        {
                            for (Integer toPos : hashMap.get(find[1]).positions) 
                            {
                                int tempDis = Math.abs(fromPos - toPos);
                                minDistsnace = (tempDis < minDistsnace) ? tempDis : minDistsnace;

                                int x = Math.abs(toPos - hashMap.get(find[0]).index);
                                minDistsnace = (x != 0 &&x < minDistsnace) ? x : minDistsnace;
                            }

                            int x = Math.abs(fromPos - hashMap.get(find[1]).index);
                            minDistsnace = (x != 0 &&x < minDistsnace) ? x : minDistsnace;
                        }
                    }
                    else
                    {
                        minDistsnace = 1;
                    }
                }
                else
                {
                    if (hashMap.get(find[0]).positions.size() > 0) // multiple from
                    {
                        int toPos = hashMap.get(find[1]).index;

                        for (Integer fromPos : hashMap.get(find[0]).positions) 
                        {
                            int tempDis = Math.abs(fromPos - toPos);
                            minDistsnace = (tempDis < minDistsnace) ? tempDis : minDistsnace;
                        }
                    }
                    else if (hashMap.get(find[1]).positions.size() > 0) // multiple to
                    {
                        int fromPos = hashMap.get(find[0]).index;

                        for (Integer toPos : hashMap.get(find[1]).positions) 
                        {
                            int tempDis = Math.abs(fromPos - toPos);
                            minDistsnace = (tempDis < minDistsnace) ? tempDis : minDistsnace;
                        }
                    }
                }

                int x = Math.abs(hashMap.get(find[0]).index - hashMap.get(find[1]).index);
                minDistsnace = (x != 0 && x < minDistsnace) ? x : minDistsnace;
            } 
            else 
            {
                minDistsnace = 0;
            }

            System.out.println(minDistsnace);
		}
		
		bi.close();
    }
}

/**
 * Data
 */
class Data 
{
    public int index;
    public TreeSet<Integer> positions;

    public Data() 
    {
        positions = new TreeSet<Integer>();
    }
}

/**

For Input:
2
9
ily ily ily ily ily ily ily ily ily
ily ily
7
giclowapfkr giclowapfkr giclowapfkr giclowapfkr giclowapfkr giclowapfkr giclowapfkr
giclowapfkr giclowapfkr

5
the quick brown fox quick
fox the

5
the quick brown fox quick
quick fox
6
the quick brown fox quick the
fox the
5
the quick brown fox quick
fox the

 */

/** {Old approach}
int wordCount = Integer.parseInt(bi.readLine());
String array[] = bi.readLine().trim().split(" ");
String find[] = bi.readLine().trim().split(" ");

ArrayList<Integer> s1Indexes = new ArrayList<Integer>();
ArrayList<Integer> s2Indexes = new ArrayList<Integer>();

for (int i = 0; i < wordCount; i++) 
{
    if (array[i].equals(find[0])) {
        s1Indexes.add(i);
    }
    else if (array[i].equals(find[1])) {
        s2Indexes.add(i);
    }
}

int minDistsnace = Integer.MAX_VALUE;

if (s1Indexes.size() > s2Indexes.size()) 
{
    if (s2Indexes.size() > 0) 
    {
        for (int i = 0; i < s1Indexes.size(); i++) 
        {
            int temp = s2Indexes.get(0) - s1Indexes.get(i);
            int abs = (temp < 0) ? Math.abs(temp) : temp - 1;
            minDistsnace = (abs < minDistsnace) ? abs : minDistsnace;
        }
    }
    else
    {
        minDistsnace = 1;
    } 
}
else if (s2Indexes.size() > s1Indexes.size()) 
{
    if (s1Indexes.size() > 0) 
    {
        for (int i = 0; i < s2Indexes.size(); i++) 
        {
            int temp = s1Indexes.get(0) - s2Indexes.get(i);
            int abs = (temp < 0) ? Math.abs(temp) : temp - 1;
            minDistsnace = (abs < minDistsnace) ? abs : minDistsnace;
        }
    }
    else
    {
        minDistsnace = 1;
    }
}
else
{
    minDistsnace = Math.abs(s1Indexes.get(0) - s2Indexes.get(0));
}

System.out.println(minDistsnace);
 */
