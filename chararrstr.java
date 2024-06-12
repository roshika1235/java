import java.util.*;
class chararrstr{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("no.of elements:");
		int num=sc.nextInt();
		char[] arr=new char[num];
		System.out.println("enter the chars");
		for(int i=0;i<num;i++){
			arr[i]=sc.next().charAt(0);
		}
		String str=new String(arr);
		System.out.println("conv str:"+ str);
	}
}