import java.io.BufferedReader;
import java.io.InputStreamReader;

// https://practice.geeksforgeeks.org/problems/does-robot-moves-circular/0
// Not solved 
// Wrong answer

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            String moves = bi.readLine();
            
            char firstTurn;
            int frontIndex = -1,lastIndex = -1;

            if (moves.indexOf('G') != -1) 
            {
                if (moves.indexOf('L') != -1) 
                {
                    frontIndex = moves.indexOf('L');
                    firstTurn = 'L';
                }
                else {
                    frontIndex = moves.indexOf('R');
                    firstTurn = (frontIndex != -1) ? 'R' : '\0';
                }

                if (frontIndex != -1) 
                {
                    lastIndex = moves.lastIndexOf(firstTurn);

                    if (lastIndex != frontIndex) 
                    {
                        if (firstTurn == 'R' && moves.lastIndexOf('L') < lastIndex) 
                        {
                            System.out.println("Circular");
                        }
                        else if(firstTurn == 'L' && moves.lastIndexOf('R') < lastIndex)
                        {
                            System.out.println("Circular");
                        }
                        else
                        {
                            System.out.println("Not Circular");
                        }   
                    }
                    else
                    {
                        System.out.println("Not Circular");
                    }   
                } 
                else {
                    System.out.println("Not Circular");
                }
            }
            else {
                System.out.println("Not Circular");
            }
		}
		
		bi.close();
    }
}

/**
Input:
GLRGRLGGLR

Its Correct output is:
Not Circular

And Your Code's output is:
Circular
 */
