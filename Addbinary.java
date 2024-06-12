import java.util.Scanner;
class Addbinary{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("1st binary num");
		String binary1=sc.nextLine();
		System.out.println("2nd binary num");
		String binary2=sc.nextLine();
		int n1=Integer.parseInt(binary1,2);
		int n2=Integer.parseInt(binary2,2);
		int sum=n1+n2;
		String binarysum=Integer.toBinaryString(sum);
		System.out.println("sum of two binary nums:"+binarysum);
	}
}