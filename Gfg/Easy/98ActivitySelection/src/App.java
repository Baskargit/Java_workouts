import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

// https://practice.geeksforgeeks.org/problems/activity-selection/0
// Execution Time:0.15

public class App {
    public static void main(String[] args) throws Exception 
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int testcasecount = Integer.parseInt(bi.readLine());
		
		while(testcasecount-- > 0)
		{
            int n = Integer.parseInt(bi.readLine().trim());
            
            String startTimings[] = bi.readLine().trim().split(" ");
            String endTimings[] = bi.readLine().trim().split(" ");

            App app = new App();

            Timings array[] = new Timings[n];
            for (int i = 0; i < n; i++) 
            {
                Timings timings = app.new Timings();
                timings.StartTime = Integer.parseInt(startTimings[i]);
                timings.EndTime = Integer.parseInt(endTimings[i]);

                array[i] = timings;
            }

            Arrays.sort(array);

            int totalCount = 1;
            int prevEndTime = array[0].EndTime;
            for (int i = 1; i < n; i++)
            {
                if (array[i].StartTime >= prevEndTime) 
                {
                    totalCount++;
                    prevEndTime = array[i].EndTime;
                }
            }

            System.out.println(totalCount);
		}
		
		bi.close();
    }

    public class Timings implements Comparable<Timings>
    {
        public Integer StartTime;
        public Integer EndTime;

        @Override
        public int compareTo(Timings o) 
        {    
            return this.EndTime.compareTo(o.EndTime);
        }
    }
}
