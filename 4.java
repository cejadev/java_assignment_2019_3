import java.util.Scanner;
import java.lang.Math.*;

public class Sum
{
    static int sum_digit(int n, int k)
    {
        int d=0;
        int x=0;
        for(int j=0; j<=k; j++)
        {
            x= n%10;
            d = d+x;
            n= (n/10);
        }
        return d;
    }
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a= s.nextInt();
        System.out.println("enter length of digit: ");
        int b= s.nextInt();
        int z= sum_digit(a,b);
        System.out.println(z);
        
    }
}
