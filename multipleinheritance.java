class Animal{
	public void eat(){
		System.out.println("eating....");
	}
}
class dog extends Animal{
	public void barks(){
		System.out.println("barking....");
	}
}
class babydog extends dog{
	public void sleep(){
		System.out.println("sleeping....");
	}
}
class multipleinheritance{
	public static void main(String args[]){
		babydog bd=new babydog();
		bd.eat();
		bd.barks();
		bd.sleep();
	}
}