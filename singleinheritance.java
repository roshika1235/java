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
class singleinheritance{
	public static void main(String args[]){
		dog d=new dog();
		d.eat();
		d.barks();
	}
}