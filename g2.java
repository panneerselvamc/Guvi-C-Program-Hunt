import java.io.*;
import java.util.*;
class g2
{
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        String h=s.nextLine();
        int b[]=new int[a];
        for(int i=0;i<a;i++)
        {
            b[i]=s.nextInt();
        }
        Arrays.sort(b);
        String c="";
        for(int i=a-1;i>=0;i--)
        c=c+String.valueOf(b[i]);
        System.out.print(c);
    }
}
