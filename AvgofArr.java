import java.util.*;
class AvgofArr{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int[] n={1,2,3,4,5,6,7,8,9};
		int sum=0;
		for(int num:n){
			sum+=num;
		}
		double avg=(double) sum/n.length;
		System.out.println("average of an array:" +avg);
	}
}