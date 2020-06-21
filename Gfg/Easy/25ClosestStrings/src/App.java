import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

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
                        int abs = Math.abs(s2Indexes.get(0) - s1Indexes.get(i));
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
                        int abs = Math.abs(s1Indexes.get(0) - s2Indexes.get(i));
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
		}
		
		bi.close();
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

 */
