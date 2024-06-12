import java.util.Scanner;
class Circle{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radius");
		double r=sc.nextDouble();
		double area=Math.PI*r*r;
		double perimeter=2*Math.PI*r;
		System.out.println("circle area:"+area);
		System.out.println("circle perimeter:"+perimeter);
	}
}