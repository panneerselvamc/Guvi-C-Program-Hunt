import java.io.*;
import java.util.*;
class g66
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
            for(int j=i+1;j<a;j++)
            {
                for(int k=j+1;k<a;k++)
                {
                    if(b[i]+b[j]==b[k])
                    {
                        if(count>0)
                        System.out.println();
                    System.out.print(b[i]+" "+b[j]+" "+b[k]);
                    count++;
                    }
                }
            }
        }
    }
}
