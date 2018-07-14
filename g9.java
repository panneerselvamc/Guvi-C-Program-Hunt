import java.io.*;
import java.util.*;
class g9
{
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        String a=s.next();
        String b=s.next();
        String str="";
        String temp="";
        if(a.length()>b.length())
        {
            temp=a;
            a=b;
            b=temp;
        }
        
        for(int i=0;i<a.length();i++)
        {
            String k=a.substring(0,i+1);
            String l="";
            for(int j=i;j<=i;j++)
            {
                l=b.substring(0,j+1);
            }
            if(k.equals(l))
            str=k;
        }
        System.out.print(Math.abs(str.length()-b.length()));
    }
}
