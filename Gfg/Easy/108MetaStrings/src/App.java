import java.util.HashMap;

public class App 
{

	public static void main(String[] args) 
	{
		int a = 10;
		
		HashMap<Integer, Test> hashMap = new HashMap<Integer,Test>();
		
		Test tes = new Test();
		tes.a = 1;
		tes.b = 2;
		
		hashMap.put(1, tes);
		
		System.out.println("Hello world" + a);
	}
	
}

class Test
{
	public int a;
	public int b;
}
