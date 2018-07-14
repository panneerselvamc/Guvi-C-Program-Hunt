import java.io.*;
import java.util.*;
class g3
{
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        String h=s.nextLine();
        int b[]=new int[a];
        int count=0;
        for(int i=0;i<a;i++)
        {
            b[i]=s.nextInt();
        }
          for(int i=0;i<a;i++)
        {
            if(count>0)
            System.out.print(" ");
            if(i==b[i])
            {
            System.out.print(b[i]);
            count++;
            }
        }
        if(count==0)
        System.out.print("-1");
    }
}
