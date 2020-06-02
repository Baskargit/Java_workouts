package app;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.stream.Collectors;

// https://practice.geeksforgeeks.org/problems/uncommon-characters/0/
// Execution Time:0.38

public class App 
{
    public static void main (String[] args)
	 {
	    Scanner sc = new Scanner(System.in);
		
		int testcasecount = sc.nextInt();
        sc.nextLine();
        
		while(testcasecount-- > 0)
		{
            String s1 = sc.nextLine();

            String s2 = sc.nextLine();

            HashSet<Character> hashSet1 = new HashSet<Character>();
            HashSet<Character> hashSet2 = new HashSet<Character>();
            
            hashSet1.addAll(s1.chars().mapToObj(e->(char)e).collect(Collectors.toList()));
            hashSet2.addAll(s2.chars().mapToObj(e->(char)e).collect(Collectors.toList()));

            HashSet<Character> hashSet11 = (HashSet<Character>)hashSet1.clone();
            HashSet<Character> hashSet22 = (HashSet<Character>)hashSet1.clone();

            hashSet2.forEach(x -> {

                if (hashSet1.contains(x)) {
                    hashSet11.remove(x);
                    hashSet22.remove(x);
                } else {
                    hashSet11.add(x);
                }
            });

            StringBuilder output = new StringBuilder();

            TreeSet<Character> treeSet = new TreeSet<Character>(hashSet11);

            treeSet.forEach(x -> output.append(x));

            System.out.println(output.toString());
		}
	 }
}

/**
 * 
Input:
iaduai
audsjdsa

Its Correct output is:
ijs

And Your Code's output is:
ij
 */