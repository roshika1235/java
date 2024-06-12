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
class cat extends Animal{
	public void meow(){
		System.out.println("meowooo....");
	}
}
class HI{
	public static void main(String args[]){
		cat bd=new cat();
		bd.eat();
		bd.meow();
	}
}