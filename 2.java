import java.util.*;
public class PiglatinWord
{
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        String str = ob.nextLine();
        str=str.toUpperCase();
        String[] words = str.split(" ");
        for(String st:words){
            System.out.print(convert(st));
            System.out.print(" ");
        }
    }
    static String convert(String word){
        String piglatin="";
        int flag=0;
        for(int i=0;i<word.length();i++)
        {
            char x=word.charAt(i);
            if(x=='A' || x=='E' || x=='I' || x=='O' ||x=='U')
            {
                piglatin=word.substring(i)+word.substring(0,i)+"AY";
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            piglatin=word+"AY";
        }
        return piglatin;
    }
}