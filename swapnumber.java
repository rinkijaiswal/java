import java.io.*;
public class swapnumber 
{
 public static void main(String[] args)throws IOException 
 {
  int a, b, c;
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter Value in a :");
  a= Integer.parseInt(br.readLine());
  System.out.println("Enter Value in b :");
  b=Integer.parseInt(br.readLine());
  c=a;
  a=b;
  b=c;
  System.out.println("Values in a:" +a);
  System.out.println("Values in b:" +b);
 }
}