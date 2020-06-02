import java.util.Arrays;
import java.util.Scanner;

// TLE

public class App {
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
		
		int testcasecount = sc.nextInt();
        sc.nextLine();
        
        int ar[] = new int[99999999];
		
		while(testcasecount-- > 0)
		{
            int n = sc.nextInt();
            
            int arr1[] = new int[n];
            int arr2[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr1[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) 
            {
                arr2[i] = sc.nextInt();
            }
            
            Arrays.sort(arr2);

            int queryCount = sc.nextInt();

            for (int i = 0; i < queryCount; i++) 
            {
                int value = arr1[sc.nextInt()];

                if (value < arr2[0]) {
                    System.out.println(0);
                }
                else if (value > arr2[arr2.length - 1]) {
                    System.out.println(n);
                }
                else {
                    int index = Arrays.binarySearch(arr2, value);
                    System.out.println((index < 0) ? 0 : index + 1);
                }
                
            }

		}
    }
}
