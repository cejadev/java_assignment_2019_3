import java.util.*;
class PiglatinWord
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
        for(int i=0;i<word.length();i++)
        {
            char x=word.charAt(i);
            if(i==0){
            if(x=='A' || x=='E' || x=='I' || x=='O' ||x=='U'){
                piglatin = word+"WAY";
                break;
            }}
	        if(x=='A' || x=='E' || x=='I' || x=='O' ||x=='U')
            {
                piglatin=word.substring(i)+word.substring(0,i)+"AY";
                break;
            }
            else{
                piglatin= word+"AY";
            }

        }
        return piglatin;
    }
}
