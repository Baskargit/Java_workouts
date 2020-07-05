import java.io.BufferedReader;
import java.io.InputStreamReader;

// https://practice.geeksforgeeks.org/problems/stickler-theif/0
// Wrong answer

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            int n = Integer.parseInt(bi.readLine().trim());
            
            String string[] = bi.readLine().trim().split(" ");

            int money[] = new int[n];
            boolean isLootable[] = new boolean[n];

            int firstMax = 0,firstMaxIndex = -1;
            for (int i = 0; i < n; i++) 
            {
                isLootable[i] = true;
                money[i] = Integer.parseInt(string[i]);

                if (money[i] > firstMax) 
                {
                    firstMax = money[i];
                    firstMaxIndex = i;
                }
            }

            isLootable[firstMaxIndex] = false;
            if (firstMaxIndex - 1 >= 0) 
            {
                isLootable[firstMaxIndex - 1] = false;
            }
            if (firstMaxIndex + 1 < n) 
            {
                isLootable[firstMaxIndex + 1] = false;
            }

            int totalMoney = firstMax;

            while (true) 
            {
                int tempmax = 0,tempIndex = -1;

                for (int i = 0; i < n; i++) 
                {
                    if (isLootable[i]) 
                    {
                        if (money[i] > tempmax) 
                        {
                            tempmax = money[i];
                            tempIndex = i;
                        }
                    }
                }

                if (tempIndex != -1) 
                {
                    totalMoney += money[tempIndex];

                    if (tempIndex - 1 >= 0) 
                    {
                        isLootable[tempIndex - 1] = false;
                    }
                    if (tempIndex + 1 < n) 
                    {
                        isLootable[tempIndex + 1] = false;
                    }

                    isLootable[tempIndex] = false;
                }
                else
                {
                    break;
                }
            }

            System.out.println(totalMoney);
		}
		
		bi.close();
    }
}
