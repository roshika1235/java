import java.util.*;
class mycalci{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the 1st num: ");
		double n1=sc.nextDouble();
		System.out.println("enter the 2nd num: ");
		double n2=sc.nextDouble();
		System.out.println("enter operator: ");
		char operator=sc.next().charAt(0);
		double result;
		switch(operator){
			case '+':
			result=n1+n2;
			System.out.println("addition: "+result);
			break;
			case '-':
			result=n1-n2;
			System.out.println("subtraction: "+result);
			break;
			case '*':
			result=n1*n2;
			System.out.println("multiplication: "+result);
			break;
			case '/':
			result=n1/n2;
			System.out.println("division: "+result);
			break;
		default:
			System.out.println("invalid operator");
		}
	}
}