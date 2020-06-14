import java.util.LinkedList;
import java.util.Scanner;

// https://practice.geeksforgeeks.org/problems/decode-the-pattern/0
// Execution Time:0.32

public class App {
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
		
		int testcasecount = sc.nextInt();
		sc.nextLine();
		
		while(testcasecount-- > 0)
		{
            int n = sc.nextInt();

            LinkedList<String> linkedList = new LinkedList<String>();
            linkedList.add("1");

            String previousNode = "1";

            for (int i = 1; i <= 20; i++) 
            {
                StringBuilder stringBuilder = new StringBuilder();

                for (int j = 0; j < previousNode.length(); j++) 
                {
                    char a = (char)previousNode.charAt(j);
                    int count = 1;
                    boolean iterated = false;

                    while (j + 1 < previousNode.length() && a == previousNode.charAt(j+1))
                    {
                        iterated = true;
                        count++;
                        j++;
                    }
                    
                    stringBuilder.append(count);
                    stringBuilder.append(a);                    
                }

                linkedList.add(stringBuilder.toString());
                previousNode = stringBuilder.toString();
            }

            System.out.println(linkedList.get(n + 1));
		}
		
		sc.close();
    }
}
