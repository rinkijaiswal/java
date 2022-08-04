import java.io.*;
public class Addition
{
public static void main(String[]args)throws IOException
{
int a,b,c,d,e,f,g;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter two values");
 a=Integer.parseInt(br.readLine());
 b=Integer.parseInt(br.readLine());
c=a+b;
d = a-b;
e = a*b;
f = a/b;
g = a % b;
System.out.println("Sum:="+c);
System.out.println("sub:="+d);
System.out.println("mul:="+e);
System.out.println("div:="+f);
System.out.println("mod:="+g);
}
}
