// https://practice.geeksforgeeks.org/problems/counting-sort/1
// Execution Time:0.59

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        //char seq[] = new char[]{'e','d','s','a','b'};
        char seq[] = new char[]{'z','z','z','a','a'};

        System.out.println(countSort(seq));
    }

    // Function to do count sort
    // seq[]: input array
    // return the sorted input array of character
    public static char[] countSort(char seq[])
    {
        char sorted[] = new char[seq.length];
        int count[] = new int[26];

        for (int i = 0; i < seq.length; i++) 
        {
            count[seq[i] - 'a']++;    
        }

        for (int i = 1; i < count.length; i++) 
        {
            count[i] += count[i - 1];    
        }

        for (int i = 0; i < seq.length; i++) 
        {
            sorted[(count[seq[i] - 'a']--) - 1] = seq[i];    
        }

        return sorted;
    }
}
