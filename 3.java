import java.util.Scanner;
import java.lang.Math.*;

public class factorial
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number for factorial limit");
        int a= s.nextInt();
        System.out.println("Factorials are: \n");
        if(a==0)
        {
            System.out.println(1);
        }
        else
        {
            int flag=1;
            for(int i=0; i<=a; i++) // loop for record each no. which comes in the way
            {
                for(int j=1; j<=i; j++)
                {
                    flag = flag*j;
                }
                System.out.println(flag);
                flag=1;
           }
        }
    }
}
