import java.util.ArrayList;
import java.util.HashMap;

// https://practice.geeksforgeeks.org/problems/match-specific-pattern/1
// Execution Time:0.39

public class App {
    public static void main(String[] args) throws Exception
    {
        // Functional problem
        
        String pattern = "foo";
        ArrayList<String> dict = new ArrayList<String>();
        dict.add("abb");
        dict.add("abc");
        dict.add("xyz");
        dict.add("xyy");

        dict = findMatchedWords(dict, pattern);

        System.out.println(dict);
    }

    public static ArrayList<String> findMatchedWords(ArrayList<String> dict, String pattern)
    {
        ArrayList<String> matchedWords = new ArrayList<String>();

        HashMap<Character,Character> hashMap = new HashMap<Character,Character>();

        char patt[] = pattern.toCharArray();

        for (String word : dict) 
        {
            if (word.length() == pattern.length())
            {
                char wordChar[] = word.toCharArray();

                boolean isMatched = true;

                for (int i = 0; i < patt.length; i++) 
                {
                    if (hashMap.containsKey(patt[i])) 
                    {
                        if (hashMap.get(patt[i]) != wordChar[i]) {
                            isMatched = false;
                            break;
                        }
                    }
                    else
                    {
                        hashMap.put(patt[i], wordChar[i]);
                    }
                }

                if (isMatched) {
                    matchedWords.add(word);
                }
            }
            
            hashMap.clear();
        }

        return matchedWords;
    }
}
