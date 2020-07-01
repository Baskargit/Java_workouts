import java.io.BufferedReader;
import java.io.InputStreamReader;

// https://practice.geeksforgeeks.org/problems/count-number-of-words/0
// Unsolved

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            char string[] = bi.readLine().trim().toCharArray();
            
            int wordsCount = 0;
            boolean isSpecialChar = true;

            for (int i = 0; i < string.length; i++) {
                
            }

            for (int i = 0; i < string.length; i++) 
            {
                if (Character.isAlphabetic(string[i]) && isSpecialChar) {
                    wordsCount++;
                    isSpecialChar = false;
                }
                else
                {
                    isSpecialChar = true;
                }
            }

            System.out.println(wordsCount);
		}
		
		bi.close();
    }
}

/**

For Input:
2
\t \n \t \n asd  \tnhy \nhgf \twerdsff      \tdfd\nsgsgb   hg
iwzcflsnqcxtm iidrblkiwcwaxmngfycecjr xjyuemjmuoevzqgxscxrqnxvlcbnlujidhehvpwpecmfssfnwe
Your Output is:
20
44

 */
