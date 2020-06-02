import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
		
		int testcasecount = sc.nextInt();
        sc.nextLine();
        
		while(testcasecount-- > 0)
		{
            int noOfWords = sc.nextInt();
            sc.nextLine();
            
            String inputString = sc.nextLine();

            String[] words = inputString.split(" ");

            Hashtable<String,Integer> hashtable = new Hashtable<String,Integer>();

            for (int i = 0; i < words.length; i++) 
            {
                if (hashtable.containsKey(words[i])) {
                    hashtable.replace(words[i], hashtable.get(words[i]) + 1);
                }
                else {
                    hashtable.put(words[i], 1);
                }
            }

            int counter = 0;

            for(Map.Entry<String, Integer> keyValuePair : hashtable.entrySet())
            {
                counter = (keyValuePair.getValue() == 2) ? counter + 1 : counter;
            }
            
            System.out.println(counter);
		}
    }
}
