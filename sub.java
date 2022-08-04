import java.io.*;
class sub
{
public static void main(String args[])throws IOException
{
BufferedReader td=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter two number");
 int a=Integer.parseInt(td.readLine());
int b=Integer.parseInt(td.readLine());
 int c=a+b;
System.out.println("Sum of "+a+" and "+b+" is "+c);
}
}