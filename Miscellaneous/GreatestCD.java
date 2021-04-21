import java.util.Scanner;
public class GreatestCD
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no. of numbers: ");
        int n = input.nextInt();
        int [] numbers = new int[n];
        System.out.print("Enter numbers to get their GCD: ");
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = input.nextInt();

        System.out.println("The GCD is " + gcd(numbers));

    }

    public static int gcd(int... numbers)
    {
        int gcd = 1;
        int min = getMin(numbers);
        int length = numbers.length - 1;
        int count = 0;
        for (int i = 2; i <= min; i++)
        {
            for (int k = 0; k <= length; k++)
            {
                if (numbers[k] % i == 0)
                {
                    count++;
                    if (count == length)
                        gcd = i;
                }
                else
                    count = 0;
            }
        }
        return gcd;
    }

    public static int getMin(int[] a)
    {
        int min = a[0];
        for (int i = 0; i < a.length; i++)
        {
            if (min > a[i])
                min = a[i];
        }
        return min;
    }
}