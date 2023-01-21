/* There are n bulbs that are initially off... You first turn on all the bulbs, then you turn off every second bulb... On the third round, you toggle every third bulb (turning on if it's off or turning off if it's on)... For the ith round, you toggle every i bulb. For the nth round, you only toggle the last bulb... Return the number of bulbs that are on after n rounds...
 * Eg 1: n = 3                         Output = 1
 * Eg 2: n = 4                         Output = 2
 * Eg 3: n = 1                         Output = 1
 * Eg 4: n = 0                         Output = 0
 */
import java.util.*;
public class Bulb
{
    public int BulbSwitch(int n)
    {
        int On = 0;
        int arr[] = new int[n];
        for(int i = 1; i <= n; i++)
        {
            for(int j = i; j <= n; j++)   // Iterating for nth bulb...
            {
                if(j % i == 0)
                {
                    if(arr[j-1] == 0)   // Toggling bulb...
                        arr[j-1] = 1;
                    else
                        arr[j-1] = 0;   // Toggling bulb...
                }
            }
        }
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == 1)
                On++;   // Calculating number of bulbs on after ith round...
        }
        return On;
    }
    public int BulbSwitchOptimal(int n)
    {
        if(n <= 1)
            return n;
        return (int)(Math.sqrt(n));    // Mathematical relation of the problem...
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the number of bulbs : ");
        n = sc.nextInt();
        Bulb bulb = new Bulb();
        System.out.println("Enter the total number of bulbs On : "+bulb.BulbSwitch(n));
        System.out.println("Enter the total number of bulbs On (Optimally) : "+bulb.BulbSwitchOptimal(n));
        sc.close();
    }
}

// Time Complexity  - O(1) time...
// Space Complexity - O(1) space...

/* DEDUCTIONS :- 
 * 1. Can be solved by applying mathematics, create test cases up to 9 and it will give you the relation of the number of bulbs on to n...
*/