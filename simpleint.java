import java.io.*;
public class simpleint
{
    public static void main(String args[])throws IOException
    {
        int p, r, t, s;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter Principal,Rate and Time: ");
        p = Integer.parseInt(br.readLine());
       	r = Integer.parseInt(br.readLine());
        t = Integer.parseInt(br.readLine());
        s = (p * r * t) / 100;
        System.out.println("Simple Interest is: " +s);
	
    }
}