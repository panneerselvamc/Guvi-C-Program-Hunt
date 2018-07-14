import java.io.*;
import java.util.*;
class g555
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
            if((i%2==0)&&((b[i]%2)!=0))
            {
                if(count>0)
                System.out.print(" ");
            System.out.print(b[i]);
            count++;
            }
            if(((i%2)!=0)&&(b[i]%2==0))
            {
                if(count>0)
                System.out.print(" ");
                count++;
            System.out.print(b[i]);
            }
        }
    }
}
