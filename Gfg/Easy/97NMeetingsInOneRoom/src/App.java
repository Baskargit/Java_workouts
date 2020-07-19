import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

// https://practice.geeksforgeeks.org/problems/n-meetings-in-one-room/0
// Execution Time:0.3

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
                timings.position = i+1;

                array[i] = timings;
            }

            Arrays.sort(array);

            StringBuilder output = new StringBuilder();
            output.append(array[0].position + " ");

            int prevEndTime = array[0].EndTime;
            for (int i = 1; i < n; i++)
            {
                if (array[i].StartTime > prevEndTime) 
                {
                    output.append(array[i].position + " ");
                    prevEndTime = array[i].EndTime;
                }
            }

            System.out.println(output.toString());
		}
		
		bi.close();
    }

    public class Timings implements Comparable<Timings>
    {
        public Integer StartTime;
        public Integer EndTime;
        public Integer position;

        @Override
        public int compareTo(Timings o) 
        {    
            return this.EndTime.compareTo(o.EndTime);
        }
    }
}
