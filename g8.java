import java.io.*;
import java.util.*;
class g5
{
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        String h=s.nextLine();
        int count=0;
        String str="";
        String b[]=new String[a];
        for(int i=0;i<a;i++)
        {
            b[i]=s.nextLine();
        }
        for(int i=0;i<b[0].length();i++)
        {
            count=0;
            String k=b[0].substring(0,i+1);
            for(int j=0;j<a;j++)
            {
                String l=b[j].substring(0,i+1);
                if(k.equals(l))
                count++;
            }
            //System.out.println(count+k);
            if(count==a)
            str=k;
        }
        System.out.print(str);
    }
}
        
