class Returntype{
	public static int square(int num){
	return num*num;
	}
	public static double triangle(int base,int height){
	return 0.5*base*height;
	}
	public static void main(String[] args){
	int result;
	result=square(10);
	System.out.println("square:"+result);
	double r1;
	r1=triangle(20,40);
	System.out.println("triangle:"+r1);
	}
}
