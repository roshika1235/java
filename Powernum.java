import java.util.Scanner;
class Powernum{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		System.out.println("enter the power");
		int p=sc.nextInt();
		double x=Math.pow(n,p);
		System.out.println("power of the number:"+x);	
	}
}