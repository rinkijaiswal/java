import java.util.Scanner;
public class StudentMarks
{
public static void main(String[]args)
{
	System.out.println("5th Subject");
Scanner sc=new Scanner(System.in);
System.out.println("maximum marks 100 in each subject:");
	System.out.println("1st subject marks:");
	int a= sc.nextInt();
	System.out.println("2nd subject marks:");
	int b=sc.nextInt();
	System.out.println("3th subject marks:");
	int c=sc.nextInt();
	System.out.println("4th subject marks:");
	int d=sc.nextInt();
	System.out.println("5th subject marks:");
	int e=sc.nextInt();
	int total=(a+b+c+d+e);
	System.out.println("Total Marks: " + total);
	int per = (total*100)/500;
	System.out.println("percentage: " + per + "%");

}
}
	
