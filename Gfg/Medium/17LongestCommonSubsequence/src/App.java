import java.util.HashMap;
import java.util.LinkedList;

// https://practice.geeksforgeeks.org/problems/longest-common-subsequence-1587115620/1/?difficulty[]=1&page=1&query=difficulty[]1page1#
// Not completed [Invalid output]

// For output verification : https://ide.geeksforgeeks.org/cD7ubxncSq

public class App {
    public static void main(String[] args) throws Exception 
    {
        // String s1 = "ABCDGH";
        // String s2 = "AEDFHR";

        // String s1 = "ABC";
        // String s2 = "AC";

        // String s1 = "UBZVAFSPQPQ";
        // String s2 = "WUZIF";

        // String s1 = "XXPOHRYSQ";
        // String s2 = "IXLDPKIVXVITPVHATB";

        String s1 = "ILQEELSSTFMKDTAT";
        String s2 = "KAOBFORCTUQBJYKTMAYQNQKHXYTARWVDY";

        System.out.println(lcs(s1.length(),s2.length(),s1,s2));
    }

    
    public static int lcs(int p, int q, String s1, String s2)
    {
        int l1 = getLcs(p, q, s1, s2);
        int l2 = getLcs(q, p, s2, s1);

        return l1 > l2 ? l1 : l2;
    }

    public static int getLcs(int p, int q, String s1, String s2)
    {
        HashMap<Character,LinkedList<Integer>> hashMap = new HashMap<Character,LinkedList<Integer>>();

        for (int i = 0; i < s1.length(); i++) 
        {
            if (hashMap.containsKey(s1.charAt(i))) 
            {
                hashMap.get(s1.charAt(i)).add(i);
            }
            else
            {
                LinkedList<Integer> indexList = new LinkedList<Integer>();
                indexList.add(i);
                hashMap.put(s1.charAt(i), indexList);
            }
        }

        int length = 0;
        StringBuilder longestSubsequence = new StringBuilder();

        for (int i = 0; i < s2.length(); i++) 
        {
            if (s2.charAt(i) == 'Q') 
            {
                System.out.print("");
            }
            int tempLength = 0;
            int previousIndex = -1;
            StringBuilder tempSubsequence = new StringBuilder();

            for (int j = i; j < s2.length(); j++) 
            {
                if (hashMap.containsKey(s2.charAt(j))) 
                {
                    LinkedList<Integer> indexList = hashMap.get(s2.charAt(j));

                    if (indexList.size() > 1) 
                    {
                        int tempPreviousIndex = -1;

                        for (Integer index : indexList) 
                        {
                            if (index > previousIndex) 
                            {
                                tempPreviousIndex = index;
                                break;
                            }
                        }

                        if (tempPreviousIndex != -1 && tempPreviousIndex > previousIndex) 
                        {
                            tempLength++;
                            previousIndex = tempPreviousIndex;

                            tempSubsequence.append(s2.charAt(j));
                        }                        
                    }
                    else
                    {
                        if (indexList.get(0) > previousIndex) 
                        {
                            tempLength++;
                            previousIndex = indexList.get(0);

                            tempSubsequence.append(s2.charAt(j));
                        }
                    }
                }
            }

            if (tempLength > length) 
            {
                longestSubsequence.setLength(0);
                longestSubsequence.append(tempSubsequence.toString());
            }

            length = (tempLength > length) ? tempLength : length;
        }
    
        System.out.println(longestSubsequence.toString());
        return length;
    }

    public static int excludedLength(String s,HashMap<Character,LinkedList<Integer>> hashMap,int currentIndex,int lastMatchingIndex)
    {
        int length = 0;

        for (int i = currentIndex + 1; i < s.length(); i++) 
        {

        }

        return length;
    }
}

/**

Input:
11 5
UBZVAFSPQPQ
WUZIF

Its Correct output is:
3

And Your Code's output is:
2

*/

/**
Input:
27 12
GEBEOCFUFTSXDIXTIGSIEEHKCHZ
DFLILRJQFNXZ

Its Correct output is:
4

And Your Code's output is:
6
*/

/**
Input:
9 18
XXPOHRYSQ
IXLDPKIVXVITPVHATB

Its Correct output is:
4

And Your Code's output is:
3
*/

/**
Input:
16 33
ILQEELSSTFMKDTAT
KAOBFORCTUQBJYKTMAYQNQKHXYTARWVDY

Its Correct output is:
6 (QTMKTA)

And Your Code's output is:
5
*/

/**
import java.util.HashMap;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception 
    {
        String s1 = "ABCDGH";
        String s2 = "AEDFHR";

        // String s1 = "ABC";
        // String s2 = "AC";

        // String s1 = "UBZVAFSPQPQ";
        // String s2 = "WUZIF";

        // String s1 = "GEBEOCFUFTSXDIXTIGSIEEHKCHZ";
        // String s2 = "DFLILRJQFNXZ";

        System.out.println(lcs(s1.length(),s2.length(),s1,s2));
    }

    
    public static int lcs(int p, int q, String s1, String s2)
    {
        HashMap<Character,LinkedList<Status>> hashMap = new HashMap<Character,LinkedList<Status>>();

        for (int i = 0; i < s1.length(); i++) 
        {
            if (hashMap.containsKey(s1.charAt(i))) 
            {
                hashMap.get(s1.charAt(i)).add(new Status(i));
            }
            else
            {
                LinkedList<Status> indexList = new LinkedList<Status>();
                indexList.add(new Status(i));
                hashMap.put(s1.charAt(i), indexList);
            }
        }

        int length = 0;
        StringBuilder longestSubsequence = new StringBuilder();

        for (int i = 0; i < s2.length(); i++) 
        {
            HashMap<Character,LinkedList<Status>> tempHashMap = new HashMap<>();
            tempHashMap.putAll(hashMap);
            
            int tempLength = 0;
            int previousIndex = -1;
            StringBuilder tempSubsequence = new StringBuilder();

            for (int j = i; j < s2.length(); j++) 
            {
                if (tempHashMap.containsKey(s2.charAt(j))) 
                {
                    LinkedList<Status> indexList = tempHashMap.get(s2.charAt(j));

                    if (indexList.size() > 1) 
                    {
                        int tempPreviousIndex = -1;

                        for (Status status : indexList) 
                        {
                            if (!status.used && status.index > previousIndex) 
                            {
                                tempPreviousIndex = status.index;
                                status.used = true;
                                break;
                            }    
                        }

                        if (tempPreviousIndex != -1 && tempPreviousIndex > previousIndex) 
                        {
                            tempLength++;
                            previousIndex = tempPreviousIndex;
                            tempSubsequence.append(s2.charAt(j));
                        }
                        
                        //tempLength += (indexList.getLast() >= j) ? 1 : 0;
                    }
                    else
                    {
                        if (indexList.get(0).index > previousIndex && !indexList.get(0).used) 
                        {
                            tempLength++;
                            previousIndex = indexList.get(0).index;
                            indexList.get(0).used = true;
                            tempSubsequence.append(s2.charAt(j));
                        }

                        //tempLength += (indexList.get(0) >= j) ? 1 : 0; 
                    }
                }
            }

            if (tempLength > length) 
            {
                longestSubsequence.setLength(0);
                longestSubsequence.append(tempSubsequence.toString());
            }

            length = (tempLength > length) ? tempLength : length;
        }

        System.out.println(longestSubsequence.toString());
        return length;
    }
}

class Status
{
    int index;
    boolean used;

    public Status(int ind)
    {
        index = ind;
        used = false;
    }
}

 */


