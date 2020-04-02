package algorithm;

//https://www.geeksforgeeks.org/greedy-algorithm-to-find-minimum-number-of-coins/
// Java program to find minimum number of denominations
import java.util.Vector;

class MinimumCoins
{

    // All denominations of Indian Currency
    static int deno[] = {1, 2, 5, 10, 20, 50, 100, 500, 1000};
    static int n = deno.length;

    static Vector<Integer> findMin(int V)
    {
        // Initialize result
        Vector<Integer> ans = new Vector<>();

        // Traverse through all denomination
        for (int i = n - 1; i >= 0; i--)
        {
            // Find denominations
            while (V >= deno[i])
            {
                V -= deno[i];
                ans.add(deno[i]);
            }
        }

        return ans;
    }
}

