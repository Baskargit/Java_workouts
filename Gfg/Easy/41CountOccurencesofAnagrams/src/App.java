import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

// https://practice.geeksforgeeks.org/problems/count-occurences-of-anagrams/0
// Execution Time:0.18

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            String word = bi.readLine().trim();
            int wLen = word.length();
            char text[] = bi.readLine().trim().toCharArray();
            int tLen = text.length;
            Arrays.sort(text);
            String toTestFor = String.valueOf(text);

            int counter = 0;
            for (int i = 0; i < wLen; i++) 
            {
                if (i + tLen <= wLen) 
                {
                    char array[] = word.substring(i, i+tLen).toCharArray();
                    Arrays.sort(array);
                    
                    if (String.valueOf(array).equals(toTestFor)) {
                        counter++;
                    }
                }    
            }

            System.out.println(counter);
		}
		
		bi.close();
    }
}

/**
Input:
zbcoejuvpvaboyg
po

Its Correct output is:
0

And Your Code's output is:
1

 */