import java.io.*;
import java.util.*;
class g4
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
            count=0;
            for(int j=0;j<a;j++)
            {
                if(b[i]==b[j])
                count++;
            }
            if(count==1)
            System.out.print(b[i]);
        }
    }
}
