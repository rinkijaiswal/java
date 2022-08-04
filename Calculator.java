import java.util.Scanner;
public class Calculator
{
public static void main(String[]args){
		char operator;
		int num1,num2;
		int result;
	Scanner input =new Scanner (System.in);
	System.out.println("Enter the Operator(+,-,*,/)");
	operator = input.next().charAt(0);
	System.out.println("Enter the two number one by one");
	num1=input.nextInt();
	num2=input.nextInt();
	switch(operator){
	case '+':
	result=num1+num2;
	System.out.println("sum is: "+result);
	break;
	case '-':
	result=num1-num2;
	System.out.println("sub is: "+result);
	break;
	case '*':
	result=num1*num2;
	System.out.println("mul is: "+result);
	break;
	case '/':
	result=num1/num2;
	System.out.println("div is: "+result);
	break; 
	default:
	System.out.println("operation is not valid");
	}
	}
}
