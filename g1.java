import java.io.*;
import java.util.*;
class g1
{
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        String nn=s.nextLine();
        int l=0,cnt=0;
        int b[]=new int[a];
        int c[]=new int[a];
        for(int i=0;i<a;i++)
        {
            b[i]=s.nextInt();
        }
        for(int i=0;i<a;i++)
        {
            for(int j=i+1;j<a;j++)
            {
                if(b[i]==b[j])
                {
                    c[l]=b[i];
                    l++;
                    break;
                }
            }
        }
        int x[]=new int[l];
        for(int i=0;i<l;i++)
        {
            x[i]=c[i];
        }
        Arrays.sort(x);
        for(int i=0;i<l-cnt-1;i++)
        {
        if(x[i]!=x[i+1])
        System.out.print(x[i]+" ");
        if(i==l-2)
        System.out.print(x[i]);
        }
    }
}
