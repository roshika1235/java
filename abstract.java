abstract class Motorbike{
	abstract void brake();
}
class Sportsbike extends Motorbike{
	public void brake(){
		System.out.println("sportsbike brake");
	}
}
class Mountainbike extends Motorbike{
	public void brake(){
		System.out.println("mountainbike brake");
	}
}
class Abstraction{
	public static void main(String[] args){
		Sportsbike s1=new Sportsbike();
		s1.brake();
		Mountainbike m1=new Mountainbike();
		m1.brake();
	}
}