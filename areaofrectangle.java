import java.io.*;
public class areaofrectangle
{
public static void main(String[]args)throws IOException
{
int length,breadth,area;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter length and breadth values");
 length=Integer.parseInt(br.readLine());
 breadth=Integer.parseInt(br.readLine());
area= length * breadth;
System.out.println("Area:="+area);

}
}
