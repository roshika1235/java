class Addnum{
	public static int addnum(int a,int b){
		int sum=a+b;
		return sum;
	}
	public static void main(String[] args){
		int num1=12;
		int num2=36;
		Addnum obj=new Addnum();
		int result=obj.addnum(num1,num2);
		System.out.println("Sum:"+result);
	}
}
