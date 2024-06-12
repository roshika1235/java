import java.util.Scanner;
class Simpleinterest{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter principal amount");
		int p=sc.nextInt();
		System.out.println("enter rate");
		double r=sc.nextDouble()/100;
		System.out.println("enter time");
		int t=sc.nextInt();
		double SI=p*r*t/100;
		System.out.println("Simple Interest:"+SI);
	}
}