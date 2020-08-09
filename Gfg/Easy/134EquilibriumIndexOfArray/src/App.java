// https://practice.geeksforgeeks.org/problems/equilibrium-index-of-an-array/1
// Execution Time:1.67

public class App {
    public static void main(String[] args) throws Exception 
    {
        int arr[] = new int[]{12,15,12,13,12,11,16};

        System.out.println(findEquilibrium(arr, arr.length));
    }

    public static int findEquilibrium(int arr[], int n)
    {
        int index = -1;
        int frontSum = 0, rearSum = 0;

        boolean frontDir = true,rearDir = true;
        for (int front = 0,rear = arr.length - 1; front != rear;) 
        {
            frontSum += (frontDir) ? arr[front] : 0;
            rearSum += (rearDir) ? arr[rear] : 0;

            if (frontSum == rearSum) 
            {
                if(front + 1 == rear - 1) 
                {
                    index = front + 1;
                    break;
                }
                else
                {
                    front++;
                    frontDir = true;
                    rearDir = false;
                }
            }
            else if (frontSum > rearSum) 
            {
                frontDir = false;
                rearDir = true;
                rear--;
            }
            else
            {
                frontDir = true;
                rearDir = false;
                front++;
            }
        }

        return index;
    }
}

/**
Input:
7
12 15 12 13 12 11 16

Its Correct output is:
3

And Your Code's output is:
4
 */