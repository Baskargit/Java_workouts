import java.util.Stack;

// https://practice.geeksforgeeks.org/problems/sort-a-stack/1/
// Execution Time:0.59

public class App 
{

	public static void main(String[] args) 
	{
		Stack<Integer> s = new Stack<Integer>();
		s.push(11);
		s.push(2);
		s.push(32);
		s.push(3);
		s.push(41);
		
		sort(s);
	}
	
	public static Stack<Integer> sort(Stack<Integer> s)
	{
		Integer array[] = new Integer[s.size()];
		array = s.toArray(array);
		
		s.clear();
		
		for (int i = 0; i < array.length; i++) 
		{
			for (int j = i + 1; j < array.length; j++) 
			{
				if (array[j] < array[i]) 
				{
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
			
			s.push(array[i]);
		}
		
		return s;
	}
}
