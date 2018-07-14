import java.io.*;
import java.util.*;
class g5
{
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        String h=s.nextLine();
        int b[]=new int[a+1];
        int count=0;
        for(int i=0;i<a+1;i++)
        {
            b[i]=s.nextInt();
        }
        for(int i=0;i<a+1;i++)
        {
            for(int j=i+1;j<a+1;j++)
            {
                if(b[i]==b[j])
                {
                    System.out.print(b[i]);
                    count++;
                }
                if(count>0)
                    break;
            }
            if(count>0)
                    break;
        }
        if(count==0)
        System.out.print("unique");
    }
}
