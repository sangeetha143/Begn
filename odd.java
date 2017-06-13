import java.io.*;
import java.util.*;
class odd
{
public static void main(String arg[])
{
int num;
Scanner ob=new Scanner(System.in);
num=ob.nextInt();
if(num==0)
{
System.out.println("zero");
}
else
{
if(num%2==0)
{
System.out.println("even");
}
else
{
System.out.println("odd");
}
}
}
