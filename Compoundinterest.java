import java.util.Scanner;
class Compoundinterest{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter principal amount");
		int p=sc.nextInt();
		System.out.println("enter rate");
		double r=sc.nextDouble()/100;
		System.out.println("enter no.of.times");
		int n=sc.nextInt();
		System.out.println("enter time");
		int t=sc.nextInt();
		double amount=p*Math.pow((1+r/n),n*t);
		System.out.println("Compound Interest:"+amount);
	}
}