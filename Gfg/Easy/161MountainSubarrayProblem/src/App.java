import java.util.ArrayList;

// https://practice.geeksforgeeks.org/problems/mountain-subarray-problem/1
// Logic correct but always showing same answer

public class App {
    public static void main(String[] args) throws Exception 
    {
        
    }

    public ArrayList<Boolean> processQueries(int[] a, int n, ArrayList<Pair> queries,int q) 
    {
        ArrayList<Boolean> result = new ArrayList<Boolean>(q);

        for (int i = 0; i < queries.size(); i++) 
        {
            Pair range = queries.get(i);
            
            boolean isInc = true, isDec = true, isAlt = true;
            int inc = a[range.l] , dec = a[range.l];
            int counter = 1;

            for (int j = range.l + 1; j <= range.r; j++) 
            {
                if (isInc) 
                {
                    isInc = (a[j] > inc) ? true : false;
                    inc = a[j];
                }

                if (isDec) 
                {
                    isDec = (a[j] < dec) ? true : false;
                    dec = a[j];
                }

                if (isAlt) 
                {
                    if (++counter == 2) 
                    {
                        if (j + 1 < a.length) 
                        {
                            isAlt = (a[j] > a[j -1] && a[j] > a[j+1]) ? true : false;
                        }
                        else
                        {
                            isAlt = (a[j] > a[j - 1]) ? true : false;
                        }

                        counter = 0;
                    }
                    
                }

                if (!isInc && !isDec && !isAlt) 
                {
                    break;
                }
            }

            result.add((isInc || isDec || isAlt) ? true : false);
        }

        return result;
    }
}

class Pair
{
    int l,r;

    public Pair(int l,int r) 
    {
        this.l = l;
        this.r = r;
    }
}

/**
Input:
16
20100 18567 28921 1674 15070 22105 30501 27861 26854 23860 16321 15477 11502 10759 4293 3626
16
13 14
3 14
8 8
3 5
0 3
2 6
10 10
14 14
3 15
7 11
10 10
9 9
14 15
11 11
9 12
7 10

Its Correct output is:
Yes
Yes
Yes
Yes
No
No
Yes
Yes
Yes
Yes
Yes
Yes
Yes
Yes
Yes
Yes

And Your Code's output is:
Yes
No
 */

