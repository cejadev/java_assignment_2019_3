import java.util.Scanner;
import java.lang.Math.*;

public class number
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter total no. of digit in number: ");
        int a=s.nextInt();
        System.out.println("enter a number of your choice: ");
        long b=s.nextLong();
        System.out.println("Enter digit you want to search");
        long c= s.nextLong();
        for(int i=0; i<a; i++ )
        {
            long z= b%10;
            
            if(z==b)
            {
                if(z==c)
                {
                    System.out.println("yes , digit is present!!!!! ");
                    break;
                }
                else
                {
                    System.out.println("digit is not present in number!!!!! ");
                    break;
                }
            }
            else if(z==c)
            {
                System.out.println("yes, digit is present!!!!! ");
                break;
            }
            else
            {
                b=b/10;
            }
            
        }
    }
}
