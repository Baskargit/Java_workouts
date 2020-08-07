import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

// https://practice.geeksforgeeks.org/problems/count-pairs-whose-sum-is-equal-to-x/1
// Execution Time:2.34

public class App {
    public static void main(String[] args) throws Exception 
    {
        // Functional problem

        int x = 1692;

        LinkedList<Integer> head1 = new LinkedList<Integer>();
        //head1.add(1);head1.add(2);head1.add(3);head1.add(4);head1.add(5);head1.add(6);

        LinkedList<Integer> head2 = new LinkedList<Integer>();
        //head2.add(11);head2.add(12);head2.add(13);

        String string1[] = "1792 129 1412 4485 2055 4616 1289 906 5518 918 4880 5010 2452 2837 1415 1175 3608 4891 2524 2247 1925 4464 2118 4316 3115 3281 2738 1070 1455 5681 3250 2654 1718 1208 3513 1866 3456 1141 1856 5046 198 199 714 4938 1611 3847 5309 5971 2388 1750 5591 3801 829 1244 2142 2912 5859 3557 4071 5738 2663 492 2029 5742 2159 2544 4978 5493 5878 2935 5242 4475 1276 5994 5374".split(" ");
        String string2[] = "4225 773 4722 522 4880 1816 3348 3733 1688 5018 3887 704 1821 671 4384 4385 2210 5411 5028 4229 4390 1447 168 3825 172 1459 4014 2095 3120 177 1843 5688 2489 3871 2877 4554 160 2251 1966 5062 5961 1354 2123 5326 5199 2768 1361 563 4183 2428 1630 5088 272 2811 484 869 998 359 1788 5867 4972 2029 2414 4351 5745 626 1651 2932 5493 4728 3321 1176 1696 4604 21".split(" ");
        
        for (String string : string1) 
        {
            head1.add(Integer.parseInt(string));    
        }

        for (String string : string2) 
        {
            head2.add(Integer.parseInt(string));    
        }
        
        System.out.println(countPairs(head1, head2, x));
    }

    public static int countPairs(LinkedList<Integer> head1, LinkedList<Integer> head2,int x) 
    {
        int count = 0;

        HashSet<Integer> hashSet = new HashSet<Integer>();

        Iterator<Integer> iterator = head1.iterator();

        while (iterator.hasNext()) 
        {
            hashSet.add(iterator.next());
        }

        iterator = head2.iterator();

        while (iterator.hasNext()) 
        {
            int val = iterator.next();

            if (hashSet.contains(x - val))
            {
                count++;
            }
        }

        return count;
    }
}

/**
Input:
75
1792 129 1412 4485 2055 4616 1289 906 5518 918 4880 5010 2452 2837 1415 1175 3608 4891 2524 2247 1925 4464 2118 4316 3115 3281 2738 1070 1455 5681 3250 2654 1718 1208 3513 1866 3456 1141 1856 5046 198 199 714 4938 1611 3847 5309 5971 2388 1750 5591 3801 829 1244 2142 2912 5859 3557 4071 5738 2663 492 2029 5742 2159 2544 4978 5493 5878 2935 5242 4475 1276 5994 5374
75
4225 773 4722 522 4880 1816 3348 3733 1688 5018 3887 704 1821 671 4384 4385 2210 5411 5028 4229 4390 1447 168 3825 172 1459 4014 2095 3120 177 1843 5688 2489 3871 2877 4554 160 2251 1966 5062 5961 1354 2123 5326 5199 2768 1361 563 4183 2428 1630 5088 272 2811 484 869 998 359 1788 5867 4972 2029 2414 4351 5745 626 1651 2932 5493 4728 3321 1176 1696 4604 21
1692

Its Correct output is:
1

And Your Code's output is:
4
 */

