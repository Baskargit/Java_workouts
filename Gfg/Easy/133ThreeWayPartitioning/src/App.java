import java.util.ArrayList;

// https://practice.geeksforgeeks.org/problems/three-way-partitioning/1
// Execution Time:1.8

public class App {
    public static void main(String[] args) throws Exception 
    {
        ArrayList<Integer> A = new ArrayList<Integer>();
        A.add(1);
        A.add(2);
        A.add(3);
        A.add(3);
        A.add(4);

        System.out.println(threeWayPartition(A, 1, 2));
    }

    public static ArrayList<Integer> threeWayPartition(ArrayList<Integer> A, int a, int b)
	{
        ArrayList<Integer> part1 = new ArrayList<Integer>();
        ArrayList<Integer> part2 = new ArrayList<Integer>();
        ArrayList<Integer> part3 = new ArrayList<Integer>();

        for (Integer integer : A) 
        {
            if (integer < a) 
            {
                part1.add(integer);
            }
            else if (integer >= a && integer <= b) 
            {
                part2.add(integer);
            }
            else
            {
                part3.add(integer);
            }
        }

        ArrayList<Integer> finalArray = new ArrayList<Integer>();
        finalArray.addAll(part1);
        finalArray.addAll(part2);
        finalArray.addAll(part3);

        return finalArray;
    }
}
