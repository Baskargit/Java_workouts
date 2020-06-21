import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;

// https://practice.geeksforgeeks.org/problems/longest-k-unique-characters-substring/0
// Execution Time:0.23

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            char array[] = bi.readLine().toCharArray();
            
            int k = Integer.parseInt(bi.readLine().trim());

            HashMap<Character,Integer> hashMap = new HashMap<Character,Integer>();

            int maxSubStringLength = 0;
            boolean isComplete = false;

            if (k <= array.length) 
            {
                for (int i = 0; i < array.length && !isComplete; i++) 
                {
                    hashMap.clear();
                    int j = i;
                    
                    while (true) 
                    {
                        StringBuilder builder = new StringBuilder();
                        int incBy = 0;
                        int tempLength = 0;

                        if (j + k < array.length) 
                        {
                            for (int l = j; l < j+k; l++) 
                            {
                                incBy++;
                                hashMap.put(array[l], 1);    
                                builder.append(array[l]);
                            }
                        }
                        else
                        {
                            for (int l = j; l < array.length; l++) 
                            {
                                incBy++;
                                hashMap.put(array[l], 1);    
                                builder.append(array[l]);
                            }
                        }

                        if (hashMap.size() <= k) 
                        {
                            tempLength += incBy;
                            maxSubStringLength = (tempLength > maxSubStringLength) ? tempLength : maxSubStringLength;
                        
                            for (int l = j + incBy; l < array.length; l++) 
                            {
                                hashMap.put(array[l], 1);
                                builder.append(array[l]);

                                if (hashMap.size() <= k) 
                                {
                                    ++tempLength;
                                    maxSubStringLength = (tempLength > maxSubStringLength) ? tempLength : maxSubStringLength;
                                }
                                else
                                {
                                    System.out.println(builder.toString() + " D1 " + builder.length());
                                    break;
                                }

                                // Avoid redendent calls
                                if (l == array.length) 
                                {
                                    isComplete = true;
                                    j = array.length + 1;
                                }
                            }
                        }
                        else
                        {
                            System.out.println(builder.toString()+ " D2 "  + builder.length());
                            break;
                        }
                        
                        break;
                    }
                }
        
            }

            System.out.println((maxSubStringLength > 0) ? maxSubStringLength : -1);
		}
		
		bi.close();
    }
}

/**
szdigznzxtzqsjwatycbmjawwmninepfduplucltxmk
10
o/p => 16
wlrbbmqbhcdarzowkkyhiddqscdxrjmowfrxsjybldbefsarcbynecdyggxxpklorellnmpapqfwkhopkmco
5
o/p => 7
nyqxnzlgdgwpbtrwblnsadeuguumoqcdrubetokyxhoachwdvmxxrdryxlmndqtukwagmlejuukwcibxubumenmeyatdrmydiajx
4
o/p => 7
qmb
6
o/p => -1
 */
