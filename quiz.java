import java.util.Scanner;
public class quiz{
public static void main(String [] args){
Scanner src = new Scanner(System.in);
int count = 0;
	System.out.println("Welcome to my quiz");
	System.out.println("Q1: is god real?");
	System.out.println("1. yes, 2.No,3. Dont Know");
	System.out.print("Answer:");
	int num1 = src.nextInt();
	if(num1 == 2){
		count++;
	}
	
	System.out.println("Q2: What Speak I fluent English?");
	System.out.println("1. yes, 2.No,3. Dont Know");
	System.out.print("Answer:");
	int num2 = src.nextInt();
	if(num2 == 1){
		count++;
	}
	
	System.out.println("Your result is: " + count*5 + " out of 10");
}
}