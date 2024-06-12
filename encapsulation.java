class person{
	private String name;
	private int age;

	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age=age;
	}
}
class main{
	public static void main(String args[]){
		person p=new person();
		p.setName("rosh");
		p.setAge(19);
		System.out.println("name:"+p.getName());
		System.out.println("age:"+p.getAge());
	}
}