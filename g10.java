import java.io.*;
import java.util.*;
class g10
{
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        char b[]=a.toCharArray();
        for(int i=0;i<b.length-1;i++)
        {
            char t='h';
            t=b[i];
            b[i]=b[i+1];
            b[i+1]=t;
        }
        for(int i=0;i<b.length;i++)
        System.out.print(b[i]);
    }
}
