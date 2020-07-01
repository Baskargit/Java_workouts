import java.io.BufferedReader;
import java.io.InputStreamReader;

// https://practice.geeksforgeeks.org/problems/remaining-string/0
// Already solved

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            String string = bi.readLine().trim();
            char find = bi.readLine().trim().charAt(0);
            int count = Integer.parseInt(bi.readLine().trim());

            String output = null;

            if (count != 0) 
            {
                if (string.contains(Character.toString(find))) 
                {
                    char array[] = string.toCharArray();
                    
                    int counter = 0,lastIndex = -1;

                    for (int i = 0; i < array.length; i++) 
                    {
                        if (array[i] == find) {
                            counter++;
                            lastIndex = i;
                        }
                    }

                    if (counter >= count && lastIndex != array.length - 1) 
                    {
                        output = string.substring(lastIndex + 1, array.length);
                    }
                    else
                    {
                        output = "";
                    }
                }
                else
                {
                    output = "";
                }
            }
            else
            {
                output = string.toString();
            }

            System.out.println(output);
		}
		
		bi.close();
    }
}
