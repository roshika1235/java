import java.util.Scanner;
class EvenorOdd{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num");
		int num=sc.nextInt();
		if(num%2==0){
			System.out.println("the number is Even");
		}
		else{
			System.out.println("the number is Odd");
		}
	}
}