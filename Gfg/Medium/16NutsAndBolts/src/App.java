import java.util.LinkedHashMap;

// https://practice.geeksforgeeks.org/problems/nuts-and-bolts-problem0431/1/?difficulty[]=1&page=1&query=difficulty[]1page1
// Execution Time:0.16

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        // char nuts[] = {'@', '%', '$', '#', '^'};
        // char bolts[] = {'%', '@', '#', '$', '^'};

        char nuts[] = {'&', '$', '^', '~', '@', '#', '%', '*'};
        char bolts[] = {'^', '$', '%', '@', '&', '~', '#', '*'};

        matchPairs(nuts, bolts, nuts.length);
    }

    public static void matchPairs(char nuts[], char bolts[], int n) 
    {
        LinkedHashMap<Character,Boolean> hashMap = new LinkedHashMap<Character,Boolean>();
        hashMap.put('!', false);
        hashMap.put('#', false);
        hashMap.put('$', false);
        hashMap.put('%', false);
        hashMap.put('&', false);
        hashMap.put('*', false);
        hashMap.put('@', false);
        hashMap.put('^', false);
        hashMap.put('~', false);

        for (int i = 0; i < nuts.length; i++) 
        {
            if (hashMap.containsKey(nuts[i]))
            {
                hashMap.replace(nuts[i], true);
            }    
        }

        int pos = 0;

        for (java.util.Map.Entry<Character,Boolean> map : hashMap.entrySet()) 
        {
            if (map.getValue()) 
            {
                nuts[pos] = map.getKey();
                bolts[pos++] = map.getKey();
            }
        }

    }
}

/**

Input:
8
& $ ^ ~ @ # % *
^ $ % @ & ~ # *

Its Correct output is:
# $ % & * @ ^ ~
# $ % & * @ ^ ~

And Your Code's output is:
$ % & * @ ^ ~ *

 */
