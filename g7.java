import java.io.*;
import java.util.*;
class g7
{
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int aa=s.nextInt();
        String h=s.nextLine();
        int count=0,t=0;
        String b=s.nextLine();
        String bb=s.nextLine();
        for(int i=0;i<bb.length();i++)
        {
            char d=bb.charAt(i);
            if(b.contains(String.valueOf(d)))
            {
                count++;
            }
        }
        if(count==bb.length())
        System.out.print("YES");
        else
        System.out.print("NO");
    }
}
        
