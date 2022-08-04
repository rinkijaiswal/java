import java.io.*;
public class areaofsquare {
   public static void main(String args[]) throws IOException{
      int length, area;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter length:");
 	int Length=Integer.parseInt(br.readLine());
      area = Length* Length;
      System.out.println("Area of the square is ::"+area);
   }
}