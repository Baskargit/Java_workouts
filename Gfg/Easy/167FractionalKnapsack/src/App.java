import java.util.concurrent.atomic.AtomicReference;

// https://practice.geeksforgeeks.org/problems/fractional-knapsack-1587115620/1#
// Time Limit Exceeded
// Expected Time Limit 5.04sec

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        Item arr[] = new Item[3];
        arr[0] = new Item(60, 10);
        arr[1] = new Item(100, 20);
        arr[2] = new Item(120, 30);
        int W = 50;

        System.out.println(fractionalKnapsack(W, arr, arr.length));
    }

    public static double fractionalKnapsack(int W, Item arr[], int n) 
    {
        AtomicReference<Double> maxValue = new AtomicReference<Double>(0.0);
        knapsack(arr, W, 0, 0, 0, maxValue);
        return maxValue.get();
    }

    public static void knapsack(Item arr[],int maxWeight,double currentWeight,double currentValue,int currentN,AtomicReference<Double> maxValue)
    {
        if (currentN < arr.length) 
        {
            knapsack(arr, maxWeight, currentWeight + arr[currentN].weight, currentValue + arr[currentN].value, currentN + 1,maxValue);

            if (currentWeight + arr[currentN].weight >= maxWeight) 
            {
                // Select possible fractions from the item
                
                double remaining = maxWeight - currentWeight;
                double fractionValue = ((remaining / ((double)arr[currentN].weight/100.0)) * arr[currentN].value/ 100.0);

                knapsack(arr, maxWeight, maxWeight, currentValue + fractionValue, currentN + 1, maxValue);
            }

            knapsack(arr, maxWeight, currentWeight, currentValue, currentN + 1,maxValue);
        }

        if (currentWeight <= maxWeight) 
        {
            if (currentValue > maxValue.get()) 
            {
                maxValue.set(currentValue);
            }
        }
    }
}

class Item 
{
    int value, weight;
    
    Item(int x, int y)
    {
        this.value = x;
        this.weight = y;
    }
}
